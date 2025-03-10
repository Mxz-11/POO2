package main;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashSet;

import exceptions.AguaInsudicienteException;
import helpers.HelperHuerto;
import helpers.Persistencia;
import huertos.HuertoUrbano;

public class App {

	public static void main(String[] args) {
		HashSet<String> plantas = new HashSet<String>();
		plantas.add("Tomate");
		plantas.add("Cebolla");
		plantas.add("Lechuga");
		plantas.add("Zanahoria");
		plantas.add("Albahaca");
		
		HuertoUrbano huerto = HelperHuerto.GenerateHuerto(5000, 22, plantas);

		//System.out.println(huerto);
		//Persistencia.toFile(huerto);
		//HuertoUrbano huertoFF = Persistencia.fromFile(Paths.get("./files/huerto.txt"));
		
		//Persistencia.toJerarquia(huerto);
		
		
		try {
			huerto.regar(1000);
		} catch (AguaInsudicienteException e) {
			e.printStackTrace();
		}
		
		
		
		//System.out.println(huertoFF);
	}

}
