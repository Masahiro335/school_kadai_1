import java.applet.*;
import java.awt.*;
/*<APPLET
	CODE=Sample2_15.class
	WIDTH=250
	HEIGHT=250 >
</APPLET>
*/

public class Sample2_15 extends Applet
{
	public void init()
	{
		//FlowLayoutｸﾗｽのｵﾌﾞｼﾞｪｸﾄを生成する
		FlowLayout fl = new FlowLayout(FlowLayout.LEFT,20,10);
		setLayout(fl);	//setLayoutﾒｿｯﾄﾞを実行し、FlowLayoutを指定する
		for(int i=0; i<50; i++)
		{
			add(new TextField());	//ﾃｷｽﾄﾌｨｰﾙﾄﾞをｱﾌﾟﾚｯﾄに追加する
		}
	}
}
