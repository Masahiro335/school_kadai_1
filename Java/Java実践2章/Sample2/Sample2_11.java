import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*<APPLET
	CODE=Sample2_11.class
	WIDTH=250
	HEIGHT=250 >
</APPLET>
*/

public class Sample2_11 extends Applet implements ItemListener
{
	Label label;
	Choice choice;
	public void init()
	{
		setLayout(null);	//Layout ManagerをOFFにする
		//Fontｸﾗｽのｵﾌﾞｼﾞｪｸﾄを生成する
		Font font = new Font("Serif",Font.PLAIN,24);
		//Labelｸﾗｽのｵﾌﾞｼﾞｪｸﾄを生成し、ｱﾌﾟﾚｯﾄに追加する
		label = new Label("Color");
		label.setSize(80,20);
		label.setLocation(20,20);
		label.setFont(font);
		add(label);
		//Choiceｸﾗｽのｵﾌﾞｼﾞｪｸﾄを生成する
		choice = new Choice();
		//ﾁｮｲｽに4つの選択項目を登録する
		choice.add("黒");
		choice.add("赤");
		choice.add("青");
		choice.add("緑");
		choice.addItemListener(this);
		choice.setSize(40,20);
		choice.setLocation(100,20);
		add(choice);
	}
	public void itemStateChanged(ItemEvent e)
	{
		//ﾁｮｲｽがｸﾘｯｸされたら以下の処理を行なう
		if(choice.getSelectedItem()=="黒")
		{
			label.setForeground(Color.black);		//ﾗﾍﾞﾙの文字を黒色にする
			label.setText(choice.getSelectedItem()); //ﾗﾍﾞﾙの文字を黒にする
		}
		else if(choice.getSelectedItem()=="赤")
		{
			label.setForeground(Color.red);			//ﾗﾍﾞﾙの文字を赤色にする
			label.setText(choice.getSelectedItem());//ﾗﾍﾞﾙの文字を赤にする
		}
		else if(choice.getSelectedItem()=="青")
		{
			label.setForeground(Color.blue);		//ﾗﾍﾞﾙの文字を青色にする
			label.setText(choice.getSelectedItem());//ﾗﾍﾞﾙの文字を青にする
		}
		if(choice.getSelectedItem()=="緑")
		{
			label.setForeground(Color.green);		//ﾗﾍﾞﾙの文字を緑色にする
			label.setText(choice.getSelectedItem());//ﾗﾍﾞﾙの文字を緑にする
		}
	}
}


