package assignment;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

class mynum implements Serializable
{
	private int num;

	public mynum(int num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return "mynum [num=" + num + "]";
	}
	
}

public class q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mynum m1=new mynum(1);
		mynum m2=new mynum(2);
		mynum m3=new mynum(3);
		mynum m4=new mynum(4);
		List<Object> l= new ArrayList<>();
		l.add(m1);
		l.add(m2);
		l.add(m3);
		l.add(m4);
		Object ref=null;
		try {
			FileOutputStream fos= new FileOutputStream("d:\\tejas.txt");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			
			oos.writeObject(l);
			FileInputStream fis= new FileInputStream("d:\\tejas.txt");
			ObjectInputStream ois=new ObjectInputStream(fis);
			ref=(Object)ois.readObject();
			
			System.out.println(ref);
			
			
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
