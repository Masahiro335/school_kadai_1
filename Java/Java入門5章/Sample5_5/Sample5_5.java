//本クラスは抽象クラスとする
abstract class Kadai5_5
{
	byte p1,p2;		//ｲﾝｽﾀﾝｽ変数を宣言する
	//ﾒｿｯﾄﾞ名 : k5_5
	abstract int k5_5();
}

class Kadai5_5_1 extends Kadai5_5
{
	int k5_5()
	{
		return p1 + p2;
	}
}

class Kadai5_5_2 extends Kadai5_5
{
	int k5_5()
	{
		return p1 - p2;
	}
}

class Kadai5_5_3 extends Kadai5_5
{
	int k5_5()
	{
		return p1 * p2;
	}
}

class Kadai5_5_4 extends Kadai5_5
{
	int k5_5()
	{
		return p1 / p2;
	}
}

class Sample5_5
{
	public static void main(String args[])
	{
		Kadai5_5 c;					//Kadai5_5のｸﾗｽ変数を定義する
		char r = args[1].charAt(0);	//ｷｰﾎﾞｰﾄﾞから入力された演算子をchar型に変換する
		switch(r)
		{
			case	'+':
				c = new Kadai5_5_1();	//+ならKadai5_5_1ｸﾗｽのｲﾝｽﾀﾝｽを生成する
				break;
			case	'-':
				c = new Kadai5_5_2();	//+ならKadai5_5_2ｸﾗｽのｲﾝｽﾀﾝｽを生成する
				break;
			case	'x':
				c = new Kadai5_5_3();	//+ならKadai5_5_3ｸﾗｽのｲﾝｽﾀﾝｽを生成する
				break;
			case	'/':
				c = new Kadai5_5_4();	//+ならKadai5_5_4ｸﾗｽのｲﾝｽﾀﾝｽを生成する
				break;
			default:
				System.out.println("計算できません");
				return;
		}
		c.p1 = Byte.parseByte(args[0]);
		c.p2 = Byte.parseByte(args[2]);
		int kekka = c.k5_5();		//Kadai5_5ﾒｿｯﾄﾞを実行し、処理結果をディスプレイに表示する
		System.out.println(args[0]+args[1]+args[2]+"="+kekka);
	}
}


