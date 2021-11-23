//本ｸﾗｽはsuperｸﾗｽとする
class Kadai5_1_1
{
	int code;
}

//本ｸﾗｽはKadai5_1_1ｸﾗｽのｻﾌﾞｸﾗｽとする
class Kadai5_1_2 extends Kadai5_1_1
{
	String name;
}

//本ｸﾗｽはKadai5_1_2ｸﾗｽのｻﾌﾞｸﾗｽとする
class Kadai5_1_3 extends Kadai5_1_2
{
	byte age;
}

class Sample5_1
{
	public static void main(String args[])
	{
		if(args.length>0 && args.length<4)
		{
			Kadai5_1_3 c = new Kadai5_1_3();
			System.out.println("処理結果");
			switch(args.length)
			{
				case 1:		//番号のみ
					//番号をint型に変換し、Kadai5_1_3ｸﾗｽのｲﾝｽﾀﾝｽ変数codeに設定する
					c.code = Integer.parseInt(args[0]);
					//Kadai5_1_3ｸﾗｽのｲﾝｽﾀﾝｽ変数の値をﾃﾞｨｽﾌﾟﾚｲに表示する
					System.out.println("番号:"+c.code);
					break;
				case 2:		//番号と氏名のみ
					//番号をint型に変換し、Kadai5_1_3ｸﾗｽのｲﾝｽﾀﾝｽ変数codeに設定する
					c.code = Integer.parseInt(args[0]);
					//氏名をKadai5_1_3ｸﾗｽのｲﾝｽﾀﾝｽ変数nameに設定する
					c.name = args[1];
					//Kadai5_1_3ｸﾗｽのｲﾝｽﾀﾝｽ変数の値をﾃﾞｨｽﾌﾟﾚｲに表示する
					System.out.println("番号:"+c.code);
					System.out.println("氏名:"+c.name);
					break;
				case 3:		//番号、氏名、年齢
					//番号をint型に変換し、Kadai5_1_3ｸﾗｽのｲﾝｽﾀﾝｽ変数codeに設定する
					c.code = Integer.parseInt(args[0]);
					//氏名をKadai5_1_3ｸﾗｽのｲﾝｽﾀﾝｽ変数nameに設定する
					c.name = args[1];
					//年齢をbyte型に変換し、Kadai5_1_3ｸﾗｽのｲﾝｽﾀﾝｽ変数ageに変更する
					c.age = Byte.parseByte(args[2]);
					//Kadai5_1_3ｸﾗｽのｲﾝｽﾀﾝｽ変数の値をﾃﾞｨｽﾌﾟﾚｲに表示する
					System.out.println("番号:"+c.code);
					System.out.println("氏名:"+c.name);
					System.out.println("年齢:"+c.age);
			}
		}
	}
}

