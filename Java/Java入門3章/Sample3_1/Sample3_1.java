class Sample3_1
{
	//ﾒｿｯﾄﾞ名	：main
	//処理名	：Kadai3_1ｸﾗｽのK3_1ﾒｿｯﾄﾞを実行し、戻り値をﾃﾞｨｽﾌﾟﾚｲに表示する
	//引数		：ｷｰﾎﾞｰﾄﾞから入力された文字列
	//戻り値	：なし
	public static void main(String args[])
	{
		Kadai3_1 c = new Kadai3_1();	//Kadai3_1ｸﾗｽのｲﾝｽﾀﾝｽを生成する
		int kekka = c.k3_1(args[0]);	//k3_1ﾒｿｯﾄﾞを実行する
		//k3_1ﾒｿｯﾄﾞの実行結果をﾃﾞｨｽﾌﾟﾚｲに表示する
		System.out.println("ｷｰﾎﾞｰﾄﾞから入力された文字数は"+kekka+"文字です");
	}
}


class Kadai3_1
{
	//ﾒｿｯﾄﾞ		:k3_1
	//処理概要	:引数mojiの文字数を戻り値に設定する
	//引数		:moji=文字列
	//戻り値	:引数mojiの文字数
	int k3_1(String moji)
	{
		return moji.length();	//引数で指定されたStringｵﾌﾞｼﾞｪｸﾄの文字数を
								//戻り値に設定する
	}
}

