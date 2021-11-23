
#include<stdio.h>
#include<Shain.h>
#include<WINDOWS.H>

char i,j;


char WINAPI Dll_FileRead(char F_Name[],void*ShainInfo,unsigned short R_Size,char Record)
{

		FILE *fp;
	/*ﾌｧｲﾙを既存ﾓｰﾄﾞでｵｰﾌﾟﾝする*/
	if(fopen_s(&fp,F_Name,"rb+")!=0)
	{
			return(NG);/*新規ﾓｰﾄﾞでもｵｰﾌﾟﾝできなければ、処理結果をNGとする*/
	}
	
	/*ﾌｧｲﾙの書込み位置を移動する*/
	if(fseek(fp,R_Size*Record,SEEK_SET)!=0)
	{
		fclose(fp);		/*ﾌｧｲﾙﾎﾟｲﾝﾀが移動できなければ処理結果をNGとする*/
		return(NG);
	}
	
	/*ﾌｧｲﾙから1人分ﾃﾞｰﾀを読込む*/
	if(fread(ShainInfo,sizeof(char),R_Size,fp)!= R_Size)
	{
		/*読込みに失敗したらﾌｧｲﾙの終端ﾁｪｯｸを行う*/
		if(feof(fp)==0)
		{
			/*ﾌｧｲﾙの終端でなければ処理結果をNGとする*/
			fclose(fp);
			return(NG);
		}
			/*ﾌｧｲﾙの終端なら処理結果をEOFとする*/
	     	fclose(fp);
	    	return(EOF); /*EOFはstdio.h ﾍｯﾀﾞｰﾌｧｲﾙに定義されている定数です*/
	}
			/*ﾌｧｲﾙをｸﾛｰｽﾞする*/
	     	fclose(fp);
			return(OK);

}

//引数で指定された条件に該当する社員の平均年齢を戻り値に設定する。
float WINAPI Dll_Average(char Req,char *MaxShain,char Section,SHAIN_DATA ShainData[])
{
	float Average = 0;
	char Count=0;


	switch(Req)
	{
		case 1: //全社員の平均年齢
			for(i=0; i<*MaxShain; i++)
			{
				Average = Average + ShainData[i].Age;
				Count++;
			}
			break;	
		case 2: //男性社員の平均年齢
			for(i=0; i<*MaxShain; i++)
			{
				if(ShainData[i].Seibetsu == MAN)
				{
					Average = Average + ShainData[i].Age;
					Count++;
				}		
			}
			break;			
		case 3: //女性社員の平均年齢
			for(i=0; i<*MaxShain; i++)
			{
				if(ShainData[i].Seibetsu == WOMAN)
				{
					Average = Average + ShainData[i].Age;
					Count++;
				}		
			}
			break;
		case 4: //部署ｺｰﾄﾞ(Section)に該当する社員の平均年齢
			for(i=0; i<*MaxShain; i++)
			{
				if(ShainData[i].Section == Section)
				{
					Average = Average + ShainData[i].Age;
					Count++;
				}
			}
			break;		
		default :
			return(NG);			
	}
	if(Count==0)
	{
		return(NG);
	}
	Average = Average / Count;	//平均年齢
	*MaxShain=Count;			//社員数
	return(Average);
}
	
//引数で指定された条件に該当する社員の社員番号を戻り値に設定する		
short WINAPI Dll_Find(char Req,char MaxShain,SHAIN_DATA ShainData[])
{
		char a = 0;		
		
		switch(Req)
		{
			case 1: //最高齢の社員番号
				for(i=1; i<MaxShain; i++)
				{
					if(ShainData[i].Age > ShainData[a].Age)
					{
						a = i;
					}	
				}
				break;
				
			case 2: //最年少の社員番号
				for(i=1; i<MaxShain; i++)
				{
					if(ShainData[i].Age < ShainData[a].Age)
					{
						a = i;
					}	
				}
				break;
			
			default:
				return(NG);	
		}
			return(ShainData[a].Id);
}

//引数で指定された社員情報(ShainInfo)を社員名簿に追加
char WINAPI Dll_Insert(char *MaxShain,SHAIN_DATA *ShainInfo,SHAIN_DATA ShainData[])
{
	for(i=0; i<*MaxShain; i++)
	{
		if(ShainInfo->Id < ShainData[i].Id)
		{
			//追加した社員情報をId順に並び変える
			memcpy(&ShainData[i+1],&ShainData[i],sizeof(SHAIN_DATA)*(*MaxShain-i));
			break;
		}
		else if(ShainInfo->Id == ShainData[i].Id)
		{
			//社員情報と社員名簿のIDが同じの場合、社員名簿に上書き
			ShainData[i] = *ShainInfo;
			return(i);
		}
		
	}
	ShainData[i] = *ShainInfo;	//社員情報のIdを追加
	*MaxShain = *MaxShain + 1;
	return(i+1);
}

//引数で指定された社員情報を社員名簿から削除する
char WINAPI Dll_Delete(char *MaxShain,short Id,SHAIN_DATA ShainData[])
{
	for(i=0; i<*MaxShain; i++)
	{
		//社員名簿と引数Idが同じ場合
		if(Id == ShainData[i].Id)
		{
			//引数Idの社員名簿を削除
			memset(&ShainData[i],0,sizeof(SHAIN_DATA)*1);
			//引数Idの次の番号の社員名簿をIdの番号にコピー
		    memcpy(&ShainData[i],&ShainData[i+1],sizeof(SHAIN_DATA)*(*MaxShain-i));
			*MaxShain=*MaxShain-1;
		    return(OK);
		}
	}
		return(NG);
}


