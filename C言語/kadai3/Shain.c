
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
