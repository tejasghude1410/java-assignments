package assignment;
/* accept 10 numbers from user and add them inside the ArrayList.
using ListIterator display all the numbers bidirectionally.*/


import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		List<Integer> a= new ArrayList();
		for(int i=0;i<10;i++)
		{
			a.add(sc.nextInt());
		}
		System.out.println(a);
		ListIterator<Integer> ltr= a.listIterator();
		while(ltr.hasPrevious())
		{
			System.out.println(ltr.previous());
		}
		

	}

}
