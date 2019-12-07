package oops;

interface First
{
	public void colors();
}
interface Second
{
	public void colors();
}

public class InterfaceTest implements First,Second{
	
	public void colors()
	{
		System.out.println("Common Color");
	}

	public static void main(String[] args) {
	First f = new InterfaceTest();
	f.colors();
	Second s = new InterfaceTest();
	s.colors();
	First f1 = new First(){
		public void colors(){
			System.out.println("Frist interface color");
		}
	};
	f1.colors();
	Second s1 = new Second(){
		public void colors()
		{
			System.out.println("Second interface color");
		}
	};
	s1.colors();
	

	}

}
