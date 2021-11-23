class Sample1_5
{
	public static void main(String args[])
	{
		Kadai1_5 c = new Kadai1_5();
		c.k1_5();
	}
	protected void k1_5()
	{
		System.out.println("Sample1_5¸×½‚Ìk1_5Ò¿¯ÄÞ");
		
	}
}

class Kadai1_5 extends Sample1_5
{
	public void k1_5()
	{
		System.out.println("Kadai1_5¸×½‚Ìk1_5Ò¿¯ÄÞ");
	}
}
