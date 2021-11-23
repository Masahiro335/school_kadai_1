class Kadai5_4_1
{
	byte p1,p2;
	int k5_4()
	{
		return p1+p2;
	}
}

class Kadai5_4_2 extends Kadai5_4_1
{
	int k5_4()
	{
		return p1-p2;
	}
}

class Kadai5_4_3 extends Kadai5_4_2
{
	int k5_4()
	{
		return p1*p2;
	}
}

class Kadai5_4_4 extends Kadai5_4_3
{
	int k5_4()
	{
		return p1/p2;
	}
}

class Sample5_4
{
	public static void main(String args[])
	{
		Kadai5_4_1 c;						//Kadai5_4_4クラスのインスタンスを生成する
		char r = args[1].charAt(0);			//ｷｰﾎﾞｰﾄﾞから入力された演算子をchar型に変換する
		switch(r)
		{
			case	'+':	//加算
				c = new Kadai5_4_1();		//+ならKadai5_4_1ｸﾗｽのｲﾝｽﾀﾝｽを生成する
				break;
			case	'-':	//減算
				c = new Kadai5_4_2();		//-ならKadai5_4_2ｸﾗｽのｲﾝｽﾀﾝｽを生成する
				break;
			case	'x':	//乗算
				c = new Kadai5_4_3();		//xならKadai5_4_3ｸﾗｽのｲﾝｽﾀﾝｽを生成する
				break;
			case	'/':	//除算
				c = new Kadai5_4_4();		//÷ならKadai5_4_4ｸﾗｽのｲﾝｽﾀﾝｽを生成する
				break;
			default:	//上記以外
				System.out.println("計算できません");
				return;
		}
		c.p1 = Byte.parseByte(args[0]);
		c.p2 = Byte.parseByte(args[2]);
		int kekka = c.k5_4();		//k5_4ﾒｿｯﾄﾞを実行し、処理結果をディスプレイに表示する
		//演算結果をディスプレイに表示する
		System.out.println(args[0]+args[1]+args[2]+"="+kekka);	
	}
}
