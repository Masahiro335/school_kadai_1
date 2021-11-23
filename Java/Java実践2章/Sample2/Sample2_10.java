import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*<APPLET
	CODE=Sample2_10.class
	WIDTH=250
	HEIGHT=250 >
</APPLET>
*/

public class Sample2_10 extends Applet implements ItemListener
{
	Label label1,label2;
	Checkbox option1,option2,option3,option4,option5,option6;
	public void init()
	{
		setLayout(null);		//LayoutManagerをOFFにする
		//Labelｸﾗｽのｵﾌﾞｼﾞｪｸﾄを2つ生成し、ｱﾌﾟﾚｯﾄに登録する
		label1 = new Label("男性");
		label2 = new Label("20代 ");
		label1.setSize(50,20);
		label2.setSize(50,20);
		label1.setLocation(20,10);
		label2.setLocation(100,10);
		add(label1);
		add(label2);
		//Checkboxgroupｸﾗｽのｵﾌﾞｼﾞｪｸﾄを2つ生成する
		CheckboxGroup group1 = new CheckboxGroup();	//性別
		CheckboxGroup group2 = new CheckboxGroup();	//年代
		//Checkboxgroupｸﾗｽ(性別用)のｵﾌﾞｼﾞｪｸﾄを2つ生成する
		option1 = new Checkbox("男性",group1,true);
		option2 = new Checkbox("女性",group1,false);
		//Checkboxgroupｸﾗｽ(年代用)のｵﾌﾞｼﾞｪｸﾄを4つ生成する
		option3 = new Checkbox("10代",group2,false);
		option4 = new Checkbox("20代",group2,true);
		option5 = new Checkbox("30代",group2,false);
		option6 = new Checkbox("その他",group2,false);
		//6つのﾗｼﾞｵﾎﾞﾀﾝをItemListenerに登録する
		option1.addItemListener(this);
		option2.addItemListener(this);
		option3.addItemListener(this);
		option4.addItemListener(this);
		option5.addItemListener(this);
		option6.addItemListener(this);
		//6つのﾗｼﾞｵﾎﾞﾀﾝのｻｲｽﾞを指定する
		option1.setSize(60,20);
		option2.setSize(60,20);
		option3.setSize(60,20);
		option4.setSize(60,20);
		option5.setSize(60,20);
		option6.setSize(60,20);
		//6つのﾗｼﾞｵﾎﾞﾀﾝの表示位置を指定する
		option1.setLocation(20,40);
		option2.setLocation(20,60);
		option3.setLocation(100,40);
		option4.setLocation(100,60);
		option5.setLocation(100,80);
		option6.setLocation(100,100);
		//6つのﾗｼﾞｵﾎﾞﾀﾝをｱﾌﾟﾚｯﾄに追加する
		add(option1);
		add(option2);
		add(option3);
		add(option4);
		add(option5);
		add(option6);
	}
	public void itemStateChanged(ItemEvent e)
	{
		//ｸﾘｯｸされたﾗｼﾞｵﾎﾞﾀﾝのｵﾌﾞｼﾞｪｸﾄを所得する
		Checkbox select = (Checkbox)e.getItemSelectable();
		if(select==option1||select==option2)
		{
			//性別用のﾗｼﾞｵﾎﾞﾀﾝならlabel1に性別を設定する
			label1.setText(select.getLabel());
		}
		else
		{
			//年代用のﾗｼﾞｵﾎﾞﾀﾝならlabel2に年代を設定する
			label2.setText(select.getLabel());
		}
	}
}

