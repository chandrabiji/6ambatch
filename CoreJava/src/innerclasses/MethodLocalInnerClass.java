package innerclasses;

public class MethodLocalInnerClass {
	
	private int data = 40;
	
	public void display()
	{
		class InnerDemo
		{
			public void m1()
			{
				System.out.println("data = "+data);
			}
		}
		InnerDemo i = new InnerDemo();
		i.m1();
	}

	public static void main(String[] args) {
		MethodLocalInnerClass obj = new MethodLocalInnerClass();
		obj.display();
	}

}
