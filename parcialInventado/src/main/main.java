package main;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import Clases.Equipo;
import Clases.Partida;
import Clases.Personaje;
import exceptions.exceptionNumJugadores;
import informes.Informe;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Personaje> ct = new ArrayList<>();
		List<Personaje> t = new ArrayList<>();
		
		ct.add(new Personaje("Jorgy"));
		ct.add(new Personaje("Baldcrescent5"));
		
		t.add(new Personaje("Samu"));
		t.add(new Personaje("Fran"));
		
		Partida p;
		try {
			p = new Partida(ct, t, "ct", "t");
			Equipo c = p.getEquipo(1);
			System.out.println(p);
			System.out.println(c);
			Informe.informePartida(Paths.get("./src/data"), p);
		} catch (exceptionNumJugadores e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
