package main;
import interfaz1.*;
import interfaz2.*;

public class prueba implements prueba1, prueba2 {
	
	public prueba() {
		
	}
	
	@Override
	public void mostrar() {
		System.out.println("Padre");
		
	}

}
