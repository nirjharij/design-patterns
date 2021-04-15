package decoratorPattern;


public class MultigrainBreadSub extends Subway{
	public MultigrainBreadSub() {
		description = "Multigrain Bread";
	}
	
	public double cost() {
		return 3.99;
	}
}
