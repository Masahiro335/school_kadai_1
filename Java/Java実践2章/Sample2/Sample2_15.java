import java.applet.*;
import java.awt.*;
/*<APPLET
	CODE=Sample2_15.class
	WIDTH=250
	HEIGHT=250 >
</APPLET>
*/

public class Sample2_15 extends Applet
{
	public void init()
	{
		//FlowLayout¸×½‚ÌµÌŞ¼Şª¸Ä‚ğ¶¬‚·‚é
		FlowLayout fl = new FlowLayout(FlowLayout.LEFT,20,10);
		setLayout(fl);	//setLayoutÒ¿¯ÄŞ‚ğÀs‚µAFlowLayout‚ğw’è‚·‚é
		for(int i=0; i<50; i++)
		{
			add(new TextField());	//Ã·½ÄÌ¨°ÙÄŞ‚ğ±ÌßÚ¯Ä‚É’Ç‰Á‚·‚é
		}
	}
}
