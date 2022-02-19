
/**
 * Clase Principal
 * @author Brian_Anthony_Carrillo_Monzon
 * @version 1.0 19.02.2022
 *
 * En esta clase se maneja el metodo main que permite la ejecucion del 
 * programa. Desde el metodo main se ejecutan los metodos de la calculadora.
 */

//Importacion de la clase ArrayList y Scanner del paquete java.util
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
	
	/**
    *
    */

	
    /**
     * Metodo Principal del programa
     *
     * @param args: (String[])
     * @see System.out#println()
     * @see java.util.Scanner#Scanner()
     * @see java.util.Scanner#nextLine()
     * @see java.util.ArrayList#ArrayList()
     * @see TxTScanner#TxTScanner()
     * @see TxTScanner#scanTxt()
     * @see PosfixCalc#PosfixCalc()
     * @see PosfixCalc#Evaluate()
     * 
     */
	public static void main(String[] args) {
		
		//Instancia del scanner
		Scanner scanner = new Scanner(System.in);
		
		//Mensaje inicial
		System.out.println("--CALCULADORA EN NOTACIÓN POSTFIX--");
		System.out.println("Bienvenido\n");
		
		//Solicitud de la ruta del archivo. (ejemplo: C:\Users\Brian Carrillo\OneDrive\Desktop\UVG\3er semestre\Algoritmos y Estructuras de Datos\HDT2\datos.txt)
		System.out.println("Ingrese la ruta en la que se encuentra el archivo .txt a escanear.");
		String ruta = scanner.nextLine();
		
		//Instancia de la clase que escaneara datos.txt
		TxtScanner txtScanner = new TxtScanner(ruta);
		
		//Instancia del ArrayList con las filas obtenidas del archivo.
        ArrayList<String> filas = new ArrayList<String>();
        
        //Lectura del contenido del arhcivo
        filas = txtScanner.scanTxt();
        
        //Instancia de la calculadora
        PosfixCalc calculadora = new PosfixCalc();
        
        //Ciclo for sobre cada una de las filas en el archivo datos.txt
        for(String fila: filas) {
        	//Resultado por cada expresion
        	System.out.println("\n"+fila);
        	System.out.println("Resultado: "+calculadora.Evaluate(fila));
        }
	}
}
