class Sample3_2
{

	public static void main(String args[])
	{
		Kadai3_2 c = new Kadai3_2();	//Kadai3_2ｸﾗｽのｲﾝｽﾀﾝｽを生成する
		String kekka = c.k3_2(args[0]);	//k3_2ﾒｿｯﾄﾞを実行する
		//k3_2ﾒｿｯﾄﾞの実行結果をﾃﾞｨｽﾌﾟﾚｲに表示する
		System.out.println("ｷｰﾎﾞｰﾄﾞから入力された文字数は"+kekka+"です");
	}
}


class Kadai3_2
{

	String k3_2(String moji)
	{
		return moji.toLowerCase();	//引数で指定されたStringｵﾌﾞｼﾞｪｸﾄの文字数を
									//戻り値に設定する
	}
}

