import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*<APPLET
	CODE=Sample2_7.class
	WIDTH=250
	HEIGHT=250 >
</APPLET>
*/

public class Sample2_7 extends Applet implements ActionListener
{
	TextField text1;
	TextArea  text2;
	public void init()
	{
		text1 = new TextField(10);
		text2 = new TextArea(10,20);
		text1.addActionListener(this);
		add(text1);
		add(text2);
	}
	public void actionPerformed(ActionEvent a)
	{
		text2.append(text1.getText()+"\n");
		text1.setText("");
	}
}


