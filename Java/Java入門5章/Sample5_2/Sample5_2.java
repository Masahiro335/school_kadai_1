class Kadai5_2_1
{
	byte p1,p2;
	int k5_2_1()
	{
		return(p1+p2);
	}
}

class Kadai5_2_2 extends Kadai5_2_1
{
	int k5_2_2()
	{
		return(p1-p2);
	}
}

class Kadai5_2_3 extends Kadai5_2_2
{
	int k5_2_3()
	{
		return(p1*p2);
	}
}

class Kadai5_2_4 extends Kadai5_2_3
{
	int k5_2_4()
	{
		return(p1/p2);
	}
}

class Sample5_2
{
	public static void main(String args[])
	{
		int kekka;
		Kadai5_2_4 c = new Kadai5_2_4();	//Kadai5_2_4クラスのインスタンスを生成する
		c.p1 = Byte.parseByte(args[0]);		//キーボードから入力された値をbyte型に変換する
		char r = args[1].charAt(0);			//キーボードから入力された値をchar型に変換する
		c.p2 = Byte.parseByte(args[2]);		//キーボードから入力された値をbyte型に変換する
		switch(r)
		{
			case	'+':	//加算
				kekka = c.k5_2_1();		//加算を行うk5_2_1ﾒｿｯﾄﾞを実行する
				break;
			case	'-':	//減算
				kekka = c.k5_2_2();		//減算を行うk5_2_2ﾒｿｯﾄﾞを実行する
				break;
			case	'x':	//乗算
				kekka = c.k5_2_3();		//乗算を行うk5_2_3ﾒｿｯﾄﾞを実行する
				break;
			case	'/':	//除算
				kekka = c.k5_2_4();		//除算を行うk5_2_4ﾒｿｯﾄﾞを実行する
				break;
			default:	//上記以外
				System.out.println("計算できません");
				return;
		}
		//演算結果をディスプレイに表示する
		System.out.println(args[0]+args[1]+args[2]+"="+kekka);
		
	}
}
