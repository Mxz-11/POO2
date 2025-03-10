package animales;

import serVivos.Volador;
import serVivos.Carnivoro;

public class Buitre extends Carnivoro implements Volador{
	private boolean volando;
	
	/**
	 * Constructor de la clase Buitre
	 * 
	 */
	public Buitre() {
		setTipo('B');
		setMueve(true);
	}
	
	/**
	 * Función que permite volar a los objetos de la clase Buitre
	 */
	@Override
	public void volar(){
		volando = true;
	}
	
	/**
	 * Función que permite aterrizar o dejar de volar a los objetos de la clase Buitre
	 */
	@Override
	public void aterrizar() {
		volando = false;
	}
}
