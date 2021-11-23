import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*<APPLET
	CODE=Ren3_2.class
	WIDTH=250
	HEIGHT=250 >
</APPLET>
*/

public class Ren3_2 extends Applet implements ItemListener,KeyListener
{
	TextField text1,text2,text3;
	Checkbox option1,option2;
	char moji;
	int Code;
	boolean kekka;
	public void init()
	{
		text1 = new TextField(15);
		text2 = new TextField(15);
		text3 = new TextField(15);
		text1.addKeyListener(this);
		text2.addKeyListener(this);
		text3.addKeyListener(this);
		
		CheckboxGroup group = new CheckboxGroup();
		option1 = new Checkbox("KeyChar",group,true);
		option2 = new Checkbox("KeyCode",group,true);
		option1.addItemListener(this);
		option2.addItemListener(this);
		add(option1);
		add(text1);
		add(option2);
		add(text2);
		add(text3);
	}
	
	public void itemStateChanged(ItemEvent e)
	{
		if(e.getItemSelectable()==option1)
		{
			if(kekka==false)
			{
				text2.setText("");
			}
			kekka = true;
		}
		else if(e.getItemSelectable()==option2)
		{
			if(kekka==true)
			{
				text1.setText("");
			}
			kekka = false;
		}
	}
	
	public void keyPressed(KeyEvent a)
	{
		if(kekka==true)
		{
			
			moji=a.getKeyChar();
		}
		else
		{
			Code=a.getKeyCode();
		}
	}
	public void keyTyped(KeyEvent a)
	{
		if(kekka==true)
		{
			text1.setText(moji+"");
		}
		else
		{
			text2.setText(Code+"");
		}
	}
	public void keyReleased(KeyEvent a){}
}

