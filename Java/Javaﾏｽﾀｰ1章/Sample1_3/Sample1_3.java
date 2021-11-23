class Sample1_3
{
	public static void main(String args[])
	{
		int p1 = Integer.parseInt(args[0]);
		int p2 = Integer.parseInt(args[1]);
		if(p1>0 && p1<4)	
		{
			Interface1_3 c;		//ｸﾗｽ変数を用意する
			switch(p1)			//ｷｰﾎﾞｰﾄﾞから入力された値(部署ｺｰﾄﾞ)により分岐する
			{
				case 1:		//総務部の場合
					c = new Kadai1_3_1();
					break;
				case 2:		//経理部の場合
					c = new Kadai1_3_2();
					break;
				default:	//その他(営業部)の場合
					c = new Kadai1_3_3();
			}
			String kekka = c.r1_3(p2);	//r1_3ﾒｿｯﾄﾞを実行し、結果をﾃﾞｨｽﾌﾟﾚｲに表示する
			System.out.println(kekka);
		}
		else	//ｷｰﾎﾞｰﾄﾞから入力された値が1から3以外の場合
		{
			System.out.println("該当する部署が見つかりません");
		}
	}
}

//Interfaceの宣言
interface Interface1_3
{
	String r1_3(int a);
}

//Kadai1_3_1ｸﾗｽはInterface1_3ｲﾝﾀﾌｧｲｽを実装する
class Kadai1_3_1 implements Interface1_3
{
	//総務部の社員数を表示する
	public String r1_3(int a)
	{
		return "総務部の社員は"+a+"人です。";
	}
}	

//Kadai1_3_2ｸﾗｽはKadai1_3_1ｲﾝﾀﾌｪｲｽを実装する
class Kadai1_3_2 extends Kadai1_3_1
{
	//経理部の社員数を表示する
	public String r1_3(int a)
	{
		return "経理部の社員は"+a+"人です。";
	}
}

//Kadai1_3_3ｸﾗｽはKadai1_3_1ｲﾝﾀﾌｪｲｽを実装する
class Kadai1_3_3 extends Kadai1_3_1
{
	//営業部の社員数を表示する
	public String r1_3(int a)
	{
		return "営業部の社員は"+a+"人です。";
	}
}

