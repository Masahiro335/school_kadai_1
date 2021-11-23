class RenMain2_1
{
	public static void main(String args[])
	{
		byte i = Byte.parseByte(args[0]);	//ｷｰﾎﾞｰﾄﾞから入力された値をbyte型に変換する
		byte j = Byte.parseByte(args[1]);
		int kekka = Ren2_1.r2_1(i,j);		//Ren2_1ｸﾗｽのr2_1ﾒｿｯﾄﾞを実行する
											//r2_1ﾒｿｯﾄﾞの実行結果をﾃﾞｨｽﾌﾟﾚｲに表示する
		System.out.println(i+"+"+j+"="+kekka);
	}	
}

class Ren2_1
{
	  /*名称	：Ren2_1
	  静的変数	：なし
	  ｲﾝｽﾀﾝｽ変数：なし
	  ﾒｿｯﾄﾞ名	：r2_1
	  処理概要	：引数p1と引数p2の加算結果を戻り値に設定する。
	  引数		：p1:0から127までの数値
	  			  p2:0から127までの数値
	  戻り値	：p1とp2を足した数*/
	  
	static int r2_1(byte p1,byte p2)
	{
		int total = 0;
		total = p1 + p2;
		return total;	//処理結果を戻り値にする
	}
}
