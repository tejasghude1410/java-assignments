package assignment;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/* maintain ICC ranking of at least 5 batsmen in the "HashMap".
list should be maintain as "rank" "name"
e.g. "1" "Rohit Sharma".
Now ask any rank bet'n 1 to 5 from user. ( user input).
if user asks for a particular rank , retrieve batsman name for that rank from the HashMap.*/




public class q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		Map<String,String> m= new HashMap<>();
		m.put("1", "virat Kohali");
		m.put("2", "Rohit Sharma");
		m.put("3", "Shubman Gill");
		m.put("4", "Suryakumar Yadav");
		m.put("5", "Jsprit Bumhra");
		System.out.println("please enter the rank to seek player name");
		String rank=sc.next();
		int num=Integer.parseInt(rank);
		if(num>5||num<1)
		{
			System.out.println("num should be 1 to 5");
		}
		System.out.println(m.get(rank));
		

	}

}
