/**
 * Clase Stack
 * @author Brian_Anthony_Carrillo_Monzon
 * @version 1.0 19.02.2022
 *
 * En esta clase se definen los metodos de operaciones
 * sobre la pila del sistema. Implementa la interfaz IStack.
 */

//Importacion de todas las clases de los paquetes java.util
import java.util.*;

public class Stack<T> implements IStack<T> {
	
	//Vector base de la pila
	private Vector<T> vector;
	
	/**
	 * Constructor sin parametros
	 */
	public Stack() {
		vector = new Vector<T>();
	}
	
	@Override
	/**
	 * Realiza una operacion push sobre la pila
	 * @see Vector#add(int, Object)
	 */
	public void push(T value) {		
		vector.add(0, value);
	}
	
	@Override
	/**
	 * Realiza una operacion pop sobre la pila
	 * @see Vector#remove(int)
	 */
	public T pull() {
		return vector.remove(0);
	}
	
	@Override
	/**
	 * Realiza una operacion top sobre la pila
	 * @see Vector#get(int)
	 */
	public T peek() {
		return vector.get(0);
	}
	
	@Override
	/**
	 * Retorna la logitud de la pila
	 * @see Vector#size()
	 */
	public int count() {
		return vector.size();
	}
	
	@Override
	/**
	 * Retorna el estado de contenido en la pila
	 * @see Vector#isEmpty()
	 */
	public boolean isEmpty() {		
		return vector.isEmpty();
	}

}
