import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*<APPLET
	CODE=Sample3_1.class
	WIDTH=250
	HEIGHT=250 >
</APPLET>
*/

public class Sample3_1 extends Applet implements MouseListener,MouseMotionListener
{
	List list;
	public void init()
	{
		list = new List(15);			//Listｸﾗｽのｵﾌﾞｼﾞｪｸﾄを生成する
		add(list);						//ﾘｽﾄをｱﾌﾟﾚｯﾄに追加する
		addMouseListener(this);			//MouseListenerに登録する
		addMouseMotionListener(this);	//MouseMotionListenerに登録する
	}
	public void mouseClicked(MouseEvent e)	//MouseをClickすると実行される
	{
		list.add("Clicked");
	}
	public void mouseEntered(MouseEvent e)	//MouseをAppletの中に移動すると実行される
	{
		list.add("Entered");
	}
	public void mouseExited(MouseEvent e)	//MouseをAppletの外に移動すると実行される
	{
		list.add("Exited");
	}
	public void mousePressed(MouseEvent e)	//Mouseを押すと実行される
	{
		list.add("Pressed");
	}
	public void mouseReleased(MouseEvent e)	//MousePressedの後にMouseを離すと実行される
	{
		list.add("Released");
	}
	public void mouseDragged(MouseEvent e)	//Mouseをドラッグすると実行される
	{
		list.add("Dragged");
	}
	public void mouseMoved(MouseEvent e)	//Mouseを移動すると実行される
	{
		//Mouseを移動するたびに実行されるためﾘｽﾄには加えない
	}
}

