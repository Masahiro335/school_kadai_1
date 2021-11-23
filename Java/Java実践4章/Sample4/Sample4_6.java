import java.awt.*;
import java.awt.event.*;

class Sample4_6
{
	public static void main(String args[])
	{
		Sample4_6_1 frame = new Sample4_6_1("Sample4_6");
		frame.setSize(250,250);
		frame.setVisible(true);
	}
}

class Sample4_6_1 extends Frame implements ActionListener,MouseListener
{
	Label label;
	PopupMenu pop;
	MenuItem m1,m2,m3,m4;
	Sample4_6_1(String title)
	{
		super(title);
		setLayout(new FlowLayout());
		pop = new PopupMenu("ﾌｧｲﾙ");
		m1 = new MenuItem("新規作成");
		m1.addActionListener(this);
		pop.add(m1);
		m2 = new MenuItem("開く");
		m2.addActionListener(this);
		pop.add(m2);
		m3 = new MenuItem("閉じる");
		m3.addActionListener(this);
		pop.add(m3);
		m4 = new MenuItem("終了");
		m4.addActionListener(this);
		pop.add(m4);
		add(pop);
		label = new Label("      ");
		add(label);
		addMouseListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		Object item = e.getSource();
		if(item==m1)						//[新規作成]が選択された際の処理
		{
			label.setText("新規作成");
		}
		else if(item==m2)					//[開く]が選択された際の処理
		{
			label.setText("開く");
		}
		else if(item==m3)					//[閉じる]が選択された際の処理
		{
			label.setText("閉じる");
		}
		else								//[終了]が選択された際の処理
		{
			System.exit(0);
		}
	}
	public void mouseClicked(MouseEvent e){}
	public void mouseEntered(MouseEvent e){}
	public void mouseExited(MouseEvent e){}
	public void mousePressed(MouseEvent e){}
	public void mouseReleased(MouseEvent e)
	{
		if(e.getModifiers()==InputEvent.BUTTON3_MASK)
		{
			//右ｸﾘｯｸならﾏｳｽﾎﾟｲﾝﾀの位置にﾎﾟｯﾌﾟｱｯﾌﾟﾒﾆｭｰを表示する
			pop.show(this,e.getX(),e.getY());
		}
	}
}


