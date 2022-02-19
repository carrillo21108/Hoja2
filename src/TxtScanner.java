import java.util.*;
import java.io.*;

public class TxtScanner {
	
	private String ruta;

    public TxtScanner(String ruta){
    	this.ruta = ruta;
    }

    public ArrayList<String> leerTxt(){

        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        
        try {
            archivo = new File (ruta);
            fr = new FileReader (archivo);
            br = new BufferedReader(fr);

            // Lectura del archivo
            ArrayList<String> filas = new ArrayList<String>();
            String fila;
            
            while((fila=br.readLine())!=null){
                filas.add(fila);
            }
            return filas;
            
        }catch(Exception e){
        	System.out.println("Error al escanear el archivo.");
            e.printStackTrace();
        }finally{
            // En el finally cerramos el archivo, tanto si se leyo correctamente como si
        	// se encontro alguna excepcion.
            try{                    
                if( fr != null ){   
                    fr.close();     
                }                  
            }catch (Exception f){ 
            	System.out.println("Error al cerrar el archivo.");
               f.printStackTrace();
            }
        }

        return null;

    }

}