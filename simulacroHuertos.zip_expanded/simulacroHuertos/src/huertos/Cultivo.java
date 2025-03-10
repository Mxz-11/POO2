package huertos;

public class Cultivo {
	public String nombre;
	public String necesidadAgua;
	public int cantidadPlantas;
	
	public Cultivo(String nombre, String necesidadAgua, int cantidadPlantas) {
		super();
		this.nombre = nombre;
		this.necesidadAgua = necesidadAgua;
		this.cantidadPlantas = cantidadPlantas;
	}
	
	public int regar(int aguaInicial) {
		if(this.necesidadAgua == "normal") {
			return aguaInicial-2;
		}else if(this.necesidadAgua == "alta") {
			return aguaInicial-3;
		}else {
			return aguaInicial-1;
		}
	}
	
	
	@Override
	public String toString() {
		return "CULTIVO: " + this.nombre + ", " + this.necesidadAgua + ", " + this.cantidadPlantas;
	}
}
