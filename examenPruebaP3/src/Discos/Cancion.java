package Discos;

public class Cancion {
	private String nombre;
	private double duracion;
	private int anio;
	private String estilo;

	public Cancion(String nombre, double duracion, int anio, String estilo) {
		super();
		this.nombre = nombre;
		this.duracion = duracion;
		this.anio = anio;
		this.estilo = estilo;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public double getDuracion() {
		return duracion;
	}
	
	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}
	
	public int getAnio() {
		return anio;
	}
	
	public void setAnio(int anio) {
		this.anio = anio;
	}
	
	public String getEstilo() {
		return estilo;
	}
	
	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}
	
	
}
