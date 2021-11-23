
#include<stdio.h>
#include<Shain.h>
#include<WINDOWS.H>

char i;


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


char WINAPI Dll_Delete(char *MaxShain,short Id,SHAIN_DATA ShainData[])
{
	for(i=0; i<*MaxShain; i++)
	{
		if(Id == ShainData[i].Id)
		{
			memset(&ShainData[i],0,sizeof(SHAIN_DATA)*1);
		    memcpy(&ShainData[i],&ShainData[i+1],sizeof(SHAIN_DATA)*(*MaxShain-i));
			*MaxShain=*MaxShain-1;
		    return(OK);
		}	
	}
	if(Id != ShainData[i].Id)
	{
		return(NG);
	}
}

