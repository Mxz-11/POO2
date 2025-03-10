package carpetas;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.io.IOException;


public class copiarDirectorio {

	public static void copyDirectory(Path source, Path target, int numVeces) throws IOException {
        if (numVeces < 3) {
        	Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
            String t = target.toString() + numVeces;
            Path targetFinal = Paths.get(t);

            Files.walk(source).filter(path -> !path.equals(source)).forEach(p -> { 
                    try {
                        Path dest = targetFinal.resolve(source.relativize(p)); 
                        if (Files.isDirectory(p)) {
                            Files.createDirectories(dest);
                        } else {
                            Files.copy(p, dest, StandardCopyOption.REPLACE_EXISTING);
                        }
                    } catch (IOException e) {
                        System.err.println("Error al copiar: " + e.getMessage());
                    }
                 });
        }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Path origen = Paths.get("src/carpetas");
        Path destino = Paths.get("src/carpetas/prueba");

        try {
            copyDirectory(origen, destino, 0);
            System.out.println("Directorios copiado correctamente.");
        } catch (IOException e) {
            System.err.println("Error al copiar el directorios: " + e.getMessage());
        }
    }

    

}
