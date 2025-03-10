package Universidad;

public class Alumno {
	private String nombre;
	private int id;
	
	public Alumno(String n, int i) {
		nombre = n;
		id = i;
	}
	
	public int getId() {
		return id;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public String toString() {
		return "Alumno: " + id + ",nombre:" + nombre;
	}
}
