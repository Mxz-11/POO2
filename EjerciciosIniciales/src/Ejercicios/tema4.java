package Ejercicios;
import Matrices.*;
import Polimorfismo.*;
import Contador.*;

public class tema4 {
	
	/*Ejercicio 2
	 * Al poner public no da ningún problema, ya que es accesible desde cualquier lado
	 * Al poner protected da error al usarse desde fuera de la clase, exceptuando clases que sean herencia de esta
	 * Al no poner nada (no modifier), da error al usar la funcion/metodo fuera del paquete. 
	 * Al usar private da error al usar la funcion/metodo fuera del fichero.
	 * */
	
	
	
	//Ejercicio 4
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Ejercicio 3
		paq1.Animal a1 = new paq1.Animal();
		paq2.Animal a2 = new paq2.Animal();
		paq3.Animal a3 = new paq3.Animal();
		Primera m = new Primera();
		m.mostrar();
		Segunda s = new Segunda(1,2,3,4,5,6,7,8,9);
		System.out.println();
		s.mostrar();
		int d = s.det();
		System.out.println(d);
		Tercera t = new Tercera();
		t.mostrar();*/
		
		//Polimorfismo
		/*
		Hijo h = new Hijo();
		Padre p = new Padre();
		h.mostrar();
		p.mostrar();*/
		/*
		Contador c = new Contador();
		Contador w = new Contador();
		Contador e = new Contador();
		Contador r = new Contador();
		
		c.mostrar();
		c.finalize();
		w.finalize();
		e.mostrar();*/
		
		/*Desde el main lo unico a lo que no puedo acceder de la matriz padre es al
		 * atributo del padre que tiene el id del tipo de matriz que es.
		Primera e = new Primera();
		System.out.println(e.getIdMatriz());*/
		
		/*Ej11
		 * Al crear una estructura de herencia jerárquica donde un metodo es sobreescrito
		 * el metodo se llama dependiendo del objeto creado. Si es un padre se llama al metodo
		 * del padre, si es un hijo al del hijo y no al del padre y en caso de ser un nieto, se
		 * llama al metodo del nieto, no al del padre ni al del abuelo.
		 * 
		 * Siempre que el metodo esté public se puede llamar desde cualquier hijo de la clase (siempre
		 * que no haya override)
		 * 
		 * No, un objeto de la clase hija no puede llamar de ninguna manera a un metodo de la clase padre
		 */
		
		/*Ej10
		 * Para encadenar constructores no hay ningún problema siempre que lo hagas como el tratamiento de una
		 * pila de datos. Siendo la pila un sistema FIFO.
		 */
		
		/*Ej9
		 * La visibilidad al heredar depende de varios aspectos. Los atributos privados se heredan pero no son accesibles
		 * de ninguna manera, al igual que los metodos. De esta forma si se pretende acceder a los atributos privados, ha de 
		 * ser por medio de funciones publicas como getters y setters.
		 */
		
		
	}
}
