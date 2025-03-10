package serVivos;

public class serVivo {
	private
	char tipo;
	boolean mueve;
	
	/**
	 * Constructor de la clase SerVivo
	 */
	public serVivo(){
		
	}
	
	/**
	 * SerVivo.mueve = m
	 * @param m, m es un booleano que especifica si el SerVivo es capaz de moverse
	 */
	public void setMueve(boolean m) {
		mueve = m;
	}
	
	/**
	 * @return SerVivo.mueve
	 */
	public boolean getMueve() {
		return mueve;
	}
	
	/**
	 * SerVivo.tipo = t
	 * @param t, t es un char que identifica a un objeto de la clase SerVivo
	 */
	public void setTipo(char t) {
		tipo = t;
	}
	
	/**
	 * @return SerVivo.tipo
	 */
	public char getTipo() {
		return tipo;
	}
	
}
