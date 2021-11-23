class Ren4_1
{
	byte code;			//コード
	String name;		//商品名
	int price;			//価格
	//Ren4_1ｸﾗｽのｺﾝｽﾄﾗｸﾀ
	Ren4_1(byte p1)
	{
		code = p1;		//ｺｰﾄﾞを初期化
	}
	Ren4_1(byte p1,String p2)
	{
		code = p1;		//ｺｰﾄﾞを初期化
		name = p2;		//商品名を初期化
	}
	Ren4_1(byte p1,String p2,int p3)
	{
		code = p1;		//ｺｰﾄﾞを初期化
		name = p2;		//商品名を初期化
		price = p3;		//価格を初期化
	}
}

class RenMain4_1
{
	public static void main(String args[])
	{
		//ｷｰﾎﾞｰﾄﾞから入力された値が1から3種類のﾃﾞｰﾀであれば以下の処理を行う
		if(args.length>0 && args.length<4)
		{
			Ren4_1 c;		//Ren4_1ｸﾗｽの変数を宣言する
			byte p1 = Byte.parseByte(args[0]);		//ｺｰﾄﾞをbyte型に変換する
			System.out.println("処理結果");
			switch(args.length)
			{
				case 1:		//ｺｰﾄﾞ
					c = new Ren4_1(p1);		
					System.out.println("コード:"+c.code);
					break;
				case 2:		//ｺｰﾄﾞと商品名
					c = new Ren4_1(p1,args[1]);
					System.out.println("コード:"+c.code);
					System.out.println("商品名:"+c.name);
					break;
				default: 	//ｺｰﾄﾞ,商品名,価格
					int p3 = Integer.parseInt(args[2]);
					c = new Ren4_1(p1,args[1],p3);
					System.out.println("コード:"+c.code);
					System.out.println("商品名:"+c.name);
					System.out.println("価格:"+c.price);
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


