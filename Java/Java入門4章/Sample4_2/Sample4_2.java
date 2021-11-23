class Kadai4_2
{
	String name;	//氏名
	int age;		//年齢
	char seibetsu;	//性別
	//Kadai4_2ｸﾗｽのｺﾝｽﾄﾗｸﾀ
	Kadai4_2(String n)
	{
		name = n;	//氏名を初期化
	}
	void k4_2(int p1,char p2)
	{
		age = p1;		//年齢を設定する
		seibetsu = p2;	//性別を設定する
	}
}

class Sample4_2
{
	public static void main(String args[])
	{
		int p1 = Integer.parseInt(args[1]);
		char p2 = args[2].charAt(0);
		Kadai4_2 c = new Kadai4_2(args[0]);		//Kadai4_2ｸﾗｽのｺﾝｽﾄﾗｸﾀを実行
		c.k4_2(p1,p2);							//Kadai4_2ｸﾗｽのk4_2ﾒｿｯﾄﾞを実行
		System.out.println("処理結果");			//Kadai4_2ｸﾗｽのｲﾝｽﾀﾝｽ変数の値をﾃﾞｨｽﾌﾟﾚｲに表示
		System.out.println("氏名:"+c.name);
		System.out.println("年齢:"+c.age);
		System.out.println("性別:"+c.seibetsu);
	}
}


