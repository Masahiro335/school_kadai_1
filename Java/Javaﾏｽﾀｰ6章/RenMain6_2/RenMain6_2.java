import java.io.*;
class RenMain6_2
{
	public static void main(String args[])
	{
		//Ren6_2ｸﾗｽのｲﾝｽﾀﾝｽを生成し、Ren6_2ｸﾗｽのｲﾝｽﾀﾝｽ変数fNameにﾌｧｲﾙ名を設定する
		Ren6_2 c = new Ren6_2(args[0]);
		if(args.length==2)
		{
			//ｷｰﾎﾞｰﾄﾞからﾌｧｲﾙ名とﾃﾞｰﾀが入力されたらRen6_2ｸﾗｽのr6_2_1ﾒｿｯﾄﾞを実行する
			boolean kekka = c.r6_2_1(args[1]);
			if(kekka==true)
			{
				System.out.println("ﾃﾞｰﾀの書き込みが終了しました");
			}
			else
			{
				System.out.println("書き込みｴﾗｰが発生しました");
			}
		}
		else
		{
			boolean kekka = c.r6_2_2();
			if(kekka==true)
			{
				System.out.println("----"+args[0]+"のﾃﾞｰﾀ");
				System.out.println(c.rData);
			}
			else
			{
				System.out.println("読み込みｴﾗｰが発生しました");
			}
		}
	}
}


class Ren6_2
{
	String fName;
	char rData[] = new char[128];
	Ren6_2(String filename)
	{
		fName = filename;
	}
	boolean r6_2_1(String data)
	{
		try
		{
			FileWriter fw = new FileWriter(fName,true);
			fw.write(data);
			fw.close();
			return true;
		}
		catch(IOException d)
		{
			return false;
		}
	}
	boolean r6_2_2()
	{
		try
		{
			FileReader fr = new FileReader(fName);
			fr.read(rData);
			fr.close();
			return true;
		}
		catch(IOException d)
		{
			return false;
		}
	}
}



