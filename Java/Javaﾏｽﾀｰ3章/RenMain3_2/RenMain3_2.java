class RenMain3_2
{
	public static void main(String args[])
	{
		try
		{
		int p1 = Integer.parseInt(args[0]);
		int p2 = Integer.parseInt(args[1]);
		Ren3_2 c = new Ren3_2();
		c.r3_2(p1,p2);
		}
		catch(NumberFormatException e)
		{
			//例外が発生した場合
			System.out.println("数字を入力してください");
		}	
	}
}

class Ren3_2
{
	void r3_2(int p1,int p2)
	{
		try
		{
			int kekka = p1 / p2;
			System.out.println(p1+"/"+p2+"="+kekka);
		}
		catch(ArithmeticException e)
		{
			//例外が発生した場合
			System.out.println("0を除算することはできません。");
		}								
	}
}
