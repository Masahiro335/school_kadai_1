class RenMain3_3
{
	public static void main(String args[])
	{
		try
		{
			int kekka;
			byte p1 = Byte.parseByte(args[0]);
			char r = args[1].charAt(0);
			byte p2 = Byte.parseByte(args[2]);
			switch(r)
			{
				case '+':
					kekka = p1+p2;
					break;
				case '-':
					kekka = p1-p2;
					break;
				case 'x':
					kekka = p1*p2;
					break;
				case '/':
					kekka =	p1/p2;
					break;
				default:
					System.out.println("ŒvZ‚Å‚«‚Ü‚¹‚ñ");
					return;
			}
			System.out.println(args[0]+args[1]+args[2]+"="+kekka);
		}
		catch(NumberFormatException e)
		{
			//—áŠO‚ª”­¶‚µ‚½ê‡
			System.out.println("”š‚ª³‚µ‚­“ü—Í‚³‚ê‚Ä‚¢‚Ü‚¹‚ñ");
		}
		catch(ArithmeticException e)
		{
			//—áŠO‚ª”­¶‚µ‚½ê‡
			System.out.println("0‚ÅœZ‚·‚é‚±‚Æ‚ª‚Å‚«‚Ü‚¹‚ñ");
		}			
	}
}


