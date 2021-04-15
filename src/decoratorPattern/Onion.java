package decoratorPattern;

public class Onion extends condimentDecorator{
	Subway subway;
	
	public Onion(Subway subway) {
		this.subway = subway;
	}
	
	public String getDescription() {
		return subway.getDescription() + ", Onion";
	}
	
	public double cost() {
		return subway.cost() + 0.30;
	}
}
