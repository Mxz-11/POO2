package Elementos;

import java.util.HashMap;
import java.util.Map;

public class Elementos {
	private Map<String, Integer> elementos = new HashMap<>();
	
	public Elementos() {
		
	}
	
	public void agnadir(String nombre, int precio) {
		elementos.put(nombre, precio);
	}
	
	public int sacarPrecio(String elem) {
		return elementos.get(elem);
	}
	
	public void mostrar() {
		for (Map.Entry<String, Integer> entry : elementos.entrySet()) {
			System.out.println("Elemento: " + entry.getKey() + ", " + entry.getValue());
		}
	}
}
