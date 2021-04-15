package decoratorPattern;

public class Potato extends condimentDecorator{
	Subway subway;
	
	public Potato(Subway subway) {
		this.subway = subway;
	}
	
	public String getDescription() {
		return subway.getDescription() + ", Potato";
	}
	
	public double cost() {
		return subway.cost() + 0.10;
	}
}
