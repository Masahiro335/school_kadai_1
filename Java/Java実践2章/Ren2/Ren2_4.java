import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*<APPLET
	CODE=Ren2_4.class
	WIDTH=250
	HEIGHT=250 >
</APPLET>
*/

public class Ren2_4 extends Applet implements ActionListener
{
	int i=0;
	Label label[] = new Label[5];
	String info[] = {"会員番号","氏名　　","年齢　　","電話番号","備考　　"};
	TextField text[] = new TextField[10];
	public void init()
	{
		//FlowLayoutｸﾗｽのｵﾌﾞｼﾞｪｸﾄを生成する
		FlowLayout fl = new FlowLayout(FlowLayout.LEFT,10,10);
		setLayout(fl);	//setLayoutﾒｿｯﾄﾞを実行し、FlowLayoutを指定する
		for(i=0; i<5; i++)
		{
			label[i] = new Label(info[i]);
			add(label[i]);
			text[i] =new TextField(15);
			text[i].addActionListener(this);
			add(text[i]);
		}
	}
	public void actionPerformed(ActionEvent a)
	{
		for(i=0;i<5; i++)
		{
			if(a.getSource()==text[i])
			{
				if(i == 4)
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


