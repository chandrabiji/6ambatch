class Parent
{
	public Parent()
	{
		System.out.println("Parent Default Constructor");
	}
	public Parent(int a)
	{
		this();
		System.out.println("Parent Parameterized Constructor");
	}
}
public class Child extends Parent{

	public Child() {
		System.out.println("Child Default Constructor");
	}

	public Child(int a)
	{
		super(20);
		System.out.println("Child Parameterized Constructor");
	}
	public static void main(String[] args) {
		Child c1 = new Child(10);

	}

}
