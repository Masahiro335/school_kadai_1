class RenMain3_5
{
	public static void main(String args[])
	{
		char i=args[0].charAt(0);	//ｷｰﾎﾞｰﾄﾞから入力された文字をchar型に変換
		Ren3_5 c=new Ren3_5();
		if(c.r3_5(i)==true)
		{
			System.out.println("処理結果は"+c.kekka+"です");
		}
		else
		{
			System.out.println("変換できません");
		}
	}	
}

class Ren3_5
{
	char kekka; //ｲﾝｽﾀﾝｽ変数
	boolean r3_5(char i)
	{
		if(Character.isLetter(i)==true) //iが文字の場合
		{
			if(Character.isUpperCase(i)==true)		//iが大文字の場合
			{
				kekka = Character.toLowerCase(i);	//iを小文字にする
				return(true);
			}
			else if(Character.isLowerCase(i)==true)	//iが小文字の場合
			{
				kekka = Character.toUpperCase(i);	//iを大文字にする
				return(true);
			}
		}
				return(false);
	}	
}
