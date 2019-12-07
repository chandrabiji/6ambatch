package oops;
//class = variables + methods
public class Person {
	//variables
	public String pname;
	public int weight;
	public int height;
	public String color;
	//methods
	public void eat()
	{
		if(weight>70){
			System.out.println("Take Veg Only");
		}else{
			System.out.println("Enjoy the Food");
		}
	}
	public void sleep()
	{
		System.out.println("Sleep well 9 hours");
	}

	public static void main(String[] args) {
	Person sai = new Person();//instance or object
	sai.pname="Sai Charan";
	sai.weight = 12;
	sai.height=75;
	sai.color="white";
	sai.eat();
	sai.sleep();
	

	}

}
