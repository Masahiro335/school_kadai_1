import java.applet.*;
import java.awt.*;

/*<APPLET
	CODE=Sample1_5.class
	WIDTH=250
	HEIGHT=250 >
</APPLET>
*/

public class Sample1_5 extends Applet
{
	public void paint(Graphics g)
	{
		g.drawString("Java Applet",80,120); //Java Appletという文字を表示する
	}
	public void init()
	{
		System.out.println("init");		//init状態
	}
	public void start()
	{
		System.out.println("start");	//start状態
	}
	public void stop()
	{
		System.out.println("stop");		//stop状態
	}
	public void destroy()
	{
		System.out.println("destroy");	//destroy状態
	}	
}
