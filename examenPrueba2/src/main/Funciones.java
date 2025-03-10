package main;

public class Funciones {

	public Funciones() {
		// TODO Auto-generated constructor stub
	}
	
	public static void printMercancias(Mercancia m[]){
		for (int i = 0; i < m.length; i++) {
			System.out.println("Mercancia " + m[i].getTipo());
			System.out.println("id: " + m[i].getId());
			if (m[i] instanceof Irregular) { 
	            Irregular aux = (Irregular) m[i]; 
	            System.out.println("Volumen mercancia: " + aux.calculaVolumen());
	        }else if(m[i] instanceof Ortoedro) { 
	            Ortoedro aux = (Ortoedro) m[i]; 
	            System.out.println("Volumen mercancia: " + aux.calculaVolumen());
	        }else if(m[i] instanceof Piramide) { 
	            Piramide aux = (Piramide) m[i]; 
	            System.out.println("Volumen mercancia: " + aux.calculaVolumen());
	        }else if(m[i] instanceof Cilindrica) { 
	            Cilindrica aux = (Cilindrica) m[i]; 
	            System.out.println("Volumen mercancia: " + aux.calculaVolumen());
	        }else {
	            Esfera aux = (Esfera) m[i]; 
	            System.out.println("Volumen mercancia: " + aux.calculaVolumen());
	        }
		}
	}
}
