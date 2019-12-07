package exception;

public class ArithmeticExceptionDemo {

	public static void main(String[] args) {
		try {
			int a = 10,b=0;
			int c =a/b;
			System.out.println("Result = "+c);
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
		System.out.println("Can't divide a number by 0");
		}
	}

}
