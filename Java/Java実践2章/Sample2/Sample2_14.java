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
		//ﾌｫﾝﾄを80ﾎﾟｲﾝﾄの斜体Serifで表示する
		b.setFont(new Font("Serif",Font.ITALIC,80));
		sp.add(b);		//BUtton1をｽｸﾛｰﾙﾍﾟｲﾝに登録する
		add(sp);
	}
}

