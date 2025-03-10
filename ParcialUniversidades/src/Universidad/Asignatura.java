package Universidad;

public class Asignatura {
	private static int contador = 0;
	private int id;
	private String nombre;
	private int creditos;

	public Asignatura (String n, int c) {
		id = contador;
		contador++;
		nombre = n;
		creditos = c;
	}
	
	public Asignatura(int i, String n, int c) {
		id = i;
		contador++;
		nombre = n;
		creditos = c;
	}
	
	public int getId() {
		return id;
	}
	public int getCreditos() {
		return creditos;
	}
	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public String toString() {
		return "ASIGNATURA: " + "id:" + id + ",nombre:" + nombre + ",creditos:" + creditos + "\n";
	}
}
