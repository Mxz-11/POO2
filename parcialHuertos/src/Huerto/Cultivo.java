package Huerto;

public class Cultivo {
	private String nombre;
	private String agua;
	private int cantidad;
	
	public Cultivo (String n, String a, int c) {
		nombre = n;
		agua = a;
		cantidad = c;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int regar(int aguaInicial) {
		if (agua == "alta") {
			return aguaInicial-3;
		}else if (agua == "baja") {
			return aguaInicial-1;
		}else {
			return aguaInicial-2;
		}
	}
	
	public int getCantidad() {
		return cantidad;
	}
	
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	@Override
	public String toString() {
		return "CULTIVO: " + this.nombre + ", " + this.agua + ", " + this.cantidad;
	}
	
}
