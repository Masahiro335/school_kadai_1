import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*<APPLET
	CODE=Sample2_2.class
	WIDTH=250
	HEIGHT=250 >
</APPLET>
*/

public class Sample2_2 extends Applet implements ActionListener
{
	Button button;
	public void init()
	{
		button = new Button("START");		//Buttonｸﾗｽのｵﾌﾞｼﾞｪｸﾄを生成する
		button.addActionListener(this);		//STARTﾎﾞﾀﾝをActionListenerに登録する
		add(button);						//STARTﾎﾞﾀﾝをｱﾌﾟﾚｯﾄに追加する
	}
	public void actionPerformed(ActionEvent e)
	{
		if(button.getLabel()=="START")
		{
			button.setLabel("STOP");	//STARTﾎﾞﾀﾝSTOPﾎﾞﾀﾝに名前を変更
		}
		else
		{
			button.setLabel("START");	//STOPﾎﾞﾀﾝならSTARTﾎﾞﾀﾝに名前を変更する
		}
	}
}


