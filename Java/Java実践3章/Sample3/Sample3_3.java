import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*<APPLET
	CODE=Sample3_3.class
	WIDTH=250
	HEIGHT=250 >
</APPLET>
*/

public class Sample3_3 extends Applet implements MouseListener
{
	Label label;
	public void init()
	{
		label = new Label("               ");//Listｸﾗｽのｵﾌﾞｼﾞｪｸﾄを生成する
		add(label);						//ﾘｽﾄをｱﾌﾟﾚｯﾄに追加する
		addMouseListener(this);
	}
	public void mouseClicked(MouseEvent e){}
	public void mouseEntered(MouseEvent e){}
	public void mouseExited(MouseEvent e){}
	public void mousePressed(MouseEvent e)	//Mouseを押すと実行される
	{
		if(e.getModifiers()==InputEvent.BUTTON1_MASK)
		{
			label.setText("左ｸﾘｯｸ");
		}
		if(e.getModifiers()==InputEvent.BUTTON3_MASK)
		{
			label.setText("右ｸﾘｯｸ");
		}
	}
	public void mouseReleased(MouseEvent e){}
}


