class RenMain3_1
{
	public static void main(String args[])
	{
		Ren3_1 c=new Ren3_1();
		int kekka = c.r3_1(args[0],args[1]);
		if(kekka !=-1)
		{
			//文字列が見つかった場合は文字位置を表示する
			System.out.println(args[1]+"は"+kekka+"文字目に存在します");
		}
		else
		{
			//文字列が見つからなかった場合
			System.out.println(args[1]+"は存在しません。");
		}
	}
}

class Ren3_1
{
	int r3_1(String p1,String p2)
	{
		int a=0;
		a = p1.indexOf(p2);	//p1の文字列から文字列p2を探す
		return (a);
	}
}

