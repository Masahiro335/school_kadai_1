class Sample2_4
{
	public static void main(String args[])
	{
		Kadai2_4 c = new Kadai2_4();
		c.k2_4();
	}
}

class Kadai2_4
{
	int x = 5;
	int y = 10;
	int z = 15;
	void k2_4()
	{
		final int a = 0;	//۰�ٕϐ�
		class Kadai2_4_1	//۰�ٸ׽
		{
			void k2_4_1()
			{
				System.out.println("x="+x+"y="+y+"z="+z);
				System.out.println("a="+a);
			}
		}
		Kadai2_4_1 c = new Kadai2_4_1();
		c.k2_4_1();
	}
}

