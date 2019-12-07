package innerclasses;

public class StaticInnerClass {
	
	static int data = 50;
	
	static class Innerclass
	{
		static void m1()
		{
			System.out.println("data : "+data);
		}
	}

	public static void main(String[] args) {
	System.out.println(data);
	Innerclass.m1();

	}

}
