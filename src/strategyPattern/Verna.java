package strategyPattern;

public class Verna extends Car{
	public Verna() {
		mSystem = new TouchScreen();
		wType = new AlloyWheels();	
	}
}
