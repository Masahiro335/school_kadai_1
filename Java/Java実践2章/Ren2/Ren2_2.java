import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*<APPLET
	CODE=Ren2_2.class
	WIDTH=250
	HEIGHT=250 >
</APPLET>
*/

public class Ren2_2 extends Applet implements ActionListener
{
	TextField text1,text2,text3;
	public void init()
	{
		setLayout(null);	//自動配置をキャンセル
		text1 = new TextField();
		text2 = new TextField();
		text3 = new TextField();
		//ﾃｷｽﾄのｻｲｽﾞを決める
		text1.setSize(80,20);
		text2.setSize(80,20);
		text3.setSize(80,20);
		//ﾃｷｽﾄの位置を決める
		text1.setLocation(80,20);
		text2.setLocation(80,50);
		text3.setLocation(80,80);
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



