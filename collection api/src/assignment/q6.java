package assignment;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*create a class "MyClass".
create 5 different objects of it.
add them in a ArrayList.
store ArrayList in file.
Now open a file, read ArrayList and display all objects.
*/
class myclass implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 100;
	private int num;

	public myclass(int num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return "myclass [num=" + num + "]";
	}
	
}
public class q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myclass m1=new myclass(11);
		myclass m2=new myclass(12);
		myclass m3=new myclass(13);
		myclass m4=new myclass(14);
		myclass m5=new myclass(15);
		List<Object> l= new ArrayList<>();
		l.add(m1);
		l.add(m2);
		l.add(m3);
		l.add(m4);
		l.add(m5);
		Object ref=null;
		try {
			FileOutputStream fos= new FileOutputStream("d:\\tejas.txt");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			
			oos.writeObject(l);
			System.out.println("Object store succesfully");
			FileInputStream fis= new FileInputStream("d:\\tejas.txt");
			ObjectInputStream ois=new ObjectInputStream(fis);
			ref=(Object)ois.readObject();
			Iterator i=l.iterator();
			while(i.hasNext())
			{
				System.out.println(i.next());
			}
			//System.out.println(ref);
			
			
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}
		

	

}