//引数で指定された条件によって社員情報の並び替えを行なう。
void WINAPI Dll_Sort(char Req,char MaxShain,char Option,SHAIN_DATA ShainData[])
{
	SHAIN_DATA temp;
  	SHAIN_DATA Temp[MAX_SHAIN];
    char x = 0;
	char y = 0;
	
	switch(Req)
	{
		case 1:	//年齢順
			if(Option==0)	//降順
			{
				for(j=MaxShain-1; j>0; j--)
				{
					for(i=0; i<j; i++)
					{
						if(ShainData[i].Age < ShainData[i+1].Age)
						{
							temp = ShainData[i];
							ShainData[i] = ShainData[i+1];
							ShainData[i+1] = temp;
						}
					}
				}
			}
		    else if(Option==1)	//昇順
			{
				for(j=MaxShain-1; j>0; j--)
				{
					for(i=0; i<j; i++)
					{
						if(ShainData[i].Age > ShainData[i+1].Age)
						{
							temp = ShainData[i];
							ShainData[i] = ShainData[i+1];
							ShainData[i+1] = temp;
						}
					}
				}
			}
			break;
		case 2:	//性別順
			for(i=0; i<MaxShain; i++)
			{
				/*Optionの性別が一致する*/
				if(ShainData[i].Seibetsu == Option)
				{
					ShainData[x] = ShainData[i];
					x = x + 1;
				}
				else if(ShainData[i].Seibetsu != Option)
				{
					Temp[y] = ShainData[i];
					y++;
				}
			}	
			if(y != 0)
			{	
				memcpy(&ShainData[x],&Temp[0],sizeof(SHAIN_DATA)*y);
			}
			break;
		case 3:	//部署ｺｰﾄﾞ順
			for(j=MaxShain-1; j>0; j--)
			{
				for(i=0; i<j; i++)
				{
					if(ShainData[i].Section > ShainData[i+1].Section)
					{
						temp = ShainData[i];
						ShainData[i] = ShainData[i+1];
						ShainData[i+1] = temp;
					}
				}
			}
			break;
		case 4:	//社員番号順(昇順)
			for(j=MaxShain-1; j>0; j--)
			{
				for(i=0; i<j; i++)
				{
					if(ShainData[i].Id > ShainData[i+1].Id)
					{
						temp = ShainData[i];
						ShainData[i] = ShainData[i+1];
						ShainData[i+1] = temp;
					}
				}
			}
			break;
	}
}

/*引数(F_Name)で指定されたファイルの、引数(Record)で指定された位置、
引数(ShainInfo)で指定された1件分の社員情報を書込む*/
char WINAPI Dll_FileWrite(char F_Name[],void *ShainInfo,unsigned short W_Size,char Record)
{
	FILE *fp;
	/*ﾌｧｲﾙを既存ﾓｰﾄﾞでｵｰﾌﾟﾝする*/
	if(fopen_s(&fp,F_Name,"rb+")!=0)
	{
		/*既存ﾓｰﾄﾞでｵｰﾌﾟﾝできなければ新規ﾓｰﾄﾞでｵｰﾌﾟﾝする*/
		if(fopen_s(&fp,F_Name,"wb")!=0)
		{
			return(NG);	/*新規ﾓｰﾄﾞでもｵｰﾌﾟﾝできなければ、処理結果をNGとする*/
		}
	}
	/*ﾌｧｲﾙの書込み位置を移動する*/
	if(fseek(fp,W_Size*Record,SEEK_SET)!=0)
	{
		fclose(fp);	/*ﾌｧｲﾙﾎﾟｲﾝﾀが移動できなければ処理結果をNGとする*/
		return(NG);
	}
	/*ﾌｧｲﾙに1人分の社員ﾃﾞｰﾀを書き込む*/
	if(fwrite(ShainInfo,sizeof(char),W_Size,fp)!=W_Size)
	{
		fclose(fp);	/*書き込みｴﾗｰなら処理結果をNGとする*/
		return(NG);
	}
 		/*ﾌｧｲﾙをｸﾛｰｽﾞする*/
		fclose(fp);
		/*処理結果をOKとする*/
		return(OK);	
}

//引数で指定された条件に該当する全ての社員情報を、引数(ShainData)に設定する
char WINAPI Dll_Find_2(char Option1,char Option2,char *Option3[],char MaxShain,SHAIN_DATA ShainData[])
{
	char Count=0;
	char kekka;

	for(i=0; i<MaxShain; i++)
	{
		switch(Option1)	
		{
			case 1:	//性別
				if(ShainData[i].Seibetsu==Option2)	
				{
					ShainData[Count] = ShainData[i];
					Count++;
				}
				break;
			case 2:	//部署
				if(ShainData[i].Section==Option2)	
				{
					ShainData[Count] = ShainData[i];
					Count++;
				}
				break;
			case 3:	//都道府県
				kekka = strncmp(&ShainData[i].Address[12],*Option3,6);
				if(kekka==0)
				{
					ShainData[Count] = ShainData[i];
					Count++;
				}
				break;
		}
	}
	if(Count==0)
	{
		return(0);
	}
		return(Count);	//該当する社員数
}

