package exception;

public class NumberFormatExceptionDemo {

	public static void main(String[] args) {
		try {
			int num = Integer.parseInt("ten");
			System.out.println(num);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
		System.out.println("Number Format Exception please provide number with in the string");
		}
	}

}
