package innerclasses;

abstract class Bike
{
	public abstract void run();
}
interface Person
{
	public void eat();
}
public class AnonymusDemo {

	public static void main(String[] args) {
		Bike b = new Bike(){
			public void run()
			{
				System.out.println("Good @ Hyderabad Roads");
			}
		};
		b.run();
		Person p = new Person(){
			public void eat(){
				System.out.println("Eat Nice Food");
			}
		};
		p.eat();
				
	}

}
