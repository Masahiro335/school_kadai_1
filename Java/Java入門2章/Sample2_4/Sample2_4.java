class Sample2_4{
	/*ﾒｿｯﾄﾞ名	：main
	  処理概要	：1から100までの数の加算値を計算するKadai2_4ｸﾗｽの
	  			  ｲﾝｽﾀﾝｽﾒｿｯﾄﾞK2_4ﾒｿｯﾄﾞを実行し、戻り値をﾃﾞｨｽﾌﾟﾚｲに表示する
	  			  Sample2_4ｸﾗｽの静的変数totalの値をﾃﾞｨｽﾌﾟﾚｲに表示する
	  引数		：ｷｰﾎﾞｰﾄﾞから入力された値
	  戻り値	：なし*/
	public static void main(String args[])
	{
		Kadai2_4 c=new Kadai2_4();	//Kadai2_4ｸﾗｽのｲﾝｽﾀﾝｽを生成する
		int kekka = c.k2_4();			//Kadai2_4ｸﾗｽのk2_4ﾒｿｯﾄﾞを実行する
		//K2_4ﾒｿｯﾄﾞの実行結果をﾃﾞｨｽﾌﾟﾚｲに表示する
		System.out.println("1から100の積算値は"+kekka+"です");
	}
}	

class Kadai2_4{
	/*ﾒｿｯﾄﾞ名	：k2_4
	  処理概要	：1から100までの数の加算値を計算し、戻り値に設定する
	  引数		：なし
	  戻り値	：1から100までの数の加算結果
	  備考		：本ﾒｿｯﾄﾞはｲﾝｽﾀﾝｽﾒｿｯﾄﾞとする。*/
	int k2_4()
	{
		int i,total=0;
		for(i=1; i<101; i++)
		{
			total+=i;		//1から100までの加算結果を求める
		}
		return total;
	}
}	
