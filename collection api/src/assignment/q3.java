package assignment;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class q3 {
	public static void main(String[] args) {
		List<Integer> l= new LinkedList<>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		System.out.println(l);
		
		
		l.add(1000);
		
		ListIterator ltr=l.listIterator();
		while(ltr.hasPrevious())
		{
			
			
			ltr.previous();
			
		}
		ltr.add(400);
		ltr.add(500);
		
		
		Iterator<Integer> itr= l.iterator();
		while(itr.hasNext())
		{
			itr.next();
			
		}
		System.out.println(l);
		
		
	}

}
