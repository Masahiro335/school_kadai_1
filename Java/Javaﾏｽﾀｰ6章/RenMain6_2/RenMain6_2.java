import java.io.*;
class RenMain6_2
{
	public static void main(String args[])
	{
		//Ren6_2¸×½‚Ì²İ½Àİ½‚ğ¶¬‚µARen6_2¸×½‚Ì²İ½Àİ½•Ï”fName‚ÉÌ§²Ù–¼‚ğİ’è‚·‚é
		Ren6_2 c = new Ren6_2(args[0]);
		if(args.length==2)
		{
			//·°ÎŞ°ÄŞ‚©‚çÌ§²Ù–¼‚ÆÃŞ°À‚ª“ü—Í‚³‚ê‚½‚çRen6_2¸×½‚Ìr6_2_1Ò¿¯ÄŞ‚ğÀs‚·‚é
			boolean kekka = c.r6_2_1(args[1]);
			if(kekka==true)
			{
				System.out.println("ÃŞ°À‚Ì‘‚«‚İ‚ªI—¹‚µ‚Ü‚µ‚½");
			}
			else
			{
				System.out.println("‘‚«‚İ´×°‚ª”­¶‚µ‚Ü‚µ‚½");
			}
		}
		else
		{
			boolean kekka = c.r6_2_2();
			if(kekka==true)
			{
				System.out.println("----"+args[0]+"‚ÌÃŞ°À");
				System.out.println(c.rData);
			}
			else
			{
				System.out.println("“Ç‚İ‚İ´×°‚ª”­¶‚µ‚Ü‚µ‚½");
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



