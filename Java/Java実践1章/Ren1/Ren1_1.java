import java.applet.*;
import java.awt.*;

/*<APPLET
	CODE=Ren1_1.class
	WIDTH=250
	HEIGHT=250 >
</APPLET>
*/

public class Ren1_1 extends Applet
{
	public void paint(Graphics g)
	{
		for(int i=0; i<10; i++)
		{
			g.drawLine(0,i*10,i*10,i*10);
	    }
	}
}

