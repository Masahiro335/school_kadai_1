class Sample2_8
{
	public static void main(String args[])
	{
		System.out.println("GC1");
		GC1g = new GC1();				//GC1¸×½‚ÌµÌŞ¼Şª¸Ä‚ğ¶¬‚·‚é
		System.out.println("GC2");
		g = null;						//GC1¸×½‚ÌµÌŞ¼Şª¸Ä‚Énull‚ğ‘ã“ü
		System.out.println("GC3");
		System.gc();					//¶Ş°ÍŞ¯¼ŞºÚ¸¼®İ‚ÌÀs‚ğ{‚·
		System.out.println("GC4");
	}
}

class GC1
{
	public void finalize()		//GC1¸×½‚ÌfinalizeÒ¿¯ÄŞ
	{
		System.out.println("--finaliza--")
	}
}







