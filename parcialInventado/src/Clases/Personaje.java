package Clases;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Personaje {
	private Set<Arma> armas = new HashSet<>();
	private int id;
	private int health;
	private String user;
	private static int contador = 0;
	
	public Personaje(String u) {
		super();
		user = u;
		this.id = contador;
		contador++;
		health = 100;
	}
	
	public void addEquipamiento(Arma m) {
		armas.add(m);
	}
	
	public void recibirGolpe(int danio) {
		health -= danio;
	}
	
	public int disparar() {
		Random rand = new Random();
		int armaRandom = rand.nextInt(armas.size());
		List<Arma> aux = new ArrayList<>(armas);
		return aux.get(armaRandom).getDanio();
	}
	
	@Override
	public String toString() {
		String a = "";
		for (Arma ar: armas) {
			a += ar.toString();
		}
		return "Personaje: " + user + ", con las armas "+ a;
	}
}
