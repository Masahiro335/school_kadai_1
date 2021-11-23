class Sample3_1
{
	public static void main(String args[])
	{
		int p1 = Integer.parseInt(args[0]);
		int p2 = Integer.parseInt(args[1]);
		Kadai3_1 c = new Kadai3_1();
		c.k3_1(p1,p2);
	}
}

class Kadai3_1
{
	int data[] = new int[10];
	void k3_1(int p1,int p2)
	{
		try
		{
			data[p1] = p2;	//dataのp1番目にp2の値を設定する
			System.out.println("正常終了");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("配列の要素番号が範囲を超えています");
		}
	}
}
