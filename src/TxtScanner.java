import java.util.*;
import java.io.*;

public class TxtScanner {
	
	private String ruta="D:\\\\Datos.txt";

    public TxtScanner(){}

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
            e.printStackTrace();
        }finally{
            // En el finally cerramos el archivo, tanto si se leyo correctamente como si
        	// se encontro alguna excepcion.
            try{                    
                if( fr != null ){   
                    fr.close();     
                }                  
            }catch (Exception f){ 
               f.printStackTrace();
            }
        }

        return null;

    }

}