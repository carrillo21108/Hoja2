/**
 * Clase PosfixCalcTest
 * @author Brian_Anthony_Carrillo_Monzon
 * @version 1.0 19.02.2022
 *
 * En esta clase se realizan las pruebas sobre las operaciones de la calculadora.
 */

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PosfixCalcTest {
	
	PosfixCalc calculadora = new PosfixCalc();
	
	@Test
	/**
	 * Pruebas del metodo Evaluate
	 */
	void testEvaluate() {
		//Evaluacion de expresiones en notacion postfija
		int valorEsperado = 15;
		int valorRecibido = calculadora.Evaluate("1 2 + 4 * 3 +");
		assertEquals(valorEsperado, valorRecibido, 0);
		
		valorEsperado = 30;
		valorRecibido = calculadora.Evaluate("6 2 3 + *");
		assertEquals(valorEsperado, valorRecibido, 0);
	}
}
