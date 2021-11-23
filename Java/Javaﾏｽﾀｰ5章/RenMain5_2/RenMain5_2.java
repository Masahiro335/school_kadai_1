import java.util.*;
class RenMain5_2
{
	public static void main(String args[])
	{
		int w = Integer.parseInt(args[0]);;
		Ren5_2 c = new Ren5_2(w);
		Thread t = new Thread(c);
		Date s = new Date();
		long a = s.getTime();
		t.start();
		try
		{
			t.join();
			Date e = new Date();
			long b =e.getTime();
			System.out.println("½Ú¯ÄŞ‚ªÀs‚³‚ê‚Ä‚©‚çI—¹‚·‚é‚Ü‚Å"+(b-a)+"m•b‚Å‚·");
		}
		catch(InterruptedException d)
		{
			return;
		}		
	}
}

class Ren5_2 implements Runnable
{
	int wt;		//½Ú¯ÄŞ‚Ì‘Ò‹@•b”(mesec)
	Ren5_2(int d)
	{
		wt = d;	//½Ú¯ÄŞ‚Ì‘Ò‹@•b”‚ğİ’è‚·‚é
	}
	public void run()
	{
		try
		{
			Thread.sleep(wt); //wt‚Åw’è‚³‚ê‚½•b”(msec)‚¾‚¯‘Ò‹@‚·‚é
		}
		catch(InterruptedException d)
		{
			return;
		}
	}
}


