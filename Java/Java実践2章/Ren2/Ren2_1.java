import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*<APPLET
	CODE=Ren2_1.class
	WIDTH=250
	HEIGHT=250 >
</APPLET>
*/

public class Ren2_1 extends Applet implements ActionListener,Runnable
{
	int count;		//秒数
	boolean stn;	//ｱﾌﾟﾚｯﾄの状態
	Button button;	
	public void init()
	{
		button = new Button("START");		//Buttonｸﾗｽのｵﾌﾞｼﾞｪｸﾄを生成する
		button.addActionListener(this);		//STARTﾎﾞﾀﾝをActionListenerに登録する
		add(button);						//STARTﾎﾞﾀﾝをｱﾌﾟﾚｯﾄに追加する
	}
	public void paint(Graphics g)
	{
	    int t;		//タイム
	    int set=10;	//初期設定
		if(count==0||stn==true)
		{
			g.drawString(set+"秒経ったらSTOPﾎﾞﾀﾝを押してください",40,120);
		}
		else
		{
			if(0<count && count<set)
			{
				t = set-count;
				g.drawString(""+t+"秒足りません",40,120);
			}
			else if(count>set)
			{
				t = count-set;
				g.drawString(""+t+"秒オーバーです",40,120);
			}
			else if(count==set)
			{
				g.drawString("丁度"+set+"秒です",40,120);
			}
		}
	}
	public void actionPerformed(ActionEvent e)
	{
		if(button.getLabel()=="START")
		{
			//STARTﾎﾞﾀﾝがｸﾘｯｸされたら以下の処理を行う
		    count = 0;					//経過秒数を初期化する
			stn = true;					//状態を[秒数ｶｳﾝﾄ中]とする
			Thread t = new Thread(this);//ｽﾚｯﾄﾞを作成する
			t.start();					//ｽﾚｯﾄﾞを実行する
			button.setLabel("STOP");	//ﾎﾞﾀﾝをSTARTからSTOPに変更
		}
		else
		{
			//STOPﾎﾞﾀﾝがｸﾘｯｸされたら以下の処理を行う
			stn = false;				//状態を[秒数ｶｳﾝﾄ中]とする
			button.setLabel("START");	//ﾎﾞﾀﾝをSTOPからSTARTに変更
			repaint();			//秒数ｶｳﾝﾄ中であれば秒数を再表示
		}
	}
	public void run()
	{
		try
		{
			while(stn)
			{
				repaint();			//秒数ｶｳﾝﾄ中であれば秒数を再表示
				Thread.sleep(1000);	//1秒間待機
				count++;			//秒数を更新する
			}
		}
		catch(Exception e)
		{
			//例外が発生してもなにもしない
		}
	}
}





