import java.applet.*;
import java.awt.*;

/*<APPLET
	CODE=Ren1_2.class
	WIDTH=250
	HEIGHT=250 >
</APPLET>
*/

public class Ren1_2 extends Applet
{
	public void paint(Graphics g)
	{
		g.drawRect(70,60,100,100);		//lŠpŒ`‚ğ•`‰æ‚·‚é
		g.setColor(Color.black);
		g.fillOval(70,60,100,100);		//‰~‚ğF‚Å“h‚è‚Â‚Ô‚·
	}
}

