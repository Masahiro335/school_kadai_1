class RenMain3_4
{
	public static void main(String args[])
	{
		Ren3_4 c=new Ren3_4();
		int i = Integer.parseInt(args[0]);
		byte kekka = c.r3_4(i);
		System.out.println(i+"‚ğbyteŒ^‚É•ÏŠ·‚·‚é‚Æ"+kekka+"‚Å‚·");
	}
}

class Ren3_4
{
	//ˆø”p1‚Ì’l‚ğbyteŒ^‚É•ÏŠ·‚µA–ß‚è’l‚Éİ’è‚·‚é
	byte r3_4(int p1)
	{
		Integer j = new Integer(p1); //Integer¸×½‚Ì²İ½Àİ½‚ğ¶¬‚·‚é
		return j.byteValue();		 //Integer¸×½‚ğbyte¸×½‚É•ÏŠ·
	}
}

