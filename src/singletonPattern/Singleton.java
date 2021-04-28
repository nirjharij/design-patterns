package singletonPattern;

public class Singleton {
	private static Singleton uniqueInstance = null;
	
	private Singleton(){}
	
	public static Singleton getInstance() {
		if (uniqueInstance == null)
			uniqueInstance = new Singleton();
		
		return uniqueInstance;
	}	
}
