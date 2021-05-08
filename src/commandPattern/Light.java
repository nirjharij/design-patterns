package commandPattern;

public class Light {
	String roomType;
	
	public Light(String type) {
		this.roomType = type;
	}
	public void on() {
		System.out.println(roomType + " Light switched On");
	}
	
	public void off() {
		System.out.println(roomType + " Light switched Off");
	}
}
