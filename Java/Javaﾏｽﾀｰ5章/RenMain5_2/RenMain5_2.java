import java.util.*;
class RenMain5_2
{
	public static void main(String args[])
	{
		int w = Integer.parseInt(args[0]);;
		Ren5_2 c = new Ren5_2(w);
		Thread t = new Thread(c);
		Date s = new Date();
		long a = s.getTime();
		t.start();
		try
		{
			t.join();
			Date e = new Date();
			long b =e.getTime();
			System.out.println("ｽﾚｯﾄﾞが実行されてから終了するまで"+(b-a)+"m秒です");
		}
		catch(InterruptedException d)
		{
			return;
		}		
	}
}

class Ren5_2 implements Runnable
{
	int wt;		//ｽﾚｯﾄﾞの待機秒数(mesec)
	Ren5_2(int d)
	{
		wt = d;	//ｽﾚｯﾄﾞの待機秒数を設定する
	}
	public void run()
	{
		try
		{
			Thread.sleep(wt); //wtで指定された秒数(msec)だけ待機する
		}
		catch(InterruptedException d)
		{
			return;
		}
	}
}


