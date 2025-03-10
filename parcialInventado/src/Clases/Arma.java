package Clases;

public class Arma {
	private String nombre;
	private int balas;
	private int dineroPorMuerte;
	private int danio;
	
	
	public Arma(String nombre, int balas, int dineroPorMuerte, int danio) {
		super();
		this.nombre = nombre;
		this.balas = balas;
		this.dineroPorMuerte = dineroPorMuerte;
		this.danio = danio;
	}
	
	public int getDanio() {
		return danio;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getBalas() {
		return balas;
	}
	public void setBalas(int balas) {
		this.balas = balas;
	}
	public int getDineroPorMuerte() {
		return dineroPorMuerte;
	}
	public void setDineroPorMuerte(int dineroPorMuerte) {
		this.dineroPorMuerte = dineroPorMuerte;
	}
	
	@Override
	public String toString() {
		return nombre + " ";
	}
	
}
