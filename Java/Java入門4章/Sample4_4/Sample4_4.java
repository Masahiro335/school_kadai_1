class Kadai4_4
{
	//Kadai4_4ｸﾗｽのｲﾝｽﾀﾝｽ変数を宣言
	String name;		//氏名
	int age;			//年齢
	char seibetsu;		//性別
	void k4_4(String p1)
	{
		name = p1;		//氏名を設定
	}
	void k4_4(String p1,int p2)
	{
		name = p1;		//氏名を設定
		age = p2;		//年齢を設定
	}
	void k4_4(String p1,int p2,char p3)
	{
		name = p1;		//氏名を設定
		age = p2;		//年齢を設定
		seibetsu = p3;	//性別を設定
	}
}

class Sample4_4
{
	public static void main(String args[])
	{
		int p2;
		char p3;
		//ｷｰﾎﾞｰﾄﾞから入力された値が1から3種類のﾃﾞｰﾀであれば以下の処理を行う
		if(args.length>0 && args.length<4)
		{
			Kadai4_4 c	= new Kadai4_4();		//Kadai4_4ｸﾗｽのｲﾝｽﾀﾝｽを生成する
			System.out.println("処理結果");
			switch(args.length)
			{
				case 1:		//名前のみ
					c.k4_4(args[0]);					//K4_4ﾒｿｯﾄﾞを実行する
					System.out.println("氏名:"+c.name);	//氏名をﾃﾞｨｽﾌﾟﾚｲに表示する
					break;
				case 2:		//名前と年齢のみ
					p2 = Integer.parseInt(args[1]);
					c.k4_4(args[0],p2);					//Kadai4_4ｸﾗｽのｺﾝｽﾄﾗｸﾀを実行
					System.out.println("氏名:"+c.name);	//氏名をﾃﾞｨｽﾌﾟﾚｲに表示する
					System.out.println("年齢:"+c.age);	//年齢をﾃﾞｨｽﾌﾟﾚｲに表示する
					break;
				default: 	//名前、年齢、性別
					p2 = Integer.parseInt(args[1]);
					p3 = args[2].charAt(0);
					c.k4_4(args[0],p2,p3);
					System.out.println("氏名:"+c.name);	//氏名をﾃﾞｨｽﾌﾟﾚｲに表示する
					System.out.println("年齢:"+c.age);	//年齢をﾃﾞｨｽﾌﾟﾚｲに表示する
					System.out.println("性別:"+c.seibetsu);	//性別をﾃﾞｨｽﾌﾟﾚｲに表示する
					break;
			}
		}
		//ｷｰﾎﾞｰﾄﾞから何も入力されていないか、4種類以上のﾃﾞｰﾀを入力された場合
		else
		{
			System.out.println("設定値が入力されていません");
		}
	}
}


