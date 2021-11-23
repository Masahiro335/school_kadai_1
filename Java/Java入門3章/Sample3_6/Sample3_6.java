class Sample3_6
{
	public static void main(String args[])
	{
		char i=args[0].charAt(0);	//ｷｰﾎﾞｰﾄﾞから入力された文字をchar型に変換
		Kadai3_6 c=new Kadai3_6();	//Kadai3_6ｸﾗｽのｲﾝｽﾀﾝｽを生成する
		String kekka = c.k3_6(i);	//k3_6ﾒｿｯﾄﾞを実行し、結果をﾃﾞｨｽﾌﾟﾚｲに表示する
		System.out.println("入力された文字は"+kekka);
	}	
}

class Kadai3_6
{
	String k3_6(char i)
	{
		if(Character.isLetterOrDigit(i)==true)
		{
			if(Character.isDigit(i)==true)
			{
				return "数字です。";
			}
			if(Character.isLetter(i)==true)
			{
				if(Character.isUpperCase(i)==true)
				{
					return "大文字です。";
				}
				if(Character.isLowerCase(i)==true)
				{
					return "小文字です。";
				}
			}
		}
		if(Character.isSpaceChar(i)==true)
		{
			return "スペースです。";
		}
		return "記号か全角文字です。";
	}
}
