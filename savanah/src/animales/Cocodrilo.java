package animales;

import serVivos.Acuatico;
import serVivos.Carnivoro;

public class Cocodrilo extends Carnivoro implements Acuatico{
	/**
	 * Constructor de la clase Cocodrilo
	 */
	public Cocodrilo() {
		setTipo('C');
		setMueve(true);
	}
	
	/**
	 * Función que permite nadar a los objetos de la clase Cocodrilo
	 */
	@Override
	public void nadar() {
		System.out.println("El cocodrilo está nadando");
		
	}
}
