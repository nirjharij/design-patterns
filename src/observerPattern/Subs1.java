package observerPattern;

public class Subs1 implements Subscriber{
	private Channel fc;
	
	public Subs1(Channel fc) {
		this.fc = fc;
		fc.addSubscriber(this);
	}
	
	public void update() {
		System.out.println("Updated Subscriber 1");
	}
}
