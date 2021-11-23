class Kadai4_1
{
	String name;	//氏名
	int age;		//年齢
	char seibetsu;	//性別
	//Kadai4_1ｸﾗｽのｺﾝｽﾄﾗｸﾀ
	Kadai4_1(String p1,int p2,char p3)
	{
		name = p1;		//氏名を初期化
		age = p2;		//年齢を初期化
		seibetsu = p3;	//性別を初期化
	}
}

class Sample4_1
{
	public static void main(String args[])
	{
		int p2 = Integer.parseInt(args[1]);
		char p3 = args[2].charAt(0);
		Kadai4_1 c = new Kadai4_1(args[0],p2,p3);	//Kadai4_1ｸﾗｽのｺﾝｽﾄﾗｸﾀを実行する
		System.out.println("処理結果");				//Kadai4_1ｸﾗｽのｲﾝｽﾀﾝｽ変数の値をﾃﾞｨｽﾌﾟﾚｲに表示する
		System.out.println("氏名:"+c.name);
		System.out.println("年齢:"+c.age);
		System.out.println("性別:"+c.seibetsu);
	}
}

