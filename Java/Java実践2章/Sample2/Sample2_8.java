import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*<APPLET
	CODE=Sample2_8.class
	WIDTH=250
	HEIGHT=250 >
</APPLET>
*/

public class Sample2_8 extends Applet implements ItemListener
{
	Label label;
	Checkbox check1,check2,check3;
	public void init()
	{
		setLayout(null);		//Layout managerを使用しない
		Font font = new Font("Serif",Font.PLAIN,18);
		label = new Label("文字飾り");
		label.setSize(80,20);
		label.setLocation(20,20);
		label.setFont(font);
		add(label);
		//Checkboxｵﾌﾞｼﾞｪｸﾄを生成する
		check1 = new Checkbox("飾りなし",true);
		check2 = new Checkbox("斜体");
		check3 = new Checkbox("強調");
		//check1,2,3をItemListenerに登録
		check1.addItemListener(this);
		check2.addItemListener(this);
		check3.addItemListener(this);
		//check1,2,3のｻｲｽﾞと表示位置を指定する
		check1.setSize(80,20);
		check2.setSize(80,20);
		check3.setSize(80,20);
		check1.setLocation(20,60);
		check2.setLocation(20,80);
		check3.setLocation(20,100);
		//check1,2,3をｱﾌﾟﾚｯﾄに追加する
		add(check1);
		add(check2);
		add(check3);
	}
	public void itemStateChanged(ItemEvent e)
	{
		int ft = Font.PLAIN;				//ﾌｫﾝﾄをPLAINに指定する
		if(e.getItemSelectable()==check1)	//飾りなしなら以下の処理を行う
		{
			if(check1.getState()==true)		//飾りなしがﾁｪｯｸ状態なら以下の処理を行う
			{
				check2.setState(false);		//斜体を未ﾁｬｯｸする
				check3.setState(false);		//強調を未ﾁｬｯｸする
			}
			else							//飾りなし未ﾁｬｯｸ状態なら以下の処理を行う
			{
				if(check2.getState()==false && check3.getState()==false)
				{
					//斜体も強調も未ﾁｬｯｸなら以下の処理を行う
					check1.setState(true);	//飾りなしをﾁｬｯｸ状態にする
				}
			}
		}
		else if(e.getItemSelectable()==check2)	//斜体なら以下の処理を行う
		{
			if(check2.getState()==true)			//斜体がﾁｪｯｸ状態なら以下の処理を行う
			{
				ft = Font.ITALIC;				//ﾌｫﾝﾄをITALICに指定する
				if(check3.getState()==true)		//強調がﾁｪｯｸ状態なら以下の処理を行う
				{
					ft+=Font.BOLD;				//ﾌｫﾝﾄをBOLDに指定する
				}
				check1.setState(false);			//飾りなしを未ﾁｬｯｸにする
			}
			else								//斜体が未ﾁｬｯｸ状態なら以下の処理を行う
			{
				if(check3.getState()==false)	//強調が未ﾁｬｯｸ状態なら以下の処理を行う
				{
					check1.setState(true);		//飾りなしをﾁｬｯｸ状態にする
				}
				else
				{
					ft = Font.BOLD;
				}
			}
		}
		else if(e.getItemSelectable()==check3)	//強調がｸﾘｯｸされたら以下の処理を行う
		{
			if(check3.getState()==true)			//強調がﾁｪｯｸ状態なら以下の処理を行う
			{
				ft = Font.BOLD;					//ﾌｫﾝﾄをBOLDに指定する
				if(check2.getState()==true)		//斜体がﾁｪｯｸ状態なら以下の処理を行う
				{
					ft +=Font.ITALIC;			//ﾌｫﾝﾄをITALICに指定する
				}
				check1.setState(false);			//飾りなしを未ﾁｬｯｸにする
			}
			else								//強調が未ﾁｬｯｸ状態なら以下の処理を行う
			{	
				if(check2.getState()==false)	//斜体が未ﾁｬｯｸ状態なら以下の処理を行う
				{
					check1.setState(true);		//飾りなしをﾁｬｯｸ状態にする
				}
				else							//斜体がﾁｬｯｸ状態なら以下の処理を行う
				{
					ft = Font.ITALIC;			//ﾌｫﾝﾄをITALICに指定する
				}
			}
		}
		Font font = new Font("Serif",ft,18);	//上記の結果を踏まえﾌｫﾝﾄを指定する
		label.setFont(font);					//ﾗﾍﾞﾙのﾌｫﾝﾄを変更する
	}
}




