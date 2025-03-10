package informes;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import Clases.Equipo;
import Clases.Partida;

public class Informe {
	
	public static void informePartida(Path p, Partida partida) {
		File f = new File(p.toString());
		if (Files.notExists(p)) {
			f.mkdir();
		}
		
		List<Equipo> e = new ArrayList<>();
		e.add(partida.getEquipo(1));
		e.add(partida.getEquipo(2));
		

		for (Equipo equipo: e) {
			String nombreEquipo = equipo.getBando() + ".txt";
			File archivo_Equipo = new File(f.toString(), nombreEquipo);
			
			try {
				FileWriter fi = new FileWriter(archivo_Equipo);
				fi.write(e.toString());
				fi.close();
				System.out.println("Se ha escrito correctamente el fichero " + archivo_Equipo);
			}catch(IOException t) {
				System.err.println(t.getMessage());
			}
		}
	}
}
