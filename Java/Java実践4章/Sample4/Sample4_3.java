import java.awt.*;
import java.awt.event.*;

class Sample4_3
{
	public static void main(String args[])
	{
		Sample4_3_1 frame = new Sample4_3_1("Sample4_3");
		frame.setSize(250,250);		//ﾌﾚｰﾑのｻｲｽﾞを指定する
		frame.setVisible(true);		//ﾌﾚｰﾑを表示する
	}
}

class Sample4_3_1 extends Frame implements ActionListener
{
	Label label;
	MenuItem m1,m2,m3,m4;
	Sample4_3_1(String title)
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
			System.exit(0);
		}
	}
}


