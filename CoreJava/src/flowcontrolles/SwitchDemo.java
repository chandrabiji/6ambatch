package flowcontrolles;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Game");
		System.out.println("2.Meals");
		System.out.println("3.Travel");
		System.out.println("Enter Your Choice ?");
		int choice = sc.nextInt();
		switch(choice)
		{
		case 1:System.out.println("I am interested to play Games");
		       break;
		case 2:System.out.println("I Like very much Veg-Food Only");
		       break;
		case 3:System.out.println("I Like to Travel WeekEnds");
		      break;
		default:System.out.println("Please select Your choice 1-3 only");      
		}

	}

}
