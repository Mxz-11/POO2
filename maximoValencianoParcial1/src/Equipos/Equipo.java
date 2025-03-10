package Equipos;
import persona.*;

public class Equipo implements Comparable<Equipo>{
	private
	String nombre;
	int dineroDisp;
	int partJugados;
	int partGanados;
	Entrenador e;
	Jugador jugadores[];
	int numJugadores;
	
	public Equipo() {
		// TODO Auto-generated constructor stub
		nombre = "default";
		dineroDisp = 0;
		partJugados = 0;
		partGanados = 0;
		e = new Entrenador();
		jugadores = new Jugador[12];
	}
	
	public void printEquipo() {
		System.out.println("Equipo: " + nombre);
		System.out.println("Entrenador: " + e.getNombre() + " " + e.getApellido());
		System.out.println("Jugadores: ");
		for (int i = 0; i < numJugadores; i++) {
			System.out.println(jugadores[i].getNombre() + " " + jugadores[i].getApellido() + " - POSICION " + jugadores[i].getPos());
		}
		System.out.println("Partidos Jugados: " + partJugados);
		System.out.println("Partidos Ganados: " + partGanados);
	}
	
	public int getPartJugados() {
		return partJugados;
	}

	public void setPartJugados(int partJugados) {
		this.partJugados = partJugados;
	}

	public int getPartGanados() {
		return partGanados;
	}

	public void setPartGanados(int partGanados) {
		this.partGanados = partGanados;
	}
	
	public void agnadirJugador(Jugador j) {
		if (numJugadores < 12) {
			jugadores[numJugadores] = j;
			numJugadores++;
		}
	}

	@Override
	public int compareTo(Equipo arg0) {
		// TODO Auto-generated method stub
		if (partGanados > arg0.partGanados) {
			return 1;
		}else if(partGanados < arg0.partGanados) {
			return -1;
		}else {
			return 0;
		}
	}

}
