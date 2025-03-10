package main;
import interfaz1.*;
import interfaz2.*;

public class hija extends prueba implements prueba1, prueba2{
	public hija() {
		
		
		}
	@Override
	public void mostrar() {
		super.mostrar();
		System.out.println("Hija");
		
	}
}
