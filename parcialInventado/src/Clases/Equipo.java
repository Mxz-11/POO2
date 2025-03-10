package Clases;

import java.util.HashSet;
import java.util.Set;

public class Equipo {
	private Set<Personaje> personajes = new HashSet<>();
	private String bando;
	
	
	public Equipo(String bando) {
		super();
		this.bando = bando;
	}
	
	public String getBando() {
		return bando;
	}

	public void setBando(String bando) {
		this.bando = bando;
	}

	public void addPersonaje (Personaje j) {
		personajes.add(j);
	}
	
	@Override
	public String toString() {
		String p = "";
		for (Personaje k: personajes) {
			p += k.toString() + "\n";
		}
		return "Equipo: " + bando + "\n" + p;
	}
}
