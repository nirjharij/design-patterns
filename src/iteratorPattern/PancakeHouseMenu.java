package iteratorPattern;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenu implements Menu{
	ArrayList<MenuItem> itemsList;

	@Override
	public Iterator<MenuItem> createIterator() {
		return itemsList.iterator();
	}
	
}
