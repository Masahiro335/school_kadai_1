import java.applet.*;
import java.awt.*;
import java.util.*;

/*<APPLET
	CODE=Ren1_3.class
	WIDTH=250
	HEIGHT=250 >
</APPLET>*/

public class Ren1_3 extends Applet implements Runnable
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
		Calendar c = Calendar.getInstance();
		c.toString();
		g.drawString("Œ»İ‚ÌF"+c.get(Calendar.HOUR)+""+
					c.get(Calendar.MINUTE)+"•ª"+
					c.get(Calendar.SECOND)+"•b",40,120);
	}
}

