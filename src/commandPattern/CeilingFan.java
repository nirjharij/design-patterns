package commandPattern;

public class CeilingFan {
	public static final int HIGH = 3;
	public static final int MEDIUM = 2;
	public static final int LOW = 1;
	public static final int OFF = 0;
	
	String location;
	int speed;
	
	public CeilingFan(String location) {
		this.location = location;
		speed = OFF;
	}
	
	public void high() {
		speed = HIGH;
		System.out.println("Speed: " + HIGH);
	}
	
	public void medium() {
		speed = MEDIUM;
		System.out.println("Speed: " + MEDIUM);
	}
	
	public void low() {
		speed = LOW;
		System.out.println("Speed: " + LOW);
	}
	
	public void off() {
		speed = OFF;
		System.out.println("Speed: " + LOW);
	}
	
	public int getSpeed() {
		return speed;
	}
}
