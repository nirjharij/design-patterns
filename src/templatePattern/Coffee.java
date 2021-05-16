package templatePattern;

public class Coffee extends CaffeineBeverage{
	@Override
	void brew() {
		System.out.println("Brewing Coffee...");
		
	}

	@Override
	void addCondiments() {
		System.out.println("Adding Milk and sugar");	
	}
}
