class Ren5_1_1 extends Thread
{
	public void run()
	{
		Thread t = this.currentThread();
		System.out.println("Ren5_1_1‚ÌThread");
	}
}

class Ren5_1_2 extends Thread
{
	public void run()
	{
		Thread t = this.currentThread();
		System.out.println("Ren5_1_2‚ÌThread");
	}
}

class Ren5_1_3 extends Thread
{
	public void run()
	{
		Thread t = this.currentThread();
		System.out.println("Ren5_1_3‚ÌThread");
	}
}

class RenMain5_1
{
	public static void main(String args[])
	{
		Ren5_1_1  t1 = new  Ren5_1_1();
		Ren5_1_2  t2 = new  Ren5_1_2();
		Ren5_1_3  t3 = new  Ren5_1_3();
		int r = Integer.parseInt(args[0]);
		switch(r)
		{
			case 1:
				t1.setPriority(Thread.MAX_PRIORITY);
				t2.setPriority(Thread.NORM_PRIORITY);
				t3.setPriority(Thread.MIN_PRIORITY);
			case 2:
				t1.setPriority(Thread.MIN_PRIORITY);
				t2.setPriority(Thread.MAX_PRIORITY);
				t3.setPriority(Thread.NORM_PRIORITY);
			case 3:
				t1.setPriority(Thread.NORM_PRIORITY);
				t2.setPriority(Thread.MIN_PRIORITY);
				t3.setPriority(Thread.MAX_PRIORITY);
		}
		t1.start();
		t2.start();
		t3.start();
	}
}
