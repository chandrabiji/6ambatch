package oops;
class CentralGovt
{
	public void tax()
	{
		System.out.println("Central Govt Tax");
	}
}
class StateGovt extends CentralGovt
{
	public void tax()
	{
		System.out.println("State + Central Govt Tax");
	}
}
public class MethodOveridingDemo {

	public static void main(String[] args) {
		CentralGovt center = new CentralGovt();
		center.tax();
		StateGovt state = new StateGovt();
		state.tax();
		CentralGovt c = new StateGovt();
		c.tax();
		

	}

}
