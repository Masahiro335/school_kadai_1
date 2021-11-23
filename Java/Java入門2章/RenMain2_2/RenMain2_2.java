class RenMain2_2
{
	public static void main(String args[])
	{
		byte i = Byte.parseByte(args[0]);	//ｷｰﾎﾞｰﾄﾞから入力された値をbyte型に変換する
		byte j = Byte.parseByte(args[1]);
		Ren2_2.r2_2(i,j);					//Ren2_2ｸﾗｽのr2_2ﾒｿｯﾄﾞを実行する
											//r2_2ﾒｿｯﾄﾞの実行結果をﾃﾞｨｽﾌﾟﾚｲに表示する
		System.out.println(i+"+"+j+"="+Ren2_2.kekka);
	}	
}

class Ren2_2
{
	  /*名称	：Ren2_2
	  静的変数	：static int kekka
	  ｲﾝｽﾀﾝｽ変数：なし
	  ﾒｿｯﾄﾞ名	：r2_2
	  処理概要	：引数p1と引数p2の加算結果を静的変数kekkaに設定する。
	  引数		：p1:0から127までの数値
	  			  p2:0から127までの数値
	  戻り値	：p1とp2を足した数*/
	static int kekka;
	static void r2_2(byte p1,byte p2)
	{
		kekka = p1 + p2;
	}
}
