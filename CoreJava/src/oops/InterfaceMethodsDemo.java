package oops;

interface Test1
{
	
	public abstract void abstractMethod();
	
	default void defaultMethod()
	{
		System.out.println("Default Method Demo");
	}
	
	static void staticMethod()
	{
		System.out.println("static Method Demo");
	}
}

public class InterfaceMethodsDemo implements Test1{
	
	public void abstractMethod()
	{
		System.out.println("abstract Method Implementation");
	}

	public static void main(String[] args) {
		InterfaceMethodsDemo obj = new InterfaceMethodsDemo();
		obj.defaultMethod();
		Test1.staticMethod();
		obj.abstractMethod();

	}

}
