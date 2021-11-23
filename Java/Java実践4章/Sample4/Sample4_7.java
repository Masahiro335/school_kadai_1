import java.awt.*;
import java.awt.event.*;

class Sample4_7
{
	public static void main(String args[])
	{
		Sample4_7_1 frame = new Sample4_7_1("Sample4_7");
		frame.setSize(250,250);
		frame.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);		//ﾌﾚｰﾑが閉じられたらｱﾌﾟﾘｹｰｼｮﾝを終了する
			}
		});
		frame.setVisible(true); 	//ﾌﾚｰﾑを表示する
	}
}
class Sample4_7_1 extends Frame implements ActionListener
{
	Checkbox check1,check2;
	Sample4_7_1(String title)
	{
		super(title);
		setLayout(new FlowLayout());
		Button button = new Button("Dialog");
		button.addActionListener(this);
		CheckboxGroup g = new CheckboxGroup();
		check1 = new Checkbox("ﾓｰﾀﾞﾙ",g,true);
		check2 = new Checkbox("ﾓｰﾄﾞﾚｽ",g,false);
		add(button);		//ﾌﾚｰﾑにDialogﾎﾞﾀﾝを追加する
		add(check1);		//ﾌﾚｰﾑにﾓｰﾀﾞﾙﾎﾞﾀﾝを追加する
		add(check2);		//ﾌﾚｰﾑにﾓｰﾄﾞﾚｽﾎﾞﾀﾝを追加する
	}
	public void actionPerformed(ActionEvent e)
	{
		//Dialogﾎﾞﾀﾝがｸﾘｯｸされたら以下の処理を行う
		Sample4_7_2 dialog;
		if(check1.getState()==true)		//ﾓｰﾀﾞﾙでﾀﾞｲｱﾛｸﾞｵﾌﾞｼﾞｪｸﾄを生成する
		{
			dialog = new Sample4_7_2(this,"Sample4_7_1",true);
		}
		else		//ﾓｰﾄﾞﾚｽでﾀﾞｲｱﾛｸﾞｵﾌﾞｼﾞｪｸﾄを生成する
		{
			dialog = new Sample4_7_2(this,"Sample4_7_1",false);
		}
		dialog.setSize(150,150);
		dialog.setLocation(300,0);
		dialog.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);		//ｳｨﾝﾄﾞｳが閉じられたらｱﾌﾟﾘｹｰｼｮﾝを終了する
			}
		});
		dialog.setVisible(true);	//ﾀﾞｲｱﾛｸﾞﾎﾞｯｸｽを表示する
	}
}
class Sample4_7_2 extends Dialog implements ActionListener
{
	Button cancel;
	Sample4_7_2(Frame frame,String title, boolean mode)
	{
		super(frame,title,mode);		//ﾀﾞｲｱﾛｸﾞﾎﾞｯｸｽのﾀｲﾄﾙを表示する
		setLayout(new FlowLayout());
		cancel = new Button("Cancel");
		add(cancel);					//Cancelﾎﾞﾀﾝをﾀﾞｲｱﾛｸﾞに追加する
		cancel.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)	//Cancelﾎﾞﾀﾝがｸﾘｯｸされたら以下の処理を行う
	{
		setVisible(false);						//ﾀﾞｲｱﾛｸﾞﾎﾞｯｸｽを非表示にする
	}
}


