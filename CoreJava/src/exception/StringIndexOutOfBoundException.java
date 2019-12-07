package exception;

public class StringIndexOutOfBoundException {

	public static void main(String[] args) {
		try {
			String s = "This is Core Java Session";
			char c = s.charAt(25);
			System.out.println(c);
		} catch (StringIndexOutOfBoundsException e) {
		System.out.println("String Index Out of Bounds(Range).please give with in the rage");
		}

	}

}
