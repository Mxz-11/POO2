package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ejemplo<T> extends ArrayList<Object>{
private List<T> lista;
	
	public ejemplo() {
		super();
		lista = new ArrayList<>();
	}

	/*public void ordenar() {
		Collections.sort(lista);
	}*/
	
	public void barajar() {
		Collections.shuffle(lista);
	}
	
	public void invertir() {
		Collections.reverse(lista);
	}
	
	public void rotar(int d) {
		Collections.rotate(lista, d);
	}
	
	public void intercambiar(int i1, int i2) {
		Collections.swap(lista, i1, i2);
	}
	
	public void reemplazar(T viejo, T nuevo) {
		Collections.replaceAll(lista, viejo, nuevo);
	}
	
	public void llenar(T valor) {
		Collections.fill(lista, valor);
	}
	
	public void mostrar() {
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
	}
}
