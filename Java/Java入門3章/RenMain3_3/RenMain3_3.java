class RenMain3_3
{
	public static void main(String args[])
	{
		Ren3_3 c=new Ren3_3();
		int i = Integer.parseInt(args[2]);
		String kekka = c.r3_3(args[0],args[1],i);
		System.out.println("処理結果は"+kekka+"です");
	}
}

class Ren3_3
{
	//文字列p1のp3文字目に文字列p2を追加し、結果を戻り値に設定する
	String r3_3(String p1,String p2,int p3)
	{
		StringBuffer moji = new StringBuffer(p1);
		moji = moji.insert(p3,p2);
		return moji.toString();
	}
}

