package Helper;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class IndexOfSongs {
	public static void generateFiles(Path carpeta, String[] canciones) {
		Random rand = new Random();
		File f = new File(carpeta.toString());
		if (Files.notExists(carpeta)) {
			f.mkdir();
		}
		int r = rand.nextInt(4);
		
		for (int i = 0; i < canciones.length; i++) {
			try {
				File archivo_Cancion = null;
				if (r == 0) {
					archivo_Cancion = new File(f, canciones[i] + ".mp2");

				}else if(r == 1) {
					archivo_Cancion = new File(f, canciones[i] + ".mp3");

				}else if(r == 2) {
					archivo_Cancion = new File(f, canciones[i] + ".mp4");

				}else {
					archivo_Cancion = new File(f, canciones[i] + ".wave");
				}
				
				FileWriter fi = new FileWriter(archivo_Cancion);
				
				fi.close();
			
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static Map<String, Integer> generateCount(Path carpeta) {
		String mp2 = ".mp2";
		String mp3 = ".mp3";
		String mp4 = ".mp4";
		String wave = ".wave";
		
		Map<String, Integer> res = new HashMap<>();
		res.put(mp2, 0);
		res.put(mp3, 0);
		res.put(mp4, 0);
		res.put(wave, 0);
		
		File f = new File(carpeta.toString());
		if (f.isDirectory()) {
            File[] archivos = f.listFiles();
            
            for (File archivo : archivos) {
                if (archivo.getName().toLowerCase().endsWith(".mp2")) {
                	res.put(mp2, res.get(mp2)+1);
                }
                if (archivo.getName().toLowerCase().endsWith(".mp3")) {
                	res.put(mp3, res.get(mp3)+1);
                }
                if (archivo.getName().toLowerCase().endsWith(".mp4")) {
                	res.put(mp4, res.get(mp4)+1);
                }
                if (archivo.getName().toLowerCase().endsWith(".wave")) {
                	res.put(wave, res.get(wave)+1);
                }
            }
        } else {
            System.out.println("La ruta especificada no es una carpeta.");
        }
		
		return res;
	}
}
