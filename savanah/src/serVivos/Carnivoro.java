package serVivos;

public class Carnivoro extends animal{
	
	/**
	 * Constructor de la clase Carnivoro
	 */
	public Carnivoro() {
		
	}
	
	/**
	 * Función de animales carnivoros para cazar
	 */
	public void cazar() {
		System.out.println("El carnivoro " + getTipo() + " esta cazando");
	}
}
