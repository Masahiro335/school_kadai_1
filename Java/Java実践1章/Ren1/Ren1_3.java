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
		g.drawString("現在の時刻："+c.get(Calendar.HOUR)+"時"+
					c.get(Calendar.MINUTE)+"分"+
					c.get(Calendar.SECOND)+"秒",40,120);
	}
}

