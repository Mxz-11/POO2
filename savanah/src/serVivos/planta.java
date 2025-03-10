package serVivos;

public class planta extends serVivo {
	private
	char tipo;
	int nivel;
	boolean vivo;
	
	/**
	 * Constructor de la clase Planta
	 */
	public planta() {
		tipo = 'd';
		nivel = 1;
		vivo = true;
	}
	
	/**
	 * SerVivo.tipo = t
	 * @param t es un char que identifica los Objetos de la clase
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
	
	/**
	 * SerVivo.nivel++, La planta "come"
	 */
	public void fotosintesis() {
		nivel++;
	}
	
	/**
	 * SerVivo muere, por lo que SerVivo.vivo = false;
	 */
	public void morir() {
		vivo = false;
	}
}
