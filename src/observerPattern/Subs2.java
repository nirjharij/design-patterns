package observerPattern;

public class Subs2 implements Subscriber{
	private Channel fc;
	
	public Subs2(Channel fc) {
		this.fc = fc;
		fc.addSubscriber(this);
	}
	public void update() {
		System.out.println("Updated Subscriber 2");
	}
}
