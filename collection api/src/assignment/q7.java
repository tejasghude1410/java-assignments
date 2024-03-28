package assignment;

//import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*create a HashMap.
store  prn no. and students name of 10 students inside the HashMap.
display it using iterator.*/


public class q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map <Integer, String> m= new HashMap<>();
		m.put(1,"tejas");
		m.put(2,"rohan");
		m.put(3,"sameer");
		m.put(4,"yash");
		m.put(5,"saurabh");
		m.put(6,"partik bk");m.put(7,"pratik ceo");
		m.put(8,"pratik y");m.put(9,"nayan");m.put(10,"yatin");
		Set<Entry<Integer,String>> s=m.entrySet();
		Iterator<Entry<Integer,String>> i=s.iterator();	
		while(i.hasNext())
		{
			//System.out.println(i.next());
			Map.Entry<Integer,String> me=i.next();
			System.out.println("key=" +" "+ me.getKey()+" "+"value=" +" "+ me.getValue());
		}
		

	}

}
