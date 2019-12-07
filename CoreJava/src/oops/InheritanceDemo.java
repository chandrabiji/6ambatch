package oops;

class Employee
{
	public double salary = 5000;
}
class HourlyEmployee extends Employee
{
	public double bonus = 500;
}
class RegularEmployee extends Employee
{
	public double bonus = 1000;
}
public class InheritanceDemo {

	public static void main(String[] args) {
	HourlyEmployee hourlyEmployee = new HourlyEmployee();
	RegularEmployee regularEmployee = new RegularEmployee();
	System.out.println("-----------------------------------------------");
	System.out.println("|             HOURLY EMPLOYEE PAY SLIP        |");
	System.out.println("-----------------------------------------------");
	System.out.println("  HourlyEmployee Salary    :   "+hourlyEmployee.salary);
	System.out.println("  HourlyEmployee Bonus     :   "+hourlyEmployee.bonus);
	System.out.println("-----------------------------------------------");
	System.out.println("Total Salary               : "+(hourlyEmployee.salary+hourlyEmployee.bonus));
	System.out.println("-----------------------------------------------");
	System.out.println();
	System.out.println("-----------------------------------------------");
	System.out.println("|            REGULAR EMPLOYEE PAY SLIP        |");
	System.out.println("-----------------------------------------------");
	System.out.println("  RegularEmployee Salary    :   "+regularEmployee.salary);
	System.out.println("  RegularEmployee Bonus     :   "+regularEmployee.bonus);
	System.out.println("-----------------------------------------------");
	System.out.println("Total Salary               : "+(regularEmployee.salary+regularEmployee.bonus));
	System.out.println("-----------------------------------------------");

	}

}
