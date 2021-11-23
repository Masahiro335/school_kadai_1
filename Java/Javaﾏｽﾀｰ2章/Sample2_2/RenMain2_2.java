class Ren2_2_1
{
	void r2_2()
	{
		System.out.println("Ren2_2_1");
	}
}

class Ren2_2_2 extends Ren2_2_1
{
	void r2_2()
	{
		System.out.println("Ren2_2_2");
	}
}

class Ren2_2_3 extends Ren2_2_2
{
	void r2_2()
	{
		System.out.println("Ren2_2_3");
	}
}

class RenMain2_2
{
	public static void main(String args[])
	{
		Ren2_2_1 c1 = new Ren2_2_1();
		Ren2_2_2 c2 = new Ren2_2_2();
		Ren2_2_3 c3 = new Ren2_2_3();
		Class c_a;
		Class c_b;
		int r = Integer.parseInt(args[0]);
		switch(r)
		{
			case 1:
				c1.r2_2();
				c_a = c1.getClass();
			    c_b = c_a.getSuperclass();
				System.out.println("class:"+c_b.getName());	//ｵﾌﾞｼﾞｪｸﾄ名表示
				break;
			case 2:
			    c2.r2_2();
			    c_a = c2.getClass();
			    c_b = c_a.getSuperclass();
			    System.out.println("class:"+c_b.getName());	//ｸﾗｽ名表示
				break;
			case 3:
			    c3.r2_2();
			    c_a = c3.getClass();
			    c_b = c_a.getSuperclass();
			    System.out.println("class:"+c_b.getName());	//ｸﾗｽ名表示
			    break;
			default:
				System.out.println("計算できません。");
				break;
		}
	}
}

