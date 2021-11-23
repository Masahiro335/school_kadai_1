class Sample3_3
{
	//ﾒｿｯﾄﾞ名	：main
	//処理名	：Kadai3_3ｸﾗｽのK3_3ﾒｿｯﾄﾞを実行し、戻り値をﾃﾞｨｽﾌﾟﾚｲに表示する
	//引数		：ｷｰﾎﾞｰﾄﾞから入力された文字列
	//戻り値	：なし
	public static void main(String args[])
	{
		Kadai3_3 c = new Kadai3_3();	//Kadai3_3ｸﾗｽのｲﾝｽﾀﾝｽを生成する
		String kekka = c.k3_3(args[0]);	//k3_3ﾒｿｯﾄﾞを実行する
		//k3_3ﾒｿｯﾄﾞの実行結果をﾃﾞｨｽﾌﾟﾚｲに表示する
		System.out.println("処理結果は"+kekka+"です");
	}
}


class Kadai3_3
{
	//ﾒｿｯﾄﾞ		:k3_3
	//処理概要	:引数mojiの文字を反転させ、Stringｵﾌﾞｼﾞｪｸﾄにして返す
	//引数		:moji=Stringｵﾌﾞｼﾞｪｸﾄ
	//戻り値	:引数mojiを反転させたStringｵﾌﾞｼﾞｪｸﾄ
	String k3_3(String moji)
	{
		StringBuffer sb = new StringBuffer(moji);
		sb = sb.reverse();		//文字列を反転させる
		return sb.toString();	//反転させた文字列を戻り値に設定する
	}
}

