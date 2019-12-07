package oops;

public class Test extends AbstractTest{
	
	
	@Override
	public void abstractMehtod() {
	System.out.println("abstract class method");
		
	}

	public static void main(String[] args) {
		Test t = new Test();
		AbstractTest.main(args);

	}

	

}
