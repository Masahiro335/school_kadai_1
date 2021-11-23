class RenMain3_1
{
	public static void main(String args[])
	{
		try
		{
		int p1 = Integer.parseInt(args[0]);
		int p2 = Integer.parseInt(args[1]);
		Ren3_1 c = new Ren3_1();
		c.r3_1(p1,p2);
		}
		catch(NumberFormatException e)
		{
			//例外が発生した場合
			System.out.println("数字を入力してください");
		}	
	}
}

class Ren3_1
{
	int data[] = new int[10];
	void r3_1(int p1,int p2)
	{
		try
		{
			data[p1] = p2;
			System.out.println("正常終了");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			//例外が発生した場合
			System.out.println("配列の要素番号が範囲を超えています");
		}			
	}
}
