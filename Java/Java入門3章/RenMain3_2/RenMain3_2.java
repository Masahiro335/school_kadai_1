class RenMain3_2
{
	static String kekka;	
	public static void main(String args[])
	{
		Ren3_2 c=new Ren3_2();
		c.r3_2(args[0]);
		System.out.println("処理結果は"+kekka+"です");
	}
}

class Ren3_2
{
	void r3_2(String s)
	{
		//引数sの内容を大文字に変換し静的変数kekkaに設定
		RenMain3_2.kekka = s.toUpperCase();
	}
}

