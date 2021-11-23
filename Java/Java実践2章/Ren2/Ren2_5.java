import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*<APPLET
	CODE=Ren2_5.class
	WIDTH=250
	HEIGHT=250 >
</APPLET>
*/

public class Ren2_5 extends Applet implements ActionListener,Runnable
{
	Button button1,button2,button3;
	CardLayout c = new CardLayout(20,100);
	int count=0;
	boolean stn = true;
	public void init()
	{
		Thread t = new Thread(this);//ｽﾚｯﾄﾞを作成する
		t.start();
		setLayout(c);		//setLayoutﾒｿｯﾄﾞを実行しCardLayoutを指定する
		button1 = new Button("Button1");
		button2 = new Button("Button2");
		button3 = new Button("Button3");
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		add(button1,"Button1");
		add(button2,"Button2");
		add(button3,"Button3");
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==button1)
		{
			c.show(this,"Button2");		//Button1がｸﾘｯｸされたらButton2を表示
		}
		else if(e.getSource()==button2)
		{
			c.show(this,"Button3");		//Button2がｸﾘｯｸされたらButton3を表示
		}
		else
		{
			c.show(this,"Button1");		//Button3がｸﾘｯｸされたらButton1を表示
		}
	}
	public void run()
	{
		try
		{
			while(stn)
			{
				if(count==0)
				{
					button1.setBackground(Color.red);
					button2.setBackground(Color.red);
					button3.setBackground(Color.red);
				}
				
			    else if(count==1)
				{
					button1.setBackground(Color.green);
					button2.setBackground(Color.green);
					button3.setBackground(Color.green);
				}
				else
				{
					button1.setBackground(Color.yellow);
				    button2.setBackground(Color.yellow);
					button3.setBackground(Color.yellow);
					
				}
				Thread.sleep(1000);	//1秒間待機
				count++;			//秒数を更新する
				if(count>2)
				{
					count=0;
				}
			}
		}
		catch(Exception e)
		{
			//例外が発生してもなにもしない
		}
	}
}

