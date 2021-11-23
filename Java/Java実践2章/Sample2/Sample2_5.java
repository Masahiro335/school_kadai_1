import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*<APPLET
	CODE=Sample2_5.class
	WIDTH=250
	HEIGHT=250 >
</APPLET>
*/

public class Sample2_5 extends Applet implements ActionListener
{
	TextField text1,text2;
	public void init()
	{
		text1 = new TextField(10);
		text2 = new TextField(10);
		text1.setEchoChar('*');
		text1.addActionListener(this);
		add(text1);
		add(text2);
	}
	public void actionPerformed(ActionEvent e)
	{
		//左のﾃｷｽﾄﾌｨﾙｰﾄﾞからEnterキーが押されたら値を右のﾃｷｽﾄﾌｨｰﾙﾄﾞに設定する
		text2.setText(text1.getText());
	}
}


