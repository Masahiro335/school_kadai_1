class RenMain1_2
{
	public static void main(String args[])
	{
		InterfaceR1_2 c;
		c = new Ren1_2_1();
		int kekka = c.r1_2();
		System.out.println("最大値は"+kekka+"です");
		c = new Ren1_2_2();
		kekka = c.r1_2();
		System.out.println("最大値は"+kekka+"です");
	}
}

interface InterfaceR1_2
{
	int MAX_DATA = 10;	//dataに設定されている数字の数
	int data[] = {17,10,82,27,65,23,46,32,12,90};
	int r1_2();
}

class Ren1_2_1 implements InterfaceR1_2
{
	public int r1_2()
	{
		int i;
		int x=0;
		for(i=1; i<MAX_DATA; i++)
		{
			if(data[i] > data[x])
			{
				x = i;
			}
		}
		return data[x];
	}
}

class Ren1_2_2 implements InterfaceR1_2
{
	public int r1_2()
	{
		int i;
		int x=0;
		for(i=1; i<MAX_DATA; i++)
		{
			if(data[i] < data[x])
			{
				x = i;
			}
		}
		return data[x];
	}
}
