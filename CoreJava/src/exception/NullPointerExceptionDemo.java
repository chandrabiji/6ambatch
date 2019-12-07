package exception;

public class NullPointerExceptionDemo {

	public static void main(String[] args) {
		try {
			String s = null;
			System.out.println(s.charAt(0));
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			System.out.println("NullpointerException declared s value ");
		}

	}

}
