import java.util.*;
class Ren4_1
{
	Date r4_1(int day)
	{
		Date d = new Date();	
		long m = d.getTime();	//基準時からの経過時間(現在時刻)を取得する
		long n = day*24*60*60;	//day日後の年月日を計算する
		n *= 1000;				//値はﾐﾘ秒なので最後に1000を掛ける
		m+=n;					//現在時刻にday日後の時刻を足す
		d.setTime(m);			//時刻を更新する
		return(d);
	}
}

class RenMain4_1
{
	public static void main(String args[])
	{
		int day = Integer.parseInt(args[0]);
		Calendar cal = Calendar.getInstance();
		Ren4_1 c = new Ren4_1();
		cal.setTime(c.r4_1(day));
		System.out.println(day+"日後の年月日："+cal.get(Calendar.YEAR)+"年"+(cal.get(Calendar.MONTH)+1)+"月"
							+cal.get(Calendar.DATE)+"日");
	}
}



