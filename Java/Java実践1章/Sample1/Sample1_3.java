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
		Dimension d = getSize();				//ｱﾌﾟﾚｯﾄのｻｲｽﾞを所得する
		g.drawString("幅："+d.width,10,60);		//ｱﾌﾟﾚｯﾄの幅と高さを表示する
		g.drawString("高さ："+d.height,10,100);			
	}
}

