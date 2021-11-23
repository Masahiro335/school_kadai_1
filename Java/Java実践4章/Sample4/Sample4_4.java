import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*<APPLET
	CODE=Sample4_4.class
	WIDTH=250
	HEIGHT=250 >
</APPLET>
*/

public class Sample4_4 extends Applet implements ActionListener
{
	Button button1,button2;
	Sample4_4_1 frame;
	public void init()
	{
		button1 = new Button("Show");
		button2 = new Button("Hide");
		button1.addActionListener(this);
		button2.addActionListener(this);
		add(button1);
		add(button2);
		frame = new Sample4_4_1("Sample4_4_1");
		frame.setSize(250,250);
		frame.setLocation(300,0);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==button1)		//Showﾎﾞﾀﾝがｸﾘｯｸされたら以下の処理を行なう
		{
			frame.setVisible(true);		//ﾌﾚｰﾑを可視状態にする
		}
		else							//Hideﾎﾞﾀﾝがｸﾘｯｸされたら以下の処理を行なう
		{
			frame.setVisible(false);	//ﾌﾚｰﾑを非可視状態にする
		}
	}
}

class Sample4_4_1 extends Frame implements ActionListener
{
	Label label;
	MenuItem m1,m2,m3,m4;
	Sample4_4_1(String title)
	{
		super(title);
		MenuBar mb = new MenuBar();		//ｵﾌﾞｼﾞｪｸﾄ作成
		setMenuBar(mb);					//ﾌﾚｰﾑにﾒﾆｭｰﾊﾞｰを追加する
		Menu me = new Menu("ﾌｧｲﾙ");		//Menuｸﾗｽのｵﾌﾞｼﾞｪｸﾄを生成する
		mb.add(me);						//ﾒﾆｭｰﾊﾞｰにﾌｧｲﾙという項目を追加する
		m1 = new MenuItem("新規作成");	//[新規作成]のﾒﾆｭｰ項目を作成する
		m1.addActionListener(this);		//[新規作成]のActionListenerを登録する
		me.add(m1);						//[新規作成]のﾒﾆｭｰに追加する
		m2 = new MenuItem("開く");
		m2.addActionListener(this);
		me.add(m2);
		m3 = new MenuItem("閉じる");
		m3.addActionListener(this);
		me.add(m3);
		me.addSeparator();				//[閉じる]と[終了]の間にｾﾊﾟﾚｰﾀを追加する
		m4 = new MenuItem("終了");
		m4.addActionListener(this);
		me.add(m4);
		label = new Label();
		add(label);						//ﾗﾍﾞﾙをﾌﾚｰﾑに追加する
	}
	//ﾄﾞﾛｯﾌﾟﾀﾞｳﾝﾒﾆｭｰから項目が選択された場合
	public void actionPerformed(ActionEvent e)
	{
		Object item = e.getSource();	//ｵﾌﾞｼﾞｪｸﾄを取得する
		if(item==m1)					//[新規作成]が選択された際の処理
		{
			label.setText("新規作成が選択されました");
		}
		else if(item==m2)				//[開く]が選択された際の処理
		{
			label.setText("開くが選択されました");
		}
		else if(item==m3)				//[閉じる]が選択された際の処理
		{
			label.setText("閉じるが選択されました");
		}
		else							//[終了]が選択された際の処理
		{
			dispose();
		}
	}
}


