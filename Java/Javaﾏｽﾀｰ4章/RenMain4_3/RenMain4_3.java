import java.util.*;
class RenMain4_3
{
	static String name[] = {"鈴木一郎","田中啓太","井上隆","後藤裕子","金田龍二"};
	
	public static void main(String args[])
	{
		HashMap<String,Integer> hm = new HashMap<String,Integer>();
		int i;
		for(i=0; i<name.length; i++)
		{
			hm.put(name[i],101+i);
		}
		
		if(args.length>0)
		{
			boolean kekka;
			String s = args[0];
			kekka = hm.containsKey(s);
			if(kekka == true)
			{
				System.out.println(s+"さんのコード:"+hm.get(s));
			}
			else
			{
				System.out.println(s+"さんは存在しません。");
			}
		}
		else
		{
			System.out.println("HashMap:"+hm);
		}
	}
}

