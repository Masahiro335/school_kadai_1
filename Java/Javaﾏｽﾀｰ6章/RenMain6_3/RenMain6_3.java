import java.io.*;
class RenMain6_3
{
	public static void main(String args[])
	{
		int i;
		Ren6_3 c = new Ren6_3(args[0]);
		if(args.length>1)
		{
			c.count = args.length-1;
			for(i=1; i<args.length; i++)
			{
				c.buff[i-1] = Byte.parseByte(args[i]);
			}
			boolean kekka = c.r6_3_1();
			if(kekka==true)
			{
				System.out.println("ÃÞ°À‚Ì‘‚«ž‚Ý‚ªI—¹‚µ‚Ü‚µ‚½");
			}
			else
			{
				System.out.println("‘‚«ž‚Ý´×°‚ª”­¶‚µ‚Ü‚µ‚½");
			}
		}
		else
		{
			boolean kekka = c.r6_3_2();
			if(kekka==true)
			{
				System.out.println("----"+args[0]+"‚ÌÃÞ°À");
				for(i=0; i<c.count; i++)
				{
					System.out.print(c.buff[i]+"");
				}
			}
			else
			{
				System.out.println("“Ç‚Ýž‚Ý´×°‚ª”­¶‚µ‚Ü‚µ‚½");
			}
		}
	}
}

class Ren6_3
{
	String fName;
	byte buff[] = new byte[128];
	int count;
	Ren6_3(String f)
	{
		fName = f;
	}
	boolean r6_3_1()
	{
		try
		{
			FileOutputStream fo = new FileOutputStream(fName,false);
			fo.write(buff,0,count);
			fo.close();
			return true;
		}
		catch(IOException e)
		{
			return false;
		}
	}
	boolean r6_3_2()
	{
		try
		{
			FileInputStream fi = new FileInputStream(fName);
			count = fi.read(buff);
			fi.close();
			return true;
		}
		catch(IOException e)
		{
			return false;
		}
	}
}


