class Sample1_4
{
	public static void main(String args[])
	{
		int p1 = Integer.parseInt(args[0]);
		if(p1>0 && p1<5)	
		{
			boolean kekka1;		//ｲﾝﾀﾌｪｰｽを実装しているか否かの結果を格納する
			String kekka2;		//ﾒｿｯﾄﾞの実行結果を格納する変数
			switch(p1)			//ｷｰﾎﾞｰﾄﾞから入力された値により処理を分岐する
			{
				case 1:
					Kadai1_4_1 c1 = new Kadai1_4_1();
					kekka1 = c1 instanceof Interface1_4;	//Interface1_4の実装ﾁｪｯｸを行う
					kekka2 = c1.r1_4();
					break;
				case 2:
					Kadai1_4_2 c2 = new Kadai1_4_2();
					kekka1 = c2 instanceof Interface1_4;	//Interface1_4の実装ﾁｪｯｸを行う
					kekka2 = c2.r1_4();
					break;
				case 3:
					Kadai1_4_3 c3 = new Kadai1_4_3();
					kekka1 = c3 instanceof Interface1_4;	//Interface1_4の実装ﾁｪｯｸを行う
					kekka2 = c3.r1_4();
					break;
				default:
					Kadai1_4_4 c4 = new Kadai1_4_4();
					kekka1 = c4 instanceof Interface1_4;	//Interface1_4の実装ﾁｪｯｸを行う
					kekka2 = c4.r1_4();
			}
			if(kekka1==true)
			{
				//Interface1_4を実装していたら以下のﾒｯｾｰｼﾞを表示する
				System.out.println(kekka2+"はInterface1_4を実装しています");
			}
			else
			{
				//Interface1_4を実装していなければ以下のﾒｯｾｰｼﾞを表示する
				System.out.println(kekka2+"はInterface1_4を実装していません");
			}
		}
		else	//ｷｰﾎﾞｰﾄﾞから入力された値が1から3以外の場合
		{
			System.out.println("該当する部署が見つかりません");
		}
	}
}

//Interfaceの宣言
interface Interface1_4
{
	String r1_4();
}

//Kadai1_4_1ｸﾗｽはInterface1_4ｲﾝﾀﾌｧｲｽを実装する
class Kadai1_4_1 implements Interface1_4
{
	public String r1_4()
	{
		return "Kadai1_4_1ｸﾗｽ";
	}
}	

//Kadai1_4_2ｸﾗｽはKadai1_4ｲﾝﾀﾌｪｲｽを実装しない
class Kadai1_4_2
{
	String r1_4()
	{
		return "Kadai1_4_2ｸﾗｽ";
	}
}

//Kadai1_4_3ｸﾗｽはKadai1_4_1ｸﾗｽを継承する
class Kadai1_4_3 extends Kadai1_4_1
{
	public String r1_4()
	{
		return "Kadai1_4_3ｸﾗｽ";
	}
}

//Kadai1_4_4ｸﾗｽはInterface1_4_1ｲﾝﾀﾌｪｲｽを実装しない
class Kadai1_4_4
{
	String r1_4()
	{
		return "Kadai1_4_4ｸﾗｽ";
	}
}

