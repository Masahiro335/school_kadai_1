//Interfaceの宣言
interface InterfaceR1_1
{
	int r1_1(byte p1,byte p2);
}
//Ren1_1_1ｸﾗｽはInterfaceR1_1を実装する
class Ren1_1_1 implements InterfaceR1_1
{
	public int r1_1(byte p1,byte p2)
	{
		return p1+p2;
	}
}	

//Ren1_1_2ｸﾗｽはRen1_1_1を継承する
class Ren1_1_2 extends Ren1_1_1
{
	public int r1_1(byte p1,byte p2)
	{
		return p1-p2;
	}
}

//Ren1_1_3ｸﾗｽはRen1_1_2を継承する
class Ren1_1_3 extends Ren1_1_2
{
	public int r1_1(byte p1,byte p2)
	{
		return p1*p2;
	}
}

//Ren1_1_4ｸﾗｽはRen1_1_3を継承する
class Ren1_1_4 extends Ren1_1_3
{
	public int r1_1(byte p1,byte p2)
	{
		return p1/p2;
	}
}

class RenMain1_1
{
	public static void main(String args[])
	{
		InterfaceR1_1 c;
		char r = args[1].charAt(0);	
		switch(r)
		{
			case	'+':
				c = new Ren1_1_1();
				break;
			case	'-':
				c = new Ren1_1_2();
				break;
			case	'x':
				c = new Ren1_1_3();
				break;
			case	'/':
				c = new Ren1_1_4();
				break;
			default:
				System.out.println("計算できません");
				return;
		}
		byte p1 = Byte.parseByte(args[0]);
		byte p2 = Byte.parseByte(args[2]);
		c.r1_1(p1,p2);			
		int kekka = c.r1_1(p1,p2);	
		System.out.println(args[0]+args[1]+args[2]+"="+kekka);
	}
}


