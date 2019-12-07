package oops;

public class MethodOverLoadingDemo {
	//instance method
	public int add(int i, int j)
	{
		return i+j;
	}
	
	public int add(int i, int j, int k)
	{
		return i+j+k;
	}

	public static void main(String[] args) {
		MethodOverLoadingDemo mo = new MethodOverLoadingDemo();//instance or object
		System.out.println(mo.add(10,20));
		System.out.println(mo.add(10, 20,30));

	}

}
