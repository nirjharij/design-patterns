package compositePattern;

import java.util.ArrayList;
import java.util.Iterator;

public class Menu extends MenuComponent{
	Iterator<MenuComponent> iterator = null;
	ArrayList<MenuComponent> menuComponents = new ArrayList<MenuComponent>();
	String name;
	String description;
	
	public Iterator<MenuComponent> createIterator() {
		if (iterator == null)
			iterator = new CompositeIterator(menuComponents.iterator());
		return iterator;
	}
	
	public Menu(String name, String description) {
		this.name = name;
		this.description = description;
	}
	
	public void add(MenuComponent menuComponent) {
		menuComponents.add(menuComponent);
	}
	
	public void remove(MenuComponent menuComponent) {
		menuComponents.remove(menuComponent);
	}
	
	public MenuComponent getChild(int index) {
		return menuComponents.get(index);
	}
	
	public String getName() {
		return name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void print() {
		System.out.println("\n" + getName());
		System.out.println(", " + getDescription());
		System.out.println("------------");
		Iterator<MenuComponent> iterator = menuComponents.iterator();
		while (iterator.hasNext()) {
			MenuComponent menuComponent = iterator.next();
			menuComponent.print();
		}
	}
}
