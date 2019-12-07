package oops;
//Encapsulation = Data Hiding + Data Abstraction
public class DebitCard {
	//data hiding
	private int pinNumber;
	//Data Abstraction
	public int getPinNumber() {
		return pinNumber;
	}
	public void setPinNumber(int pinNumber) {
		this.pinNumber = pinNumber;
	}

	public static void main(String[] args) {
		DebitCard visaCard = new DebitCard();//instance or object
		visaCard.setPinNumber(1234);
		System.out.println("Your Card Pin Number = "+visaCard.getPinNumber());
	}

}
