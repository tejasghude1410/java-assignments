package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class arrlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> a=new ArrayList<>();
		a.add("s");
		a.add("k");
		a.add("p");
		a.add("c");
		a.add("b");
		a.add("z");
		System.out.println(a);
		a.remove("s");
		System.out.println(a);
		/*List<Integer> a=new ArrayList<>();
		a.add(5);
		a.add(6);
		a.add(7);
		a.add(8);
		a.add(9);
		a.add(10);*/
		Iterator<String> itr=a.iterator();
		while(itr.hasNext())
		{
			//System.out.println(itr.next());
			String t=itr.next();
			if(t=="z")
			{
				itr.remove();
			}
			
		}System.out.println(a);
		
		

	}

}
