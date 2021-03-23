package strategyPattern;

public class Venue extends Car{
	public Venue() {
		mSystem = new NonTouch();
		wType = new SteelWheels();	
	}
}
