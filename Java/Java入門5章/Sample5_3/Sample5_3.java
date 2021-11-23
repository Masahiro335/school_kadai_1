class Kadai5_3_1
{
	int code;
	//Kadai5_3_1ｸﾗｽのｺﾝｽﾄﾗｸﾀ
	Kadai5_3_1(int p1)
	{
		code = p1;
	}
}

class Kadai5_3_2 extends Kadai5_3_1
{
	String name;
	//Kadai5_3_2ｸﾗｽのｺﾝｽﾄﾗｸﾀ
	Kadai5_3_2(int p1,String p2)
	{
		super(p1);		//Kadai5_3_1ｸﾗｽのｺﾝｽﾄﾗｸﾀを実行する
		name = p2;
	}
}

class Kadai5_3_3 extends Kadai5_3_2
{
	byte age;
	//Kadai5_3_3ｸﾗｽのｺﾝｽﾄﾗｸﾀ
	Kadai5_3_3(int p1,String p2,byte p3)
	{
		super(p1,p2);		//Kadai5_3_2ｸﾗｽのｺﾝｽﾄﾗｸﾀを実行する
		age = p3;
	}
}

class Sample5_3
{
	public static void main(String args[])
	{
		int p1 = Integer.parseInt(args[0]);
		byte p3 = Byte.parseByte(args[2]);
		Kadai5_3_3 c = new Kadai5_3_3(p1,args[1],p3);
		System.out.println("処理結果");
		System.out.println("番号:"+c.code);
		System.out.println("名前:"+c.name);
		System.out.println("年齢:"+c.age);
	}
}

