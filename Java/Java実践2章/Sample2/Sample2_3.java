import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*<APPLET
	CODE=Sample2_3.class
	WIDTH=250
	HEIGHT=250 >
</APPLET>
*/

public class Sample2_3 extends Applet implements ActionListener
{
	Label label;
	Button button1,button2;
	public void init()
	{
		button1 = new Button("OK"); 		//Button1¸×½‚ÌµÌŞ¼Şª¸Ä‚ğ¶¬‚·‚é
		button2 = new Button("Cancel"); 	//Button2¸×½‚ÌµÌŞ¼Şª¸Ä‚ğ¶¬‚·‚é
		button1.addActionListener(this);	//OKÎŞÀİ‚ğActionListener‚É“o˜^‚·‚é
		button2.addActionListener(this);	//CancelÎŞÀİ‚ğActionListener‚É“o˜^‚·‚é
		add(button1);						//OKÎŞÀİ‚ğ±ÌßÚ¯Ä‚É’Ç‰Á‚·‚é
		add(button2);						//CancelÎŞÀİ‚ğ±ÌßÚ¯Ä‚É’Ç‰Á‚·‚é
		label = new Label("                      ");//Label¸×½‚ÌµÌŞ¼Şª¸Ä‚ğ¶¬‚·‚é
		add(label);							//×ÍŞÙ‚ğ±ÌßÚ¯Ä‚É’Ç‰Á‚·‚é
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==button1)
		{
			label.setText("OK Button");	
			//OKÎŞÀİ‚ª¸Ø¯¸‚³‚ê‚½‚çOK Button‚Æ•\¦
		}
		else
		{
			label.setText("Cancel Button");	
			//CancellÎŞÀİ‚ª¸Ø¯¸‚³‚ê‚½‚çCancel Button‚Æ•\¦
		}
	}
}


