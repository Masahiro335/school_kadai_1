import java.applet.*;
import java.awt.*;
import java.util.*;

/*<APPLET
	CODE=Sample1_12.class
	WIDTH=250
	HEIGHT=250 >
</APPLET>*/

public class Sample1_12 extends Applet
{
	public void paint(Graphics g)
	{
		Date d = new Date();				//“ú•t‚Æ‚ğæ“¾‚·‚é
		g.drawString(d.toString(),40,120);	//“ú•t‚Æ‚ğ•\¦‚·‚é
	}
}

