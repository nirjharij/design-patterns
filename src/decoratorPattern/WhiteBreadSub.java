package decoratorPattern;

public class WhiteBreadSub extends Subway{
	public WhiteBreadSub() {
		description = "White Bread";
	}
	
	public double cost() {
		return 1.99;
	}
}
