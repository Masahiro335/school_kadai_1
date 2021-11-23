class RenMain2_5
{
	public static void main(String args[])
	{
		byte i = Byte.parseByte(args[0]);	//ｷｰﾎﾞｰﾄﾞから入力された値をbyte型に変換する
		byte j = Byte.parseByte(args[1]);
		Ren2_5 c=new Ren2_5();				//Ren2_5ｸﾗｽのｲﾝｽﾀﾝｽを生成する
		c.r2_5(i,j); 						//r2_5ﾒｿｯﾄﾞを実行する
		System.out.println(i+"+"+j+"="+c.kekka);
	}
}

class Ren2_5
{
	 /*ﾒｿｯﾄﾞ名	：Ren2_5
	  静的変数	：なし
	  ｲﾝｽﾀﾝｽ変数：int kekka
	  ﾒｿｯﾄﾞ名	：r2_5
	  処理概要	：引数p1と引数p2の加算結果をｲﾝｽﾀﾝｽ変数kekkaに設定する
	  引数		：p1:0から127までの数値
	  			  p2:0から127までの数値
	  戻り値	：なし*/ 
	int kekka;
	void r2_5(byte p1,byte p2)
	{
		kekka = p1 + p2;
	}
}


