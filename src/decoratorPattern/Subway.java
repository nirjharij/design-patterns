package decoratorPattern;

public abstract class Subway {
	String description = "Unknown Sub";
	
	public String getDescription() {
		return description;
	}
	
	public abstract double cost();
}
