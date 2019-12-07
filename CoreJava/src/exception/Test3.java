package exception;

public class Test3 {
	
	public void m1()throws ArithmeticException,NullPointerException
	{
		System.out.println(10/0);
	}

	public static void main(String[] args)throws ArithmeticException,NullPointerException {
		Test3 t = new Test3();
		t.m1();
	}

}
