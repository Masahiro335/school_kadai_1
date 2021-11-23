import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*<APPLET
	CODE=Sample2_12.class
	WIDTH=250
	HEIGHT=250 >
</APPLET>
*/

public class Sample2_12 extends Applet implements ItemListener
{
	Label label;
	List list;
	public void init()
	{
		//Fontｸﾗｽのｵﾌﾞｼﾞｪｸﾄを生成する
		Font font = new Font("Serif",Font.PLAIN,24);
		//Labelｸﾗｽのｵﾌﾞｼﾞｪｸﾄを生成し、ｱﾌﾟﾚｯﾄに追加する
		label = new Label("Color");
		label.setFont(font);
		add(label);
		list = new List();
		//ﾘｽﾄに4つの選択項目を登録する
		list.add("黒");
		list.add("赤");
		list.add("青");
		list.add("緑");
		list.addItemListener(this);
		add(list);
		list.select(2);
		label.setForeground(Color.blue);
	}
	public void itemStateChanged(ItemEvent e)
	{
		//がｸﾘｯｸされたら以下の処理を行なう
		if(list.getSelectedItem()=="黒")
		{
			label.setForeground(Color.black);	     //ﾗﾍﾞﾙの文字を黒色にする
			label.setText(list.getSelectedItem());   //ﾗﾍﾞﾙの文字を黒にする
		}
		else if(list.getSelectedItem()=="赤")
		{
			label.setForeground(Color.red);			//ﾗﾍﾞﾙの文字を赤色にする
			label.setText(list.getSelectedItem());  //ﾗﾍﾞﾙの文字を赤にする
		}
		else if(list.getSelectedItem()=="青")
		{
			label.setForeground(Color.blue);		//ﾗﾍﾞﾙの文字を青色にする
			label.setText(list.getSelectedItem());  //ﾗﾍﾞﾙの文字を青にする
		}
		if(list.getSelectedItem()=="緑")
		{
			label.setForeground(Color.green);		//ﾗﾍﾞﾙの文字を緑色にする
			label.setText(list.getSelectedItem());  //ﾗﾍﾞﾙの文字を緑にする
		}
	}
}



