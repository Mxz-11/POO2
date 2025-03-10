package carpetas;

import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.io.IOException;

public class fileVisitor extends SimpleFileVisitor<Path> {
	@Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        System.out.println("Entrando en el directorio: " + dir);
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        System.out.println("Saliendo del directorio: " + dir);
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        System.out.println("Archivo: " + file);
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
        System.err.println("Error al visitar el archivo: " + file + ", " + exc.getMessage());
        return FileVisitResult.CONTINUE;
    }

    public static void main(String[] args) throws IOException {
        Path startDir = Path.of("src");
        try {
        	Files.walkFileTree(startDir, new fileVisitor());
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
