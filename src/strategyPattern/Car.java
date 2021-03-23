package strategyPattern;

public class Car {
	MusicSystem mSystem;
	WheelsType wType;
	
	public void getMusicSystem() {
		mSystem.type();
	}
	
	public void getWheelsType() {
		wType.wheeltype();
	}
}

