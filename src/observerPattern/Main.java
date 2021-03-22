package observerPattern;

public class Main {
	public static void main(String[] args) {
		FitnessChannel channel = new FitnessChannel();
		Subs1 subs1 = new Subs1(channel);
		Subs2 subs2 = new Subs2(channel);
		channel.videoUploaded();
		int[] A = count(652);
		System.out.println(A);
	}
}
