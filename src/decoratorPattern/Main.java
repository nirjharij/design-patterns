package decoratorPattern;

public class Main {
	public static void main(String args[]) {
		Subway subway = new MultigrainBreadSub();
		System.out.println(subway.getDescription() + " $" + subway.cost());
		
		Subway subway2 = new WhiteBreadSub();
		subway2 = new Onion(subway2);
		subway2 = new Tomato(subway2);
		
		System.out.println(subway2.getDescription() + " $" + subway2.cost());
	}
}
