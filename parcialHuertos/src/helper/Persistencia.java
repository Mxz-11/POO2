package helper;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

import Huerto.*;

public class Persistencia {
	public static void toFile(HuertoUrbano hu, String nombreFichero) {
		try (BufferedWriter out = new BufferedWriter(new FileWriter(nombreFichero))) {
			String contenido = hu.toString();
			out.write(contenido);
			out.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static HuertoUrbano fromFile(Path nombreFichero){
		try {
			BufferedReader fIn = new BufferedReader(new FileReader(nombreFichero.toFile()));
			Scanner s = new Scanner(fIn);
			
			HuertoUrbano hu = null;
			
			while(s.hasNext()) {
				String line = s.nextLine();
				
				if(line.startsWith("HUERTO")) {
					String size = line.split(": ")[1];
					hu = new HuertoUrbano(Integer.valueOf(size));
				}
				
				if(line.startsWith("PARCELA")) {
					int size = Integer.valueOf(line.split(":")[1]);
					String[] clientLine = s.nextLine().split(";");
					Cliente client = new Cliente(clientLine[1], clientLine[2], clientLine[3]);
					Parcela parcela = new Parcela(size, client);
					
					String cultivoLine = s.nextLine();
					while(cultivoLine.startsWith("CULTIVO") && s.hasNext()) {
						String[] cLineSp = cultivoLine.split(", ");
						parcela.addCultivo(new Cultivo(cLineSp[0], cLineSp[1], Integer.valueOf(cLineSp[2])));
						cultivoLine = s.nextLine();
					};
					hu.addParcela(parcela);
				}
			}
			
			return hu;
			
		}catch (FileNotFoundException e){
			e.printStackTrace();
			return null;
		}
	}
}
