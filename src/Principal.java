import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("--CALCULADORA EN NOTACIÓN POSTFIX--");
		System.out.println("Bienvenido\n");
		
		System.out.println("Ingrese la ruta en la que se encuentra el archivo .txt a escanear.");
		String ruta = scanner.nextLine();
		
		TxtScanner txtScanner = new TxtScanner(ruta);
        ArrayList<String> filas = new ArrayList<String>();
        filas = txtScanner.leerTxt();
        
        PosfixCalc calculadora = new PosfixCalc();
        
        for(String fila: filas) {
        	System.out.println("\n"+fila);
        	System.out.println("Resultado: "+calculadora.Evaluate(fila));
        }
	}
}
