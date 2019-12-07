package exception;

public class Test {

	public static void main(String[] args) {
		System.out.println("Frist Line");
		try {
			System.out.println(10/0);
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//System.out.println(e.toString());
			//System.out.println(e.getMessage());
			//System.out.println("Some Problem here");
		}catch(Exception ae)
		{
			ae.printStackTrace();
		}
		System.out.println("Last Line");
	}

}
