class Sample2_3{
	/*ﾒｿｯﾄﾞ名	：main
	  処理概要	：1から100までの数の加算値を計算するKadai2_3ｸﾗｽのK2_3ﾒｿｯﾄﾞを実行し
	  			  Sample2_3ｸﾗｽの静的変数totalの値をﾃﾞｨｽﾌﾟﾚｲに表示する
	  引数		：ｷｰﾎﾞｰﾄﾞから入力された値
	  戻り値	：なし*/
	static int total;	//1から100までの数の加算値を格納する静的変数を宣言する
	public static void main(String args[])
	{
		Kadai2_3.k2_3();	//Kadai2_3ｸﾗｽのk2_3ﾒｿｯﾄﾞを実行する
		//変数totalの値をﾃﾞｨｽﾌﾟﾚｲに表示する
		System.out.println("1から100の積算値は"+total+"です");
	}
}	

class Kadai2_3{
	/*ﾒｿｯﾄﾞ名	：k2_3
	  処理概要	：1から100までの数の加算値をSample2_3ｸﾗｽに宣言されている
				  静的変数totalに設定する
	  引数		：なし
	  戻り値	：なし
	  備考		：本ﾒｿｯﾄﾞは静的ﾒｿｯﾄﾞとする。*/
	static void k2_3()
	{
		for(int i=1; i<101; i++)
		{
			Sample2_3.total+=i;		//1から100までの加算結果をtotalに設定する
		}
	}
}	
