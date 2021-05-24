package compositePattern;

import java.util.Iterator;
import java.util.Stack;

public class CompositeIterator implements Iterator{
	Stack<Iterator<MenuComponent>> stack = new Stack<Iterator<MenuComponent>>();
	
	public CompositeIterator(Iterator iterator) {
		stack.push(iterator);
	}
	
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if (stack.empty())
			return false;
		
		Iterator<MenuComponent> iterator = stack.peek();
		if(!iterator.hasNext()) {
			stack.pop();
			return hasNext();
		}
		else {
			return true;
		}
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		if (hasNext()) {
			Iterator<MenuComponent> iterator = stack.peek();
			MenuComponent component = iterator.next();
			stack.push(component.createIterator());
			return component;
		}
		else {
			return null;
		}
		
	}
	
}
