/**
 * Interfaz IStack
 * @author moises.alonso
 *
 * En esta interfaz se definen los metodos que implementa la pila.
 */
public interface IStack<T> {
	
	/***
	 * Realiza una operacion push en la pila
	 * @param value: valor generica a agregar (T)
	 */
	void push(T value);
	
	/***
	 * Realiza una operacion pop en la pila
	 * @return T: el primer valor en la pila
	 */
	T pull();
	
	/***
	 * Realiza una operacion top en la pila
	 * @return T: el primer valor en la pila
	 */
	T peek();
	
	/***
	 * Retorna la longitud de la pila
	 * @return int: longitud de la pila
	 */
	int count();
	
	/***
	 * Indica si la pila esta vacia o no
	 * @return boolean: valor sobre el contenido en la pila
	 */
	boolean isEmpty();
}