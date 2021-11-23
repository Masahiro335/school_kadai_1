class RenMain2_4
{
	public static void main(String args[])
	{
		byte i = Byte.parseByte(args[0]);	//ｷｰﾎﾞｰﾄﾞから入力された値をbyte型に変換する
		byte j = Byte.parseByte(args[1]);
		Ren2_4 c=new Ren2_4();				//Ren2_4ｸﾗｽのｲﾝｽﾀﾝｽを生成する
		int kekka = c.r2_4(i,j); 			//r2_4ﾒｿｯﾄﾞを実行し、処理結果をﾃﾞｨｽﾌﾟﾚｲに表示する
		System.out.println(i+"+"+j+"="+kekka);
	}
}

class Ren2_4
{
	  /*名称	：Ren2_4
	  静的変数	：なし
	  ｲﾝｽﾀﾝｽ変数：なし
	  ﾒｿｯﾄﾞ名	：r2_4
	  処理概要	：引数p1と引数p2の加算結果を戻り値に設定する。
	  引数		：p1:0から127までの数値
	  			  p2:0から127までの数値
	  戻り値	：なし*/
	int r2_4(byte p1,byte p2)
	{
		int total = 0;
		total = p1 + p2;
		return(total);
	}
}

