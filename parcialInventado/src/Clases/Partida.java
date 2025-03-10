package Clases;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import exceptions.exceptionNumJugadores;

public class Partida {
	private List<Ronda> rondas = new ArrayList<>();
	private String equipo1;
	private String equipo2;
	private Equipo e1;
	private Equipo e2;
	
	public Partida (List<Personaje> j1, List<Personaje> j2, String eq1, String eq2) throws exceptionNumJugadores {
		if (j1.size() > 5 || j2.size() > 5) {
			throw new exceptionNumJugadores("Mas de 5 jugadores por equipo");
		}
		equipo1 = eq1;
		equipo2 = eq2;
		Equipo ct = new Equipo(eq1);
		Equipo t = new Equipo(eq2);
		Arma ak = new Arma("AK-47", 30, 100, 40);
		Arma m4 = new Arma("M4A4", 30, 250, 34);
		for (Personaje p: j1) {
			p.addEquipamiento(ak);
			ct.addPersonaje(p);
		}
		for (Personaje p: j2) {
			p.addEquipamiento(m4);
			t.addPersonaje(p);
		}

		Random rand = new Random();
		for (int i = 0; i < 15; i++) {
			if(rand.nextInt(2) == 0) {
				rondas.add(new Ronda(ct));
			}else {
				rondas.add(new Ronda(t));
			}
		}
		e1 = ct;
		e2 = t;
	}
	
	public Ronda getRonda(int i) {
		return rondas.get(i);
	}
	
	public Equipo getEquipo(int i) {
		if (i == 1) {
			return e1;
		}
		else if (i == 2){
			return e2;
		}
		return null;
	}
	
	@Override
	public String toString() {
		int eq1 = 0; 
		int eq2 = 0;
		for (Ronda r: rondas) {
			if(r.getGanador().getBando() == equipo1) {
				eq1++;
			}else if(r.getGanador().getBando() == equipo2) {
				eq2++;
			}
		}
		if (eq1 > eq2){
			return "La partida ha quedado " + eq1 + "-" + eq2 + " ha ganado " + equipo1;
		}else {
			return "La partida ha quedado " + eq1 + "-" + eq2 + " ha ganado " + equipo2;
		}
	}
}
