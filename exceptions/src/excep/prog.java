package excep;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import excep.*;

public class prog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la ruta de la carpeta: ");
        String folderPath = scanner.nextLine();

        System.out.print("Introduce el nivel de profundidad (0 para solo la carpeta actual): ");
        int depth = scanner.nextInt();

        try {
            listFilesAndFolders(new File(folderPath), 0, depth);
        } catch (InvalidFolderPathException | DepthOutOfRangeException | FolderAccessException | NullPointerException | IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

	private static void listFilesAndFolders(File folder, int currentDepth, int maxDepth)
            throws InvalidFolderPathException, DepthOutOfRangeException, FolderAccessException, NullPointerException, IOException {

		if (!folder.exists() || !folder.isDirectory()) {
            throw new InvalidFolderPathException("La carpeta especificada no es válida.");
        }

        if (currentDepth > maxDepth) {
            throw new DepthOutOfRangeException("El nivel de profundidad especificado está fuera de rango.");
        }

        if (!folder.canRead()) {
            throw new FolderAccessException("No se puede acceder a la carpeta especificada.");
        }
        
        if (folder.toPath() == null) {
        	throw new NullPointerException("Hay que introducir un path");
        }

        System.out.println("Contenido de la carpeta '" + folder.getName() + "':");
        File[] files = folder.listFiles();
        for (File file : files) {
            System.out.println(file.getName());
            if (file.isDirectory() && currentDepth < maxDepth) {
                listFilesAndFolders(file, currentDepth + 1, maxDepth);
            }
        }
	}

}
