package iteratorPattern;

import java.util.ArrayList;

public class MenuTestDrive {
	
	public static void main(String[] args) {
		PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
		DinerMenu dinerMenu = new DinerMenu();
		ArrayList<Menu> menu = new ArrayList<Menu>();
		menu.add(pancakeHouseMenu);
		menu.add(dinerMenu);
		
		Waitress waitress = new Waitress(menu);
		waitress.printMenu();
	}
	
}
