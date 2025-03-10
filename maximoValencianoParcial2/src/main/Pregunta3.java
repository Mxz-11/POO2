package main;

import java.nio.file.Paths;
import java.util.Map;

import Helper.IndexOfSongs;

public class Pregunta3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] canciones = new String[20];
		for (int i = 0; i < 20; i++) {
			canciones[1] = "Cancion" + i;
		}
		
		IndexOfSongs.generateFiles(Paths.get("src/ios"), canciones);
		Map<String, Integer> m = IndexOfSongs.generateCount(Paths.get("src/ios"));
		System.out.println(m);
	}

}
