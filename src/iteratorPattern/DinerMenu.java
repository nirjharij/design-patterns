package iteratorPattern;

import java.util.Iterator;

public class DinerMenu implements Menu{
	MenuItem[] itemsList; 
	
	@Override
	public Iterator<MenuItem> createIterator() {
		return new DinerMenuIterator(itemsList);
	}	
}
