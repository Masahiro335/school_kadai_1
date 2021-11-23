import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*<APPLET
	CODE=Ren2_3.class
	WIDTH=250
	HEIGHT=250 >
</APPLET>
*/

public class Ren2_3 extends Applet implements ActionListener
{
	int i;
	TextField text[] = new TextField[10];
	public void init()
	{
		GridLayout gl = new GridLayout(5,2);
		setLayout(gl);
		for(i=0;i<10; i++)
		{
			text[i] =new TextField();
			text[i].addActionListener(this);
			add(text[i]);
		}
	}
	public void actionPerformed(ActionEvent a)
	{
		for(i=0;i<10; i++)
		{
			if(a.getSource()==text[i])
			{
				if(i == 9)
				{
					text[0].requestFocusInWindow();
				}
				else
				{
					text[i+1].requestFocusInWindow();
				}
			}
		}
	}
}



