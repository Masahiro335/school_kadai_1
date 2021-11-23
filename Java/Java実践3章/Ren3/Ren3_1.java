import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*<APPLET
	CODE=Ren3_1.class
	WIDTH=250
	HEIGHT=250 >
</APPLET>
*/

public class Ren3_1 extends Applet implements MouseListener
{
	Label label;
	String moji;
	boolean left;
	public void init()
	{
		addMouseListener(this);
	}
	public void paint(Graphics g)
	{
		g.drawString(moji,100,100);
	}
	public void mouseClicked(MouseEvent e){}
	public void mouseEntered(MouseEvent e)
	{
		moji = "Entered";
		setBackground(Color.blue);
		repaint();
	}
	public void mouseExited(MouseEvent e)
	{
		moji = "Exited";
		setBackground(Color.yellow);
		repaint();
	}
	public void mousePressed(MouseEvent e)	//Mouse‚ğ‰Ÿ‚·‚ÆÀs‚³‚ê‚é
	{
		if(e.getModifiers()==InputEvent.BUTTON1_MASK)
		{
			moji = "Pressed";
			setBackground(Color.green);
			left = true;
			repaint();
		}
	}
	public void mouseReleased(MouseEvent e)
	{
		if(left==true)
		{
			moji = "Clicked";
			setBackground(Color.lightGray);
			left = false;
			repaint();
		}
	}
}


