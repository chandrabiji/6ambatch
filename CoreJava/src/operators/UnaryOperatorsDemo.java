package operators;

public class UnaryOperatorsDemo {

	public static void main(String[] args) {
		System.out.println("Pre-Increment");
		int a = 10;
		System.out.println("A = "+a);//10
		int b = ++a;// b = 11
		System.out.println("B = "+b);//11
		System.out.println("A = "+a);//11
		
		System.out.println("Post-Increment");
		int x = 6;
		System.out.println("X = "+x);//6
		int y = x++;
		System.out.println("Y = "+y);//6
		System.out.println("X = "+x);//7
		
		System.out.println("Pre-Decrement");
		int m = 8;
		System.out.println("M = "+m);//8
		int n = --m;
		System.out.println("N = "+n);//7
		System.out.println("M = "+m);//7
		
		System.out.println("Post-Decrement");
		int p=4;
		System.out.println("P = "+p);//4
		int q = p--;
		System.out.println("Q = "+q);//4
		System.out.println("P = "+p);//3
		

	}

}
