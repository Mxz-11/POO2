package persona;

public class Entrenador extends Persona implements Estrella{
	private
	String fh; //Frase hecha del entrenador
	
	public Entrenador() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	public Entrenador(String fh) {
		// TODO Auto-generated constructor stub
		super();
		this.fh = fh;
	}
	
	public String getFh() {
		return fh;
	}

	public void setFh(String fh) {
		this.fh = fh;
	}
	
	@Override
	public void hablarPrensa() {
		System.out.println("Hola soy " + getNombre() + " y el partido lo han jugado muy mal");
	}

}
