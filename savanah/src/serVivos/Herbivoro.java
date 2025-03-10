package serVivos;

public class Herbivoro extends animal{
	/**
	 * Constructor de la clase Herbivoro
	 */
	public Herbivoro(){
		
	}
	
	/**
	 * Funcion propia de Herbivoros para buscar plantas
	 */
	public void buscaPlanta() {
		System.out.println("El herbivoro " + getTipo() + " esta buscando plantas");
	}
}
