class RenMain2_1
{
	public static void main(String args[])
	{
		Ren2_1 c = new Ren2_1();
		c.r2_1();
	}
}

class Ren2_1
{
	static int data[] = {1,2,3,4,5,6,7,8,9,10};
	double kekka;
	void r2_1()
	{
		Ren2_1_1 c1 = new Ren2_1_1();
		kekka = c1.r2_1_1();
		System.out.println("合計値は"+kekka+"です");
		System.out.println("平均値は"+kekka/10+"です");
	}
	//ﾒﾝﾊﾞｰｸﾗｽに変更
	class Ren2_1_1
	{
		double r2_1_1()
		{
			double t = 0;
			//Ren2_1ｸﾗｽの配列dataの合計を求める
			for(int i=0; i<10; i++)
			{
				t+=data[i];
			}
			return t;
		}
	}
}
