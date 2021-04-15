package decoratorPattern;

public class Olives extends condimentDecorator{
	Subway subway;
	
	public Olives(Subway subway) {
		this.subway = subway;
	}
	
	public String getDescription() {
		return subway.getDescription() + ", Olives";
	}
	
	public double cost() {
		return subway.cost() + 0.20;
	}
}
