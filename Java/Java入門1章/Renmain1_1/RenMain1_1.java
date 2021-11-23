class RenMain1_1
{
	public static void main(String args[])
	{
		int count = 0;
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		for(int i=x; i<=y; i++)
		{
			count = count + i;
		}
		//ｷｰﾎﾞｰﾄﾞから入力された数値と積算値をﾃﾞｨｽﾌﾟﾚｲに表示する
		System.out.println(x+"から"+y+"までの積数値は"+count+"です。");
	}	
}	
	