import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*<APPLET
	CODE=Sample2_9.class
	WIDTH=250
	HEIGHT=250 >
</APPLET>
*/

public class Sample2_9 extends Applet implements ItemListener
{
	Label label;
	Checkbox option1,option2,option3,option4;
	public void init()
	{
		setLayout(null);								//Layout managerを使用しない
														//Fontｸﾗｽのｵﾌﾞｼﾞｪｸﾄを生成する
		Font font = new Font("Serif",Font.PLAIN,24);	
		label = new Label("Color");						//Labelｸﾗｽのｵﾌﾞｼﾞｪｸﾄを生成する
		label.setSize(80,20);							//ﾗﾍﾞﾙのｻｲｽﾞを指定する
		label.setLocation(20,20);						//ﾗﾍﾞﾙの表示位置を指定する
		label.setFont(font);							//ﾗﾍﾞﾙのﾌｫﾝﾄを指定する
		add(label);										//ﾗﾍﾞﾙをｱﾌﾟﾚｯﾄに追加する
														//CheckboxGroupｸﾗｽのｵﾌﾞｼﾞｪｸﾄを生成する
		CheckboxGroup group = new CheckboxGroup();
		option1 = new Checkbox("黒",group,true);		//Checkboxｸﾗｽのｵﾌﾞｼﾞｪｸﾄを4つ生成する
		option2 = new Checkbox("赤",group,true);
		option3 = new Checkbox("青",group,true);
		option4 = new Checkbox("緑",group,true);
		option1.addItemListener(this);					//4つのﾗｼﾞｵﾎﾞﾀﾝをItemListener
		option2.addItemListener(this);
		option3.addItemListener(this);
		option4.addItemListener(this);
		option1.setSize(40,20);							//ﾗｼﾞｵﾎﾞﾀﾝのｻｲｽﾞを指定する
		option2.setSize(40,20);
		option3.setSize(40,20);
		option4.setSize(40,20);
		option1.setLocation(20,60);						//ﾗｼﾞｵﾎﾞﾀﾝの表示位置を指定する
		option2.setLocation(20,80);
		option3.setLocation(20,100);
		option4.setLocation(20,120);
		add(option1);									//ﾗｼﾞｵﾎﾞﾀﾝをｱﾌﾟﾚｯﾄに追加する
		add(option2);
		add(option3);
		add(option4);
	}
	public void itemStateChanged(ItemEvent e)
	{
		//ﾗｼﾞｵﾎﾞﾀﾝがｸﾘｯｸされたら以下の処理を行なう
		if(e.getItemSelectable()==option1)
		{
			label.setForeground(Color.black);		//黒のﾎﾞﾀﾝなら文字の色を黒にする
		}
		else if(e.getItemSelectable()==option2)
		{
			label.setForeground(Color.red);			//赤のﾎﾞﾀﾝなら文字の色を赤にする
		}
		else if(e.getItemSelectable()==option3)
		{
			label.setForeground(Color.blue);		//青のﾎﾞﾀﾝなら文字の色を青にする
		}
		else
		{
			label.setForeground(Color.green);		//緑のﾎﾞﾀﾝなら文字の色を緑にする
		}
	}
}
