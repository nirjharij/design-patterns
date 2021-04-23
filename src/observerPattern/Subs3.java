package observerPattern;

import java.util.Observable;
import java.util.Observer;


@SuppressWarnings("deprecation")
public class Subs3 implements Observer{
	Observable observable;
	public Subs3(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}
	public void update(Observable obs, Object arg) {
		System.out.println("Updated Subscriber 3");
	}
}
