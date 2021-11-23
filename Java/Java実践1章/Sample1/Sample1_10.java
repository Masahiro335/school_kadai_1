import java.applet.*;
import java.awt.*;

/*<APPLET
	CODE=Sample1_10.class
	WIDTH=250
	HEIGHT=250 >
</APPLET>*/


public class Sample1_10 extends Applet
{
	public void paint(Graphics g)
	{
		Font f1 = new Font("Serif",Font.PLAIN,18);
		g.setFont(f1);
		g.drawString("Java Applet(PLAIN)",10,60);
		Font f = g.getFont();
		String s = f.getName();
		g.drawString("現在のフォント名："+s,10,220);
	}
}

