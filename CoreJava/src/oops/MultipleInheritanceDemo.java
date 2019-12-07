package oops;

interface One
{
	default void method1()
	{
		System.out.println("From Default Method1");
	}
	public void m1();
}
interface Two
{
	public void m2();
}
class Multiple implements One,Two
{

	@Override
	public void m2() {
		System.out.println("From Two Interface Method");
		
	}

	@Override
	public void m1() {
		System.out.println("From One Interface Method");
		
	}
	
}

public class MultipleInheritanceDemo {

	public static void main(String[] args) {
		One o = new Multiple();
		o.m1();
		Two t = new Multiple();
		t.m2();
		Multiple m = new Multiple();
		m.m1();
		m.m2();

	}

}
