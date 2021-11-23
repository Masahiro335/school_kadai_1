class Sample1_2
{
	public static void main(String args[])
	{
		int p1 = Integer.parseInt(args[0]);
		if(p1>0 && p1<4)	
		{
			Interface1_2 c;		//ｸﾗｽ変数を用意する
			switch(p1)			//ｷｰﾎﾞｰﾄﾞから入力された値(部署ｺｰﾄﾞ)により分岐する
			{
				case 1:		//総務部の場合
					c = new Kadai1_2_1();
					break;
				case 2:		//経理部の場合
					c = new Kadai1_2_2();
					break;
				default:		//その他(営業部)の場合
					c = new Kadai1_2_3();
			}
			String kekka = c.r1_2();	//r1_2ﾒｿｯﾄﾞを実行し、結果をﾃﾞｨｽﾌﾟﾚｲに表示する
			System.out.println(kekka);
		}
		else	//ｷｰﾎﾞｰﾄﾞから入力された値が1から3以外の場合
		{
			System.out.println("該当する部署が見つかりません");
		}
	}
}

//Interfaceの宣言
interface Interface1_2
{
	int Shain[] = {10,3,17};	//部署ｺｰﾄﾞ毎の社員数
	String r1_2();				//ﾒｿｯﾄﾞの宣言
}

//Kadai1_2_1ｸﾗｽはInterface1_2ｲﾝﾀﾌｧｲｽを実装する
class Kadai1_2_1 implements Interface1_2
{
	//総務部の社員数を表示する
	public String r1_2()
	{
		return "総務部の社員は"+Shain[0]+"人です。";
	}
}	

//Kadai1_2_2ｸﾗｽはInterface1_2ｲﾝﾀﾌｪｲｽを実装する
class Kadai1_2_2 implements Interface1_2
{
	//経理部の社員数を表示する
	public String r1_2()
	{
		return "経理部の社員は"+Shain[1]+"人です。";
	}
}

//Kadai1_2_3ｸﾗｽはInterface1_2ｲﾝﾀﾌｪｲｽを実装する
class Kadai1_2_3 implements Interface1_2
{
	//営業部の社員数を表示する
	public String r1_2()
	{
		return "営業部の社員は"+Shain[2]+"人です。";
	}
}

