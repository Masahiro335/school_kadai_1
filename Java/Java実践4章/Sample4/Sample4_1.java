import java.awt.*;
import java.awt.event.*;

class Sample4_1
{
	public static void main(String args[])
	{
		Sample4_1_1 frame = new Sample4_1_1("Sample4_1");
		frame.setSize(250,250);	//ﾌﾚｰﾑｻｲｽﾞを指定する
		frame.setVisible(true);	//ﾌﾚｰﾑを表示する
	}
}	
class Sample4_1_1 extends Frame implements WindowListener
{
	Sample4_1_1(String title)
	{
		super(title);							//Frameのﾀｲﾄﾙを表示する
		Label label = new Label("Java Frame");	//Labelｸﾗｽのｵﾌﾞｼﾞｪｸﾄを生成する
		add(label);								//ﾗﾍﾞﾙをﾌﾚｰﾑに追加する
		addWindowListener(this);				//ﾌﾚｰﾑをWindowListenerに登録する
	}
	//ﾌﾚｰﾑがｱｸﾃｨﾌﾞ状態になった際に実行される
	public void windowActivated(WindowEvent e){}
	//ﾌﾚｰﾑが閉じられた後に実行される
	public void windowClosed(WindowEvent e){}
	//ﾌﾚｰﾑが閉じた際に実行される
	public void windowClosing(WindowEvent e)
	{
		System.exit(0);		//ｱﾌﾟﾘｹｰｼｮﾝを終了する
	}
	//ﾌﾚｰﾑがｱｸﾃｨﾌﾞ状態でなくなると実行される
	public void windowDeactivated(WindowEvent e){}
	//最小状態から通常の大きさになると実行される
	public void windowDeiconified(WindowEvent e){}
	//最小状態になった際に実行される
	public void windowIconified(WindowEvent e){}
	//ﾌﾚｰﾑが可視状態になった際に実行される
	public void windowOpened(WindowEvent e){}
}

