package Supermercado;

import java.util.Map;

import Elementos.Elementos;

public class Supermercado {
	private Elementos elementos = new Elementos();
	private Elementos descuentos = new Elementos();
	private String nombre;
	
	
	public Supermercado() {
		elementos.agnadir("patatas", 10);
		elementos.agnadir("coliflor", 1);
		elementos.agnadir("sandia", 6);
		elementos.agnadir("brocoli", 4);
		elementos.agnadir("remolacha", 15);
		
		descuentos.agnadir("patatas", 40);
		descuentos.agnadir("coliflor", 10);
		descuentos.agnadir("sandia", 60);
		descuentos.agnadir("brocoli", 40);
		descuentos.agnadir("remolacha", 35);
	}
	
	public Supermercado(String n) {
		nombre = n;
		elementos.agnadir("patatas", 10);
		elementos.agnadir("coliflor", 1);
		elementos.agnadir("sandia", 6);
		elementos.agnadir("brocoli", 4);
		elementos.agnadir("remolacha", 15);
		
		descuentos.agnadir("patatas", 40);
		descuentos.agnadir("coliflor", 10);
		descuentos.agnadir("sandia", 60);
		descuentos.agnadir("brocoli", 40);
		descuentos.agnadir("remolacha", 35);
	}
	
	public void mostrarDescuentos() {
		System.out.println("El supermercado " + nombre + " tiene de ofertas hoy:");
		descuentos.mostrar();
	}
	
	public void mostrarProductos() {
		System.out.println("El supermercado " + nombre + " tiene de los productos:");
		elementos.mostrar();
	}
	
	public void vender(String producto) {
		int precio = elementos.sacarPrecio(producto);
		int desc = descuentos.sacarPrecio(producto);
		if (precio != 0) {
			System.out.println("El producto " + producto + " tiene un precio actual de " + (precio - (precio*desc/100)));
		}
		else {
			System.out.println("El producto " + producto + " no se encuentra en el supermercado");
		}
	}
	
	
}
