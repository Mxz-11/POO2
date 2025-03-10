package Empresa;
import DNI.*;

public class Trabajadores {
	private
		dni d;
	
	public Trabajadores() {
		d = new dni();
	}
	
	public Trabajadores(int n) {
		d = new dni(n);
	}
	
	public dni getDni() {
		return d;
	}
}
