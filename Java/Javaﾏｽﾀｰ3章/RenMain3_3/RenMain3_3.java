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
					System.out.println("計算できません");
					return;
			}
			System.out.println(args[0]+args[1]+args[2]+"="+kekka);
		}
		catch(NumberFormatException e)
		{
			//例外が発生した場合
			System.out.println("数字が正しく入力されていません");
		}
		catch(ArithmeticException e)
		{
			//例外が発生した場合
			System.out.println("0で除算することができません");
		}			
	}
}


