import java.applet.*;
import java.awt.*;

/*<APPLET
	CODE=Sample1_9.class
	WIDTH=250
	HEIGHT=250 >
</APPLET>
*/

public class Sample1_9 extends Applet
{
	public void paint(Graphics g)
	{
		g.setColor(Color.black);	//色を指定する
		g.fillRect(80,130,70,50);	//四角形を描画し、色を付ける
	}
}

