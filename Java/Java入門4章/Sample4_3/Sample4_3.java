class Kadai4_3
{
	String name;	//氏名
	int age;		//年齢
	char seibetsu;	//性別
	//Kadai4_3ｸﾗｽのｺﾝｽﾄﾗｸﾀ
	Kadai4_3(String n)
	{
		name = n;	//氏名を初期化
	}
	Kadai4_3(String p1,int p2)
	{
		name = p1;		//氏名を初期化
		age = p2;		//年齢を初期化
	}
	Kadai4_3(String p1,int p2,char p3)
	{
		name = p1;		//氏名を初期化
		age = p2;		//年齢を初期化
		seibetsu = p3;	//性別を初期化
	}
}

class Sample4_3
{
	public static void main(String args[])
	{
		int p2;
		char p3;
		//ｷｰﾎﾞｰﾄﾞから入力された値が1から3種類のﾃﾞｰﾀであれば以下の処理を行う
		if(args.length>0 && args.length<4)
		{
			Kadai4_3 c;		//Kadai4_3ｸﾗｽの変数を用意する
			System.out.println("処理結果");
			switch(args.length)
			{
				case 1:		//名前のみ
					c = new Kadai4_3(args[0]);			//Kadai4_3ｸﾗｽのｺﾝｽﾄﾗｸﾀを実行
					System.out.println("氏名:"+c.name);	//氏名をﾃﾞｨｽﾌﾟﾚｲに表示する
					break;
				case 2:		//名前と年齢のみ
					p2 = Integer.parseInt(args[1]);
					c = new Kadai4_3(args[0],p2);		//Kadai4_3ｸﾗｽのｺﾝｽﾄﾗｸﾀを実行
					System.out.println("氏名:"+c.name);	//氏名をﾃﾞｨｽﾌﾟﾚｲに表示する
					System.out.println("年齢:"+c.age);	//年齢をﾃﾞｨｽﾌﾟﾚｲに表示する
					break;
				default: 	//名前、年齢、性別
					p2 = Integer.parseInt(args[1]);
					p3 = args[2].charAt(0);
					c = new Kadai4_3(args[0],p2,p3);
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


