class Sample3_5
{
	public static void main(String args[])
	{
		int i = Integer.parseInt(args[0]);	//ｷｰﾎﾞｰﾄﾞから入力された値をint型に変換する
		Kadai3_5 c = new Kadai3_5();		//Kadai3_5ｸﾗｽのｲﾝｽﾀﾝｽを生成する
		String kekka = c.k3_5(i);			//k3_5ﾒｿｯﾄﾞを実行する
		System.out.println("処理結果"+kekka+"です");
	}
}


class Kadai3_5
{
	String k3_5(int i)
	{
		Integer j = new Integer(i);		//Integerｸﾗｽのｲﾝｽﾀﾝｽを生成する
		return j.toString();			//IntegerｸﾗｽをStringｸﾗｽに変換する
	}
}

