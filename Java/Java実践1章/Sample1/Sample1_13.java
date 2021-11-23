import java.applet.*;
import java.awt.*;
import java.util.*;

/*<APPLET
	CODE=Sample1_13.class
	WIDTH=250
	HEIGHT=250 >
</APPLET>*/

public class Sample1_13 extends Applet implements Runnable
{
	public void init()
	{
		Thread t = new Thread(this);
		t.start();
	}
	public void run()
	{
		try
		{
			while(true)
			{
				repaint();
				Thread.sleep(1000);
			}
		}
		catch(Exception e){}
	}
	public void paint(Graphics g)
	{
		Date d = new Date();
		g.drawString(d.toString(),40,120);
	}
}

