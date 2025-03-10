package Clases;

public class Ronda {
	private Equipo ganador;

	public Ronda(Equipo ganador) {
		super();
		this.ganador = ganador;
	}

	public Equipo getGanador() {
		return ganador;
	}

	public void setGanador(Equipo ganador) {
		this.ganador = ganador;
	}
	
	@Override
	public String toString() {
		return "Equipo ganador " + ganador; 
	}
}
