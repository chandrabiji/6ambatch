package oops;

class A
{
	public void displayA()
	{
		System.out.println("Display method of Class A");
	}
}
class B extends A
{
	public void displayB()
	{
		System.out.println("Display method of Class B");
	}
}

public class SingleLevelInheritance {

	public static void main(String[] args) {
	B obj = new B();
	obj.displayA();
	obj.displayB();
	}

}
