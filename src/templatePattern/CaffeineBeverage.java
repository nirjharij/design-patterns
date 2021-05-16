package templatePattern;

public abstract class CaffeineBeverage {
	final void prepareRecipe() {
		boilWater();
		brew();
		
	}
	
	void boilWater() {
		System.out.println("Boiling Water");
	}
	
	void pourInCup() {
		System.out.println("Pouring in cup");
	}
	
	abstract void brew();
	abstract void addCondiments();
}
