import java.util.*;
class RenMain4_2
{
	static String name[] = {"鈴木一郎","田中啓太","井上隆","後藤裕子","金田龍二"};
	
	public static void main(String args[])
	{
		int r = Integer.parseInt(args[0]);
		int i;
		switch(r)
		{
			case 1:
				ArrayList<String>ary1 = new ArrayList<String>();
				for(i=0; i<name.length; i++)
				{
					ary1.add(name[i]);
				}
				System.out.println("ArrayList:"+ary1);
				break;
			case 2:
				LinkedList<String>list = new LinkedList<String>();
				for(i=0; i<name.length; i++)
				{
					list.add(name[i]);
				}
				System.out.println("LinkedList:"+list);
				break;
			case 3:
				Vector<String>v = new Vector<String>();
				for(i=0; i<name.length; i++)
				{
					v.addElement(name[i]);
				}
				System.out.println("Vector:"+v);
				break;
			case 4:
				Stack<String>s = new Stack<String>();
				for(i=0; i<name.length; i++)
				{
					s.push(name[i]);
				}
				System.out.println("Stack:"+s);
				break;
			case 5:
				HashSet<String>hs = new HashSet<String>();
				for(i=0; i<name.length; i++)
				{
					hs.add(name[i]);
				}
				System.out.println("HashSet:"+hs);
				break;
			default:
				TreeSet<String>ts = new TreeSet<String>();
				for(i=0; i<name.length; i++)
				{
					ts.add(name[i]);
				}
				System.out.println("TreeSet:"+ts);
				break;				
		}
	}
}
