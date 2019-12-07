package innerclasses;

public class MemberInnerClassDemo {

	private int data = 30;

	class Inner {
		public void m1() {
			System.out.println("Data : " + data);
		}
	}
	
	public void display()
	{
		Inner i = new Inner();
		i.m1();
	}

	public static void main(String[] args) {
		MemberInnerClassDemo obj = new MemberInnerClassDemo();
		obj.display();
		MemberInnerClassDemo.Inner mi = new MemberInnerClassDemo().new Inner();
		mi.m1();

	}

}
