class Sample3_5
{
	public static void main(String args[])
	{
		int i = Integer.parseInt(args[0]);	//·°ÎŞ°ÄŞ‚©‚ç“ü—Í‚³‚ê‚½’l‚ğintŒ^‚É•ÏŠ·‚·‚é
		Kadai3_5 c = new Kadai3_5();		//Kadai3_5¸×½‚Ì²İ½Àİ½‚ğ¶¬‚·‚é
		String kekka = c.k3_5(i);			//k3_5Ò¿¯ÄŞ‚ğÀs‚·‚é
		System.out.println("ˆ—Œ‹‰Ê"+kekka+"‚Å‚·");
	}
}


class Kadai3_5
{
	String k3_5(int i)
	{
		Integer j = new Integer(i);		//Integer¸×½‚Ì²İ½Àİ½‚ğ¶¬‚·‚é
		return j.toString();			//Integer¸×½‚ğString¸×½‚É•ÏŠ·‚·‚é
	}
}

