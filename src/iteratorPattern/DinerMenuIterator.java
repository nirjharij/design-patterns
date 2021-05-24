package iteratorPattern;

import java.util.Iterator;


public class DinerMenuIterator implements Iterator<MenuItem>{
	MenuItem[] itemsList; 
	int position = 0;
	
	public DinerMenuIterator(MenuItem[] itemsList) {
		this.itemsList = itemsList;
	}
	
	@Override
	public boolean hasNext() {
		if (position == 0 || position >= itemsList.length)
			return false;
		else {
			return true;
		}
	}

	@Override
	public MenuItem next() {
		MenuItem menuItem = itemsList[position];
		position = position + 1;
		return menuItem;
	}
	
}
