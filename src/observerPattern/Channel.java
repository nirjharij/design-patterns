package observerPattern;

public interface Channel {
	public void addSubscriber(Subscriber s);
	public void removeSubscriber(Subscriber s);
	public void notifySubscribers();
}

