//本クラスは抽象クラスとする
abstract class Ren5_2
{
	int Shain[] = {10,3,17};				//部署ｺｰﾄﾞ毎社員数
	abstract String r5_2(int r,int a);		//抽象ﾒｿｯﾄﾞ
}

class Ren5_2_1 extends Ren5_2
{
	String r5_2(int r,int a)
	{
		return "総務部の社員は"+Shain[a]+"人です";
	}
}

class Ren5_2_2 extends Ren5_2
{
	String r5_2(int r,int a)
	{
		return "経理部の社員は"+Shain[a]+"人です";
	}
}

class Ren5_2_3 extends Ren5_2
{
	String r5_2(int r,int a)
	{
		return "営業部の社員は"+Shain[a]+"人です";
	}
}

class RenMain5_2
{
	public static void main(String args[])
	{
		Ren5_2 c;
		int r = Integer.parseInt(args[0]);
		int a = r-1;
		switch(r)
		{
			case	1:
				c = new Ren5_2_1();	
				break;
			case	2:
				c = new Ren5_2_2();	
				break;
			case	3:
				c = new Ren5_2_3();	
				break;
			default:
				System.out.println("計算できません");
				return;
		}
		String kekka = c.r5_2(r,a);
		System.out.println(kekka);
	}
}


