import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*<APPLET
	CODE=Sample2_3.class
	WIDTH=250
	HEIGHT=250 >
</APPLET>
*/

public class Sample2_3 extends Applet implements ActionListener
{
	Label label;
	Button button1,button2;
	public void init()
	{
		button1 = new Button("OK"); 		//Button1ｸﾗｽのｵﾌﾞｼﾞｪｸﾄを生成する
		button2 = new Button("Cancel"); 	//Button2ｸﾗｽのｵﾌﾞｼﾞｪｸﾄを生成する
		button1.addActionListener(this);	//OKﾎﾞﾀﾝをActionListenerに登録する
		button2.addActionListener(this);	//CancelﾎﾞﾀﾝをActionListenerに登録する
		add(button1);						//OKﾎﾞﾀﾝをｱﾌﾟﾚｯﾄに追加する
		add(button2);						//Cancelﾎﾞﾀﾝをｱﾌﾟﾚｯﾄに追加する
		label = new Label("                      ");//Labelｸﾗｽのｵﾌﾞｼﾞｪｸﾄを生成する
		add(label);							//ﾗﾍﾞﾙをｱﾌﾟﾚｯﾄに追加する
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==button1)
		{
			label.setText("OK Button");	
			//OKﾎﾞﾀﾝがｸﾘｯｸされたらOK Buttonと表示
		}
		else
		{
			label.setText("Cancel Button");	
			//CancellﾎﾞﾀﾝがｸﾘｯｸされたらCancel Buttonと表示
		}
	}
}


