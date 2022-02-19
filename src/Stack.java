/**
 * 
 */

import java.util.*;
/**
 * @author Brian Carrillo
 *
 */
public class Stack<T> implements IStack<T> {

	private Vector<T> vector;
	
	public Stack() {
		vector = new Vector<T>();
	}
	
	@Override
	public void push(T value) {		
		vector.add(0, value);
	}

	@Override
	public T pull() {
		return vector.remove(0);
	}

	@Override
	public T peek() {
		return vector.get(0);
	}

	@Override
	public int count() {
		return vector.size();
	}

	@Override
	public boolean isEmpty() {		
		return vector.isEmpty();
	}

}
