import java.awt.*;
import java.awt.event.*;

class Ren4_1
{
	public static void main(String args[])
	{
		Ren4_1_1 frame = new Ren4_1_1("Ren4_1");
		frame.setSize(250,250);		//ÌÚ°Ñ‚Ì»²½Þ‚ðŽw’è‚·‚é
		frame.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
		frame.setVisible(true);
	}
}

class Ren4_1_1 extends Frame implements ActionListener
{
	Label label;
	MenuItem me1,me2,m1_1,m1_2,m1_3,m1_4,m2_1,m2_2,m2_3,m2_2_1,m2_2_2;
	Ren4_1_1(String title)
	{
		super(title);
		MenuBar mb = new MenuBar();
		setMenuBar(mb);					
		Menu m1 = new Menu("Menu1");
		mb.add(m1);
		m1_1 = new MenuItem("Menu1_1");
		m1_1.addActionListener(this);
		m1.add(m1_1);
		m1_2 = new MenuItem("Menu1_2");
		m1_2.addActionListener(this);
		m1.add(m1_2);
		m1_3 = new MenuItem("Menu1_3");
		m1_3.addActionListener(this);
		m1.add(m1_3);
		m1.addSeparator();
		m1_4 = new MenuItem("Exit");
		m1_4.addActionListener(this);
		m1.add(m1_4);
		
		Menu m2 = new Menu("Menu2");
		mb.add(m2);			
		m2_1 = new MenuItem("Menu2_1");
		m2_1.addActionListener(this);
		m2.add(m2_1);
		Menu m2_2 = new Menu("Menu2_2");
		m2_2.addActionListener(this);
		m2.add(m2_2);
		m2_2_1 = new MenuItem("Menu2_2_1");
		m2_2_1.addActionListener(this);
		m2_2.add(m2_2_1);
		m2_2_2 = new MenuItem("Menu2_2_2");
		m2_2_2.addActionListener(this);
		m2_2.add(m2_2_2);		
		m2_3 = new MenuItem("Menu2_3");
		m2_3.addActionListener(this);
		m2.add(m2_3);
		label = new Label();
		add(label);	

	}
	public void actionPerformed(ActionEvent e)
	{
		
		Object item = e.getSource();
		if(item==m1_1)
		{
			label.setText("Menu1_1");
		}
		else if(item==m1_2)
		{
			label.setText("Menu1_2");
		}
		else if(item==m1_3)
		{
			label.setText("Menu1_3");
		}
		else if(item==m1_4)
		{
			dispose();
		}
		else if(item==m2_1)
		{
			label.setText("Menu2_1");
		}
		else if(item==m2_2_1)
		{
			label.setText("Menu2_2_1");
		}
		else if(item==m2_2_2)
		{
			label.setText("Menu2_2_2");
		}
		else if(item==m2_3)
		{
			label.setText("Menu2_3");
		}
	}
}


