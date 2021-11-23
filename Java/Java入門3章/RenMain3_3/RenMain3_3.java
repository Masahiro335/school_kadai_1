class RenMain3_3
{
	public static void main(String args[])
	{
		Ren3_3 c=new Ren3_3();
		int i = Integer.parseInt(args[2]);
		String kekka = c.r3_3(args[0],args[1],i);
		System.out.println("ˆ—Œ‹‰Ê‚Í"+kekka+"‚Å‚·");
	}
}

class Ren3_3
{
	//•¶š—ñp1‚Ìp3•¶š–Ú‚É•¶š—ñp2‚ğ’Ç‰Á‚µAŒ‹‰Ê‚ğ–ß‚è’l‚Éİ’è‚·‚é
	String r3_3(String p1,String p2,int p3)
	{
		StringBuffer moji = new StringBuffer(p1);
		moji = moji.insert(p3,p2);
		return moji.toString();
	}
}

