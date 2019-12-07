import java.util.Scanner;

public class MethodDemo {
	//instance method
	public int add(int i, int j)
	{
		return i+j;
	}
	public void greet()
	{
		System.out.println("Welcome to Java");
	}
	//static method
	public static void m1()
	{
		System.out.println("From Static Method");
	}
	double balance = 1000;
	//final and synchronized method
	public final synchronized void withdraw(double wamount)
	{
		if(balance>=wamount)
		{
			balance = balance-wamount;
			System.out.println("Successfully withdraw completed.Now Updated Balance : "+balance);
		}else{
			System.out.println("Please deposit and continue withdraw because amount low.");
		}
	}
	//native method
	/*public native void m2(){
		
	}*/
	//abstract method
	//public abstract void m3();

	public static void main(String[] args) {
		MethodDemo obj = new MethodDemo();//instance
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number ?");
		int firstNumber = sc.nextInt();
		System.out.println("Enter Second Number ?");
		int secondNumber = sc.nextInt();
		System.out.println(obj.add(firstNumber, secondNumber));
		obj.greet();
		m1();
	

	}

}
