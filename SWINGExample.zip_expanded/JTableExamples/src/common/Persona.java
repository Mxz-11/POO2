package common;


public class Persona {

	
	private String nombre;
	private String apellido;
	private int edad;
	
	public Persona(String nombre, String apellido, int edad) {
		this.setNombre(nombre);
		this.setApellido(apellido);
		this.setEdad(edad);
	}

	
	public String [] getAsString() {
		
		return new String[] {getNombre(),getApellido(),getEdad()+""};
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getNombre()+" - "+getApellido()+" - "+getEdad();
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
}
