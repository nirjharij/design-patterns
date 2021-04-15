package decoratorPattern;

public class BrownBreadSub extends Subway{
	public BrownBreadSub() {
		description = "Brown Bread";
	}
	
	public double cost() {
		return 2.99;
	}
}
