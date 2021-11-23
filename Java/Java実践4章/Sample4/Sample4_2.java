import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*<APPLET
	CODE=Sample4_2.class
	WIDTH=250
	HEIGHT=250 >
</APPLET>
*/

public class Sample4_2 extends Applet implements ActionListener
{
	Button button1,button2;
	Sample4_2_1 frame;
	public void init()
	{
		button1 = new Button("Show");
		button2 = new Button("Hide");
		button1.addActionListener(this);
		button2.addActionListener(this);
		add(button1);
		add(button2);
		frame = new Sample4_2_1("Sample4_2_1");
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
class Sample4_2_1 extends Frame implements WindowListener
{
	Sample4_2_1(String title)
	{
		super(title);							//Frameのﾀｲﾄﾙを表示する
		setLayout(new FlowLayout());			//FlowLayoutﾓｰﾄﾞにする
		Label label = new Label("Java Frame");	//Labelｸﾗｽのｵﾌﾞｼﾞｪｸﾄを生成する
		add(label);								//ﾗﾍﾞﾙをﾌﾚｰﾑに追加する
		addWindowListener(this);				//ﾌﾚｰﾑをWindowListenerに登録する
	}
	//ﾌﾚｰﾑがｱｸﾃｨﾌﾞ状態になった際に実行される
	public void windowActivated(WindowEvent e)
	{
		System.out.println("Activated");
	}
	//ﾌﾚｰﾑが閉じられた後に実行される
	public void windowClosed(WindowEvent e)
	{
		System.out.println("Closed");
	}
	//ﾌﾚｰﾑが閉じた際に実行される
	public void windowClosing(WindowEvent e)
	{
		System.out.println("Closing");
		dispose();		//ﾌﾚｰﾑのﾘｿｰｽを解放する
	}
	//ﾌﾚｰﾑがｱｸﾃｨﾌﾞ状態でなくなると実行される
	public void windowDeactivated(WindowEvent e)
	{
		System.out.println("Deactivated");
	}
	//最小状態から通常の大きさになると実行される
	public void windowDeiconified(WindowEvent e)
	{
		System.out.println("Deiconified");
	}
	//最小状態になった際に実行される
	public void windowIconified(WindowEvent e)
	{
		System.out.println("Iconified");
	}
	//ﾌﾚｰﾑが可視状態になった際に実行される
	public void windowOpened(WindowEvent e)
	{
		System.out.println("Opened");
	}
}

