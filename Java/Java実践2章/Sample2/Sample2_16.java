import java.applet.*;
import java.awt.*;
/*<APPLET
	CODE=Sample2_16.class
	WIDTH=250
	HEIGHT=250 >
</APPLET>
*/

public class Sample2_16 extends Applet
{
	public void init()
	{
		//BorderLayoutｸﾗｽのｵﾌﾞｼﾞｪｸﾄを生成する
		BorderLayout bl = new BorderLayout(5,5);
		setLayout(bl);	//setLayoutﾒｿｯﾄﾞを実行し、BorderLayoutを指定する
		//Buttonｸﾗｽのｵﾌﾞｼﾞｪｸﾄを5つ生成する
		Button button1 = new Button("button1");
		Button button2 = new Button("button2");
		Button button3 = new Button("button3");
		Button button4 = new Button("button4");
		Button button5 = new Button("button5");
		add(button1,"North");	//button1を上に配置する
		add(button2,"South");	//button2を下に配置する
		add(button3,"East");	//button3を右端に配置する
		add(button4,"West");	//button4を左端に配置する
		add(button5,"Center");	//button5を中央に配置する
	}
}

