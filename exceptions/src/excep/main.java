package excep;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		
		try {
			int[] arr = {1, 2, 3};
			System.out.println(arr[3]);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.err.println("Se ha intentado acceder a una dirección de memoria no valida");

		}
		
		try {
			int result = 10 / 0;
		} catch(ArithmeticException e) {
			System.err.println("Se ha dividido por 0");
		}
		
		try {
			String str = null;
			System.out.println(str.length()); 
		} catch(NullPointerException e) {
			System.err.println("Se ha intentado imprimir una cadena nula");
		}
	}

}
