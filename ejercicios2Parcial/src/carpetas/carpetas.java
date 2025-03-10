package carpetas;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;

public class carpetas {

	/*
	 * CLASE PATH
	 * 
	 * toString
	 * getFileName: Devuelve el nombre del archivo o directorio representado por esta ruta.
	 * getParent: Devuelve la ruta del directorio padre
	 * toAbsolutePath: Convierte la ruta en una ruta absoluta.
	 * normalize: Normaliza la ruta eliminando cualquier redundancia
	 * 
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Path path = Paths.get("").toAbsolutePath();
		Path rutaRelativa = path.resolve(Paths.get("src/"));
		
		
		for (int i = 0; i < 3; i++) {
			rutaRelativa = path.resolve(Paths.get("src/ejemplo" + i));
			 
			try {
	            Files.createDirectory(rutaRelativa);
	            System.out.println("La carpeta ha sido creada correctamente.");
	            for (int j = 0; j < 2; j++) {
	            	rutaRelativa = path.resolve(rutaRelativa + "/ejemplo" + j);
					 
					try {
			            Files.createDirectory(rutaRelativa);
			            System.out.println("La carpeta ha sido creada correctamente.");
			        } catch (IOException e) {
			            System.err.println("Error al crear la carpeta: " + e.getMessage());
			        }
	            }
	        } catch (IOException e) {
	            System.err.println("Error al crear la carpeta: " + e.getMessage());
	        }
			
	    
		}
		
	}

}
