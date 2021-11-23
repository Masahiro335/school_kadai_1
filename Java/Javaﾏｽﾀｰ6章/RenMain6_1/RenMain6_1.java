import java.io.*;
class RenMain6_1
{
	public static void main(String args[])
	{
		File file = new File(args[0]);
		if(file.exists()==true)
		{
			if(file.isFile()==true)
			{
				System.out.println(file+"‚ÍÌ§²Ù‚Å‚·");
			}
			if(file.isDirectory()==true)
			{
				System.out.println(file+"‚ÍÃŞ¨Ú¸ÄØ‚Å‚·");
			}
		}
		else
		{
			System.out.println(file+"‚Í‘¶İ‚µ‚Ü‚¹‚ñ");
		}
	}
}


