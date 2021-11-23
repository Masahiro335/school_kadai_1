import java.applet.*;
import java.awt.*;
/*<APPLET
	CODE=Sample2_17.class
	WIDTH=250
	HEIGHT=250 >
</APPLET>
*/

public class Sample2_17 extends Applet
{
	public void init()
	{
		GridLayout gl = new GridLayout(4,2);
		setLayout(gl);
		for(int i=1; i<9; i++)
		{
			add(new Button("Command"+i));	//±ÌßÚ¯Ä‚ÉÎÞÀÝ‚ð8‚Â“o˜^‚·‚é
		}
	}
}

