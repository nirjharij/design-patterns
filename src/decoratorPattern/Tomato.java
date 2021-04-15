package decoratorPattern;

public class Tomato extends condimentDecorator{
	Subway subway;
	
	public Tomato(Subway subway) {
		this.subway = subway;
	}
	
	public String getDescription() {
		return subway.getDescription() + ", Tomato";
	}
	
	public double cost() {
		return subway.cost() + 0.25;
	}
}
