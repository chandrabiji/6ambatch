package oops;

abstract class Bike
{
	public abstract void run();
	private void color()
	{
		System.out.println("Bike color here");
	}
}
class ActiveHonda extends Bike
{
	public void run()
	{
		System.out.println("Good @ Hyderabad Roads");
	}
}
class FZ extends Bike
{
	public void run()
	{
		System.out.println("Feel Like Sports Bike");
	}
}
public class AbstractionDemo {

	public static void main(String[] args) {
		
		Bike b = new ActiveHonda();
		b.run();
		ActiveHonda a = new ActiveHonda();
		a.run();
		Bike b1 = new FZ();
		b1.run();
	
	}

}
