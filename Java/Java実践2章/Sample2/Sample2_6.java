import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*<APPLET
	CODE=Sample2_6.class
	WIDTH=250
	HEIGHT=250 >
</APPLET>
*/

public class Sample2_6 extends Applet implements ActionListener
{
	TextField text1,text2,text3;
	public void init()
	{
		text1 = new TextField();
		text2 = new TextField();
		text3 = new TextField();
		text1.addActionListener(this);
		text2.addActionListener(this);
		text3.addActionListener(this);
		add(text1);
		add(text2);
		add(text3);
	}
	public void actionPerformed(ActionEvent a)
	{
		if(a.getSource()==text1)
		{
			text2.requestFocusInWindow();
		}
		else if(a.getSource()==text2)
		{
			text3.requestFocusInWindow();
		}
		else
		{
			text1.requestFocusInWindow();
		}
	}
}


