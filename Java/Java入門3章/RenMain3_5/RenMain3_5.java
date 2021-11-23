class RenMain3_5
{
	public static void main(String args[])
	{
		char i=args[0].charAt(0);	//·°ÎŞ°ÄŞ‚©‚ç“ü—Í‚³‚ê‚½•¶š‚ğcharŒ^‚É•ÏŠ·
		Ren3_5 c=new Ren3_5();
		if(c.r3_5(i)==true)
		{
			System.out.println("ˆ—Œ‹‰Ê‚Í"+c.kekka+"‚Å‚·");
		}
		else
		{
			System.out.println("•ÏŠ·‚Å‚«‚Ü‚¹‚ñ");
		}
	}	
}

class Ren3_5
{
	char kekka; //²İ½Àİ½•Ï”
	boolean r3_5(char i)
	{
		if(Character.isLetter(i)==true) //i‚ª•¶š‚Ìê‡
		{
			if(Character.isUpperCase(i)==true)		//i‚ª‘å•¶š‚Ìê‡
			{
				kekka = Character.toLowerCase(i);	//i‚ğ¬•¶š‚É‚·‚é
				return(true);
			}
			else if(Character.isLowerCase(i)==true)	//i‚ª¬•¶š‚Ìê‡
			{
				kekka = Character.toUpperCase(i);	//i‚ğ‘å•¶š‚É‚·‚é
				return(true);
			}
		}
				return(false);
	}	
}
