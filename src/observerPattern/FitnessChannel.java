package observerPattern;

import java.util.ArrayList;

public class FitnessChannel implements Channel{
	private ArrayList<Subscriber> subscribers;
	
	public FitnessChannel() {
		subscribers = new ArrayList<Subscriber>();
	}
	
	public void addSubscriber(Subscriber s) {
		subscribers.add(s);
	}
	
	public void removeSubscriber(Subscriber s) {
		int i = subscribers.indexOf(s);
		if (i >= 0) {
			subscribers.remove(i);
		}
	}
	
	public void notifySubscribers() {
		for (Subscriber subscriber : subscribers) {
			subscriber.update();
		}
	}
	
	public void videoUploaded() {
		notifySubscribers();
	}
}
