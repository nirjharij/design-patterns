package facadePattern;


public class HomeAutomation {
	Light light;
	Fan fan;
	AirConditioner aConditioner;
	
	public HomeAutomation(Light light, Fan fan, AirConditioner airConditioner) {
		this.light = light;
		this.fan = fan;
		this.aConditioner = airConditioner;
		
	}
	
	public void sleep() {
		System.out.println("Going to Sleep....");
		light.off();
		fan.on();
		aConditioner.on();
	}
	
	public void wakeup() {
		System.out.println("\n\n");
		System.out.println("Waking up....");
		light.on();
		fan.off();
		aConditioner.off();
	}
}
