class Sample3_4
{
	//ﾒｿｯﾄﾞ名	：main
	//処理名	：Kadai3_4ｸﾗｽのK3_4ﾒｿｯﾄﾞを実行し、戻り値をﾃﾞｨｽﾌﾟﾚｲに表示する
	//引数		：ｷｰﾎﾞｰﾄﾞから入力された数値
	//戻り値	：なし
	public static void main(String args[])
	{
		int i = Integer.parseInt(args[0]);	//ｷｰﾎﾞｰﾄﾞから入力された値をint型に変換する
		Kadai3_4 c = new Kadai3_4();		//Kadai3_4ｸﾗｽのｲﾝｽﾀﾝｽを生成する
		String kekka = c.k3_4(i);			//k3_4ﾒｿｯﾄﾞを実行する
		System.out.println(i+"を16進に変換すると"+kekka+"です");
	}
}


class Kadai3_4
{
	//ﾒｿｯﾄﾞ		:k3_4
	//処理概要	:引数iを16進に変換し、Stringｵﾌﾞｼﾞｪｸﾄにして戻り値に設定する
	//引数		:i=int型の数値
	//戻り値	:引数iを16進に変換したStringｵﾌﾞｼﾞｪｸﾄ
	String k3_4(int i)
	{
		return Integer.toHexString(i);	//引数で指定された値を16進に変換する
	}
}

