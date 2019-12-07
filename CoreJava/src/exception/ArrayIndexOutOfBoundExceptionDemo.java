package exception;

public class ArrayIndexOutOfBoundExceptionDemo {

	public static void main(String[] args) {
		try {
			int a[] = new int[5];
			a[6]=9;
		} catch (Exception e) {
			// TODO Auto-generated catch block
		System.out.println("Array Index Out of Bound");
		}

	}

}
