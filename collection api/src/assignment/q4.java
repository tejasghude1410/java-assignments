package assignment;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> i= new CopyOnWriteArrayList<>();
		i.add(5);
		i.add(21);
		i.add(12);
		i.add(100);i.add(9);
		System.out.println(i);
		Iterator<Integer> l=i.iterator();
		while(l.hasNext())
		{
			l.next();
			i.add(30);
		}
		System.out.println(i);

	}

}
