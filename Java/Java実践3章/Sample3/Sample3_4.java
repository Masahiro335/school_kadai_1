import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*<APPLET
	CODE=Sample3_4.class
	WIDTH=250
	HEIGHT=250 >
</APPLET>
*/

public class Sample3_4 extends Applet implements ActionListener,TextListener,KeyListener
{
	TextField text1;
	TextArea text2,text3;
	public void init()
	{
		text1 = new TextField(10);
		text2 = new TextArea(5,20);
		text3 = new TextArea(5,20);
		text1.setEchoChar('*');
		text1.addActionListener(this);
		text1.addActionListener(this);
		text1.addTextListener(this);
		text1.addKeyListener(this);
		add(text1);
		add(text2);
		add(text3);
	}
	public void actionPerformed(ActionEvent a)	//Enterｷｰを押すと実行される
	{
		text3.append("Enter key\n");			//下段のﾃｷｽﾄｴﾘｱにEnter keyと表示する
	}
	public void textValueChanged(TextEvent a)	//ﾃｷｽﾄﾌｨﾙｰﾄﾞの内容が変わると実行される
	{
		text2.append(text1.getText()+"\n");		//上段のﾃｷｽﾄｴﾘｱにﾃｷｽﾄﾌｨﾙｰﾄﾞの値を表示
	}
	public void keyPressed(KeyEvent a)			//ｷｰを押すと実行される
	{
		text3.append("Key Pressed\n");			//下段のﾃｷｽﾄｴﾘｱにKey Pressed
		//下段のﾃｷｽﾄｴﾘｱにｷｰｺｰﾄﾞを表示する
		text3.append("Cord:"+a.getKeyCode()+"\n");
	}
	public void keyTyped(KeyEvent a)			//keyPressedの後に実行される
	{
		text3.append("Key Typed\n");			//下段のﾃｷｽﾄｴﾘｱにKey Typedと表示する
	}
	public void keyReleased(KeyEvent a)			//ｷｰを放すと実行される
	{
		text3.append("Key Released\n");			//text3にKey Releasedと表示する
	}
}

