class Sample1_4
{
	public static void main(String args[])
	{
		int p1 = Integer.parseInt(args[0]);
		if(p1>0 && p1<5)	
		{
			boolean kekka1;		//²ÝÀÌª°½‚ðŽÀ‘•‚µ‚Ä‚¢‚é‚©”Û‚©‚ÌŒ‹‰Ê‚ðŠi”[‚·‚é
			String kekka2;		//Ò¿¯ÄÞ‚ÌŽÀsŒ‹‰Ê‚ðŠi”[‚·‚é•Ï”
			switch(p1)			//·°ÎÞ°ÄÞ‚©‚ç“ü—Í‚³‚ê‚½’l‚É‚æ‚èˆ—‚ð•ªŠò‚·‚é
			{
				case 1:
					Kadai1_4_1 c1 = new Kadai1_4_1();
					kekka1 = c1 instanceof Interface1_4;	//Interface1_4‚ÌŽÀ‘•Áª¯¸‚ðs‚¤
					kekka2 = c1.r1_4();
					break;
				case 2:
					Kadai1_4_2 c2 = new Kadai1_4_2();
					kekka1 = c2 instanceof Interface1_4;	//Interface1_4‚ÌŽÀ‘•Áª¯¸‚ðs‚¤
					kekka2 = c2.r1_4();
					break;
				case 3:
					Kadai1_4_3 c3 = new Kadai1_4_3();
					kekka1 = c3 instanceof Interface1_4;	//Interface1_4‚ÌŽÀ‘•Áª¯¸‚ðs‚¤
					kekka2 = c3.r1_4();
					break;
				default:
					Kadai1_4_4 c4 = new Kadai1_4_4();
					kekka1 = c4 instanceof Interface1_4;	//Interface1_4‚ÌŽÀ‘•Áª¯¸‚ðs‚¤
					kekka2 = c4.r1_4();
			}
			if(kekka1==true)
			{
				//Interface1_4‚ðŽÀ‘•‚µ‚Ä‚¢‚½‚çˆÈ‰º‚ÌÒ¯¾°¼Þ‚ð•\Ž¦‚·‚é
				System.out.println(kekka2+"‚ÍInterface1_4‚ðŽÀ‘•‚µ‚Ä‚¢‚Ü‚·");
			}
			else
			{
				//Interface1_4‚ðŽÀ‘•‚µ‚Ä‚¢‚È‚¯‚ê‚ÎˆÈ‰º‚ÌÒ¯¾°¼Þ‚ð•\Ž¦‚·‚é
				System.out.println(kekka2+"‚ÍInterface1_4‚ðŽÀ‘•‚µ‚Ä‚¢‚Ü‚¹‚ñ");
			}
		}
		else	//·°ÎÞ°ÄÞ‚©‚ç“ü—Í‚³‚ê‚½’l‚ª1‚©‚ç3ˆÈŠO‚Ìê‡
		{
			System.out.println("ŠY“–‚·‚é•”‚ªŒ©‚Â‚©‚è‚Ü‚¹‚ñ");
		}
	}
}

//Interface‚ÌéŒ¾
interface Interface1_4
{
	String r1_4();
}

//Kadai1_4_1¸×½‚ÍInterface1_4²ÝÀÌ§²½‚ðŽÀ‘•‚·‚é
class Kadai1_4_1 implements Interface1_4
{
	public String r1_4()
	{
		return "Kadai1_4_1¸×½";
	}
}	

//Kadai1_4_2¸×½‚ÍKadai1_4²ÝÀÌª²½‚ðŽÀ‘•‚µ‚È‚¢
class Kadai1_4_2
{
	String r1_4()
	{
		return "Kadai1_4_2¸×½";
	}
}

//Kadai1_4_3¸×½‚ÍKadai1_4_1¸×½‚ðŒp³‚·‚é
class Kadai1_4_3 extends Kadai1_4_1
{
	public String r1_4()
	{
		return "Kadai1_4_3¸×½";
	}
}

//Kadai1_4_4¸×½‚ÍInterface1_4_1²ÝÀÌª²½‚ðŽÀ‘•‚µ‚È‚¢
class Kadai1_4_4
{
	String r1_4()
	{
		return "Kadai1_4_4¸×½";
	}
}

