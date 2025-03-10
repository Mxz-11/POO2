package Contador;

public class Contador {
	private
		static int cont;
		static int dest;
	public Contador() {
		cont++;
	}
	
	public void mostrar() {
		System.out.println("Numero de objetos creados: " + cont);
	}
	
	public void finalize() {
		cont--;
		dest++;
	}

}
