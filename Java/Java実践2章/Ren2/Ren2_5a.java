import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*<APPLET
	CODE=Ren2_5a.class
	WIDTH=250
	HEIGHT=250 >
</APPLET>
*/

public class Ren2_5a extends Applet implements Runnable
{
	int i;
	int count;		//秒数
	boolean stn=true;	//ｱﾌﾟﾚｯﾄの状態	
	Button button[] = new Button[10];
	CardLayout c = new CardLayout(20,100);
	Color color[] = {Color.blue,Color.cyan,Color.gray,Color.green,Color.magenta,Color.orange,
                 Color.pink,Color.red,Color.white,Color.yellow};
	public void init()
	{
		Thread t = new Thread(this);//ｽﾚｯﾄﾞを作成する
		t.start();
		setLayout(c);		//setLayoutﾒｿｯﾄﾞを実行しCardLayoutを指定する
		for(i=0; i<10; i++)
		{
			button[i] = new Button("Button"+(i+1));
			button[i].setBackground(color[i]);
			add(button[i],"Button"+(i+1));
		}
	}

	public void run()
	{
		try
		{
			while(stn)
			{
				Thread.sleep(1000);	//1秒間待機
				c.next(this);
			}
		}
		catch(Exception e)
		{
			//例外が発生してもなにもしない
		}
	}
}

