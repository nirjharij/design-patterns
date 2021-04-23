package factoryPattern;

public class NotificationFactory {
	public Notification createNotification(String type) {
		if (type.equals("SMS")){
			return new SmsNotification();
		}
		else if(type.equals("Email")) {
			return new EmailNotification();
		}
		else {
			return null;
		}
	}
}
