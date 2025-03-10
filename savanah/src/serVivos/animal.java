package serVivos;

public class animal extends serVivo {
	private
	char tipo;
	int nivel;
	boolean vivo;
	
	/**
	 * Constructor de la clase Animal
	 */
	public animal() {
		tipo = 'd';
		nivel = 1;
		vivo = true;
	}
	
	/**
	 * SerVivo.tipo = t
	 * @param t nombre por el que se va a identificar al SerVivo
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
	 * SerVivo come, por lo que sube de nivel
	 */
	public void comer() {
		nivel++;
	}
	
	/**
	 * SerVivo muere, por lo que SerVivo.vivo = false;
	 */
	public void morir() {
		vivo = false;
	}
}
