package strategyPattern;

public class Main {
	public static void main(String[] args) {
		Car vernaCar = new Verna();
		vernaCar.getMusicSystem();
		vernaCar.getWheelsType();
		
		Car venueCar = new Venue();
		venueCar.getMusicSystem();
		venueCar.getWheelsType();
	}
}
