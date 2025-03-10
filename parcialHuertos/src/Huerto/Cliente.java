package Huerto;

public class Cliente {
	private static int contador = 0;
	private int id;
	private String nombre;
	private String apellido;
	private String telefono;
	
	public Cliente(String tel, String n, String a) {
		id = contador;
		contador++;
		nombre = n;
		apellido = a;
		telefono = tel;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
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
	
	public String getTelefono() {
		return telefono;
	}
	
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	@Override
	public String toString() {
		return "CLIENTE" + id + ";" + nombre + ";" + apellido + ";" + telefono;
	}
	
	
}
