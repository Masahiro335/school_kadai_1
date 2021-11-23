class RenMain2_3
{
	static int kekka;
	public static void main(String args[])
	{
		byte i = Byte.parseByte(args[0]);	//ｷｰﾎﾞｰﾄﾞから入力された値をbyte型に変換する
		byte j = Byte.parseByte(args[1]);
		Ren2_3.r2_3(i,j);					//Ren2_3ｸﾗｽのr2_3ﾒｿｯﾄﾞを実行し、kekkaの値をﾃﾞｨｽﾌﾟﾚｲに表示する
		System.out.println(i+"+"+j+"="+kekka);
	}
}

class Ren2_3
{
	  /*名称	：Ren2_3
	  静的変数	：なし
	  ｲﾝｽﾀﾝｽ変数：なし
	  ﾒｿｯﾄﾞ名	：r2_3
	  処理概要	：引数p1と引数p2の加算結果をRenMain2_3ｸﾗｽの静的変数kekkaに設定する。
	  引数		：p1:0から127までの数値
	  			  p2:0から127までの数値
	  戻り値	：なし*/
	static void r2_3(byte p1,byte p2)
	{
		RenMain2_3.kekka = p1 + p2;
	}
}
