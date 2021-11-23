class RenMain3_2
{
	static String kekka;	
	public static void main(String args[])
	{
		Ren3_2 c=new Ren3_2();
		c.r3_2(args[0]);
		System.out.println("ˆ—Œ‹‰Ê‚Í"+kekka+"‚Å‚·");
	}
}

class Ren3_2
{
	void r3_2(String s)
	{
		//ˆø”s‚Ì“à—e‚ğ‘å•¶š‚É•ÏŠ·‚µÃ“I•Ï”kekka‚Éİ’è
		RenMain3_2.kekka = s.toUpperCase();
	}
}

