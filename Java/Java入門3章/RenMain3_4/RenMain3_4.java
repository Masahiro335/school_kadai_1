class RenMain3_4
{
	public static void main(String args[])
	{
		Ren3_4 c=new Ren3_4();
		int i = Integer.parseInt(args[0]);
		byte kekka = c.r3_4(i);
		System.out.println(i+"をbyte型に変換すると"+kekka+"です");
	}
}

class Ren3_4
{
	//引数p1の値をbyte型に変換し、戻り値に設定する
	byte r3_4(int p1)
	{
		Integer j = new Integer(p1); //Integerｸﾗｽのｲﾝｽﾀﾝｽを生成する
		return j.byteValue();		 //Integerｸﾗｽをbyteｸﾗｽに変換
	}
}

