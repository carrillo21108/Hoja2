/**
 * Clase StackTest
 * @author Brian_Anthony_Carrillo_Monzon
 * @version 1.0 19.02.2022
 *
 * En esta clase se realizan las pruebas sobre las operaciones de la pila.
 */

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StackTest {

	@Test
	/**
	 * Pruebas del metodo push
	 */
	void testPush() {
		//Insercion en la pila
		int valorEsperado = 1;
		Stack pila = new Stack();
		pila.push(1);
		int valorRecibido = (int) pila.peek();
		
		//Comparacion
		assertEquals(valorEsperado, valorRecibido, 0);
	}
	
	@Test
	/**
	 * Pruebas del metodo pull
	 */
	void testPull() {
		//Eliminacion en la pila
		int valorEsperado = 1;
		Stack pila = new Stack();
		pila.push(1);
		int valorRecibido = (int) pila.pull();
		
		//Comparacion
		assertEquals(valorEsperado, valorRecibido, 0);
	}
	
	@Test
	/**
	 * Pruebas del metodo peek
	 */
	void testPeek() {
		//Obtencion del valor mas proximo
		int valorEsperado = 1;
		Stack pila = new Stack();
		pila.push(1);
		int valorRecibido = (int) pila.peek();
		
		//Comparacion
		assertEquals(valorEsperado, valorRecibido, 0);
	}
	
	@Test
	/**
	 * Pruebas del metodo count
	 */
	void testCount() {
		//Conteo de la longitud de la pila
		int valorEsperado = 3;
		Stack pila = new Stack();
		pila.push(1);
		pila.push(2);
		pila.push(3);
		int valorRecibido = pila.count();
		
		//Comparacion
		assertEquals(valorEsperado, valorRecibido, 0);
	}
	
	@Test
	/**
	 * Pruebas del metodo isEmpty
	 */
	void testIsEmpty() {
		//Determinacion del estado del contenido en la pila
		boolean valorEsperado = false;
		Stack pila = new Stack();
		pila.push(1);
		boolean valorRecibido = pila.isEmpty();
		
		//Comparacion
		assertEquals(valorEsperado, valorRecibido);
	}
	

}
