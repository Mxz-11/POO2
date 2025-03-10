package persona;

public class Persona {
private
	String nombre;
	String apellido;
	int valorMercado;

	public Persona() {
		// TODO Auto-generated constructor stub
		nombre = "default";
		apellido = "default";
		valorMercado = 200;
	}
	
	public Persona(String n, String a, int vm) {
		nombre= n;
		apellido = a;
		valorMercado = vm;
	}
	
	/**
	 * 
	 * @return Persona.nombre
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getValorMercado() {
		return valorMercado;
	}
	public void setValorMercado(int valorMercado) {
		this.valorMercado = valorMercado;
	}
		

}
