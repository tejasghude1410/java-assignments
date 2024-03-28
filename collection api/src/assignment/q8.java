
package assignment;
/*create a hierarchy as follows
	interface Game- play() method
	Derive at least 3 classes from it. ( Cricket, Chess and Football )
Now Create generic class which can take Game type (i.e. any sub type of Game) as parameter.
In this class try to call the play() method of the class which is passed to it.
*/
interface Game
{
	void play();
}
class Cricket implements Game
{

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Cricket");
	}
	
}
class Chess implements Game
{

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Chess");
	}
	
}
class Football implements Game
{

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Football");
	}
	
}
class generic1 <T extends Game>
{
	public void disp(T t)
	{
		t.play();
	}
}

public class q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		generic1<Game> g=new generic1<>();
		g.disp(new Cricket());
		g.disp(new Chess());
		g.disp(new Football());
		

	}

}
