package compositePattern;

public class MenuTestDrive {
	
	public static void main(String[] args) {
		MenuComponent pancakeHouseMenu = new Menu("Pancake house Menu", "Breakfast");
		MenuComponent dinerMenu = new Menu("Diner Menu", "Lunch");
		MenuComponent cafeMenu = new Menu("Cafe Menu", "Dinner");
		MenuComponent dessertMenu = new Menu("Dessert Menu", "Desserts");
		
		MenuComponent allMenus = new Menu("All menus", "all menus combined");
		
		allMenus.add(pancakeHouseMenu);
		allMenus.add(dinerMenu);
		allMenus.add(cafeMenu);
		
		dinerMenu.add(new MenuItem("Pasta", "Spaghetti with Marinara sauce", true, 3.89));
		dinerMenu.add(dessertMenu);
		
		dessertMenu.add(new MenuItem("Mango Icecream", "Icecream with a flavour of mango", true, 1.29));
		
		Waitress waitress = new Waitress(allMenus);
		
		waitress.printMenu();
	}
}
