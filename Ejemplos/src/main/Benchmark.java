package main;

public class Benchmark {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 11;
		int b = 42;
		JavaDoc j = new JavaDoc();
		double antes = System.nanoTime();
		System.out.println(j.mcd(a,b));	//Prueba ej3.1
		double despues = System.nanoTime();
		
		System.out.println("La funcion mcd ha tardado: " + (despues-antes) + " milisegundos");
		
	}

}
