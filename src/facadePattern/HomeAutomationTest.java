package facadePattern;

public class HomeAutomationTest {
	public static void main(String[] args) {
		Light light = new Light();
		Fan fan = new Fan();
		AirConditioner aConditioner = new AirConditioner();
		
		HomeAutomation homeAutomation = new HomeAutomation(light, fan, aConditioner);
		homeAutomation.sleep();
		homeAutomation.wakeup();
	}
}
