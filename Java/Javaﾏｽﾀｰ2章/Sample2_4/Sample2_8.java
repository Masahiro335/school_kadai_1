class Sample2_8
{
	public static void main(String args[])
	{
		System.out.println("GC1");
		GC1g = new GC1();				//GC1ｸﾗｽのｵﾌﾞｼﾞｪｸﾄを生成する
		System.out.println("GC2");
		g = null;						//GC1ｸﾗｽのｵﾌﾞｼﾞｪｸﾄにnullを代入
		System.out.println("GC3");
		System.gc();					//ｶﾞｰﾍﾞｯｼﾞｺﾚｸｼｮﾝの実行を施す
		System.out.println("GC4");
	}
}

class GC1
{
	public void finalize()		//GC1ｸﾗｽのfinalizeﾒｿｯﾄﾞ
	{
		System.out.println("--finaliza--")
	}
}







