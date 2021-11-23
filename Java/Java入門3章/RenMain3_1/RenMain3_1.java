class RenMain3_1
{
	public static void main(String args[])
	{
		Ren3_1 c=new Ren3_1();
		int kekka = c.r3_1(args[0],args[1]);
		if(kekka !=-1)
		{
			//•¶š—ñ‚ªŒ©‚Â‚©‚Á‚½ê‡‚Í•¶šˆÊ’u‚ğ•\¦‚·‚é
			System.out.println(args[1]+"‚Í"+kekka+"•¶š–Ú‚É‘¶İ‚µ‚Ü‚·");
		}
		else
		{
			//•¶š—ñ‚ªŒ©‚Â‚©‚ç‚È‚©‚Á‚½ê‡
			System.out.println(args[1]+"‚Í‘¶İ‚µ‚Ü‚¹‚ñB");
		}
	}
}

class Ren3_1
{
	int r3_1(String p1,String p2)
	{
		int a=0;
		a = p1.indexOf(p2);	//p1‚Ì•¶š—ñ‚©‚ç•¶š—ñp2‚ğ’T‚·
		return (a);
	}
}

