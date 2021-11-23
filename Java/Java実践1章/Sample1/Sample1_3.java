import java.applet.*;
import java.awt.*;

/*<APPLET
	CODE=Sample1_3.class
	WIDTH=250
	HEIGHT=250 >
</APPLET>
*/

public class Sample1_3 extends Applet
{
	public void paint(Graphics g)
	{
		Dimension d = getSize();				//±ÌßÚ¯Ä‚Ì»²½Ş‚ğŠ“¾‚·‚é
		g.drawString("•F"+d.width,10,60);		//±ÌßÚ¯Ä‚Ì•‚Æ‚‚³‚ğ•\¦‚·‚é
		g.drawString("‚‚³F"+d.height,10,100);			
	}
}

