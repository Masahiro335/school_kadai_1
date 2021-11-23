//本クラスは抽象クラスとする
abstract class Kadai5_6
{
	byte p1,p2;		//ｲﾝｽﾀﾝｽ変数を宣言する
	//ﾒｿｯﾄﾞ名 : k5_6_21
	void k5_6_1(byte a,byte b)
	{
		p1 = a;
		p2 = b;
	}
	//本ﾒｿｯﾄﾞはｻﾌﾞｸﾗｽ側で機能を実現する
	abstract int k5_6_2();
}

class Kadai5_6_1 extends Kadai5_6
{
	int k5_6_2()
	{
		return p1 + p2;
	}
}

class Kadai5_6_2 extends Kadai5_6
{
	int k5_6_2()
	{
		return p1 - p2;
	}
}

class Kadai5_6_3 extends Kadai5_6
{
	int k5_6_2()
	{
		return p1 * p2;
	}
}

class Kadai5_6_4 extends Kadai5_6
{
	int k5_6_2()
	{
		return p1 / p2;
	}
}

class Sample5_6
{
	public static void main(String args[])
	{
		Kadai5_6 c;					//Kadai5_6のｸﾗｽ変数を定義する
		char r = args[1].charAt(0);	//ｷｰﾎﾞｰﾄﾞから入力された演算子をchar型に変換する
		switch(r)
		{
			case	'+':
				c = new Kadai5_6_1();	//+ならKadai5_6_1ｸﾗｽのｲﾝｽﾀﾝｽを生成する
				break;
			case	'-':
				c = new Kadai5_6_2();	//-ならKadai5_6_2ｸﾗｽのｲﾝｽﾀﾝｽを生成する
				break;
			case	'x':
				c = new Kadai5_6_3();	//xならKadai5_6_3ｸﾗｽのｲﾝｽﾀﾝｽを生成する
				break;
			case	'/':
				c = new Kadai5_6_4();	//÷ならKadai5_6_4ｸﾗｽのｲﾝｽﾀﾝｽを生成する
				break;
			default:
				System.out.println("計算できません");
				return;
		}
		byte p1 = Byte.parseByte(args[0]);
		byte p2 = Byte.parseByte(args[2]);
		c.k5_6_1(p1,p2);			//Kadai5_6ｸﾗｽのk5_6_1ﾒｿｯﾄﾞを実行する
		int kekka = c.k5_6_2();		//k5_6_2ﾒｿｯﾄﾞを実行し、処理結果をディスプレイに表示する
		System.out.println(args[0]+args[1]+args[2]+"="+kekka);
	}
}


