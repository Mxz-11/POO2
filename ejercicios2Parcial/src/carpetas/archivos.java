package carpetas;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.DirectoryStream;
import java.io.IOException;

public class archivos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Path carpeta = Paths.get("src/carpetas");

        try {
            // Obtener un flujo de nombres de archivos en la carpeta
            //Files.list(carpeta).forEach(path -> System.out.println(path.getFileName()));
            Files.list(carpeta).filter(path -> path.toString().endsWith(".txt")).forEach(System.out::println);
        } catch (IOException e) {
            System.err.println("Error al leer la carpeta: " + e.getMessage());
        }
        */
        
        /*//Ejemplo2 
        Path carpeta2 = Paths.get("src/carpetas");
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(carpeta, "*.txt")) {
            for (Path file: stream) {
                System.out.println(file.getFileName());
            }
        } catch (IOException e) {
            System.err.println("Error al leer la carpeta: " + e.getMessage());
        }*/
		
		Path directorio = Paths.get("src/carpetas");
        long tamanoMinimo = 10;

        try {
            
            Files.walk(directorio).filter(Files::isRegularFile).filter(path -> {
                     try {
                         return Files.size(path) >= tamanoMinimo;
                     } catch (IOException e) {
                         System.err.println("Error al obtener el tamaño del archivo: " + e.getMessage());
                         return false;
                     }
                 }).forEach(System.out::println);
        } catch (IOException e) {
            System.err.println("Error al listar archivos: " + e.getMessage());
        }
	}

}
