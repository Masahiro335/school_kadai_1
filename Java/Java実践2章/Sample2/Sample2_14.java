import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*<APPLET
	CODE=Sample2_14.class
	WIDTH=250
	HEIGHT=250 >
</APPLET>
*/

public class Sample2_14 extends Applet
{
	public void init()
	{
		ScrollPane sp = new ScrollPane();
		Button b = new Button("Button1");
		//Ì«ÝÄ‚ð80Îß²ÝÄ‚ÌŽÎ‘ÌSerif‚Å•\Ž¦‚·‚é
		b.setFont(new Font("Serif",Font.ITALIC,80));
		sp.add(b);		//BUtton1‚ð½¸Û°ÙÍß²Ý‚É“o˜^‚·‚é
		add(sp);
	}
}

