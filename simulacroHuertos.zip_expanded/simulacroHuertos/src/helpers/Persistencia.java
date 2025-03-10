package helpers;
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

import huertos.Cliente;
import huertos.Cultivo;
import huertos.HuertoUrbano;
import huertos.Parcela;

public class Persistencia {
	public static void toFile(HuertoUrbano huerto) {
		BufferedWriter fOut = null;
		try {
			String content = huerto.toString();
			fOut = new BufferedWriter(new FileWriter("./files/huerto.txt"));
			fOut.write(content);
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(fOut != null) {
				try {
					fOut.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public static HuertoUrbano fromFile(Path filePath) {
		
		BufferedReader fIn = null;
		Scanner fileScanner = null;
		
		try {
			fIn = new BufferedReader(new FileReader(filePath.toFile()));
			fileScanner = new Scanner(fIn);
			
			HuertoUrbano huerto = null;
						
			while(fileScanner.hasNext()) {
				String line = fileScanner.nextLine();
				
				if(line.startsWith("HUERTO")) {
					String size = line.split(": ")[1];
					huerto = new HuertoUrbano(Integer.valueOf(size));
				}
				
				if(line.startsWith("PARCELA")) {
					int size = Integer.valueOf(line.split(":")[1]);
					String[] clientLine = fileScanner.nextLine().split(", ");
					Cliente client = new Cliente(clientLine[1], clientLine[2]);
					Parcela parcela = new Parcela(size, client);
					
					String cultivoLine = fileScanner.nextLine();
					while(cultivoLine.startsWith("CULTIVO") && fileScanner.hasNext()) {
						String[] cult = cultivoLine.split(": ");
						String[] cLineSp = cult[1].split(", ");
						parcela.addCultivo(new Cultivo(cLineSp[0], cLineSp[1], Integer.valueOf(cLineSp[2])));
						cultivoLine = fileScanner.nextLine();
					};
					huerto.addParcela(parcela);
				}
			}
			return huerto;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return null;
		}finally {
			
				try {
					if(fIn != null) {
						fIn.close();
					}

					if(fileScanner != null) {
						fileScanner.close();
					}
				
				} catch (IOException e) {
					e.printStackTrace();
				}
			
		}	
	}

	public static void toJerarquia (HuertoUrbano huerto) {
		huerto.parcelas.forEach((parcela) -> {
			parcela.cultivos.forEach((cultivo) -> {
				try {
					Files.createDirectory(Paths.get("./files/huerto_" + huerto.size + "/parcelaxe_" + String.join(parcela.owner.name, "_") + "/cultivo_" + cultivo.nombre));
				} catch (IOException e) {
					e.printStackTrace();
				}
			});
		});
	}
}


