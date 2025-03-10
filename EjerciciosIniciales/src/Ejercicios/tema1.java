/*****************************************************************************************
*   Fichero tema1.java
*   Autor Original: Máximo Valenciano, alu.167442
*   Ultima revisión:  9/2/2024
*   Resumen: Programa que recoge los ejercicios del tema 1
*
*******************************************************************************************/

package Ejercicios;

public class tema1 {

	// Ejercicio 1
	static void printaNum(int n) {
		for (int i = 0; i <= n; i++) {
			System.out.println(i);
		}
	}

	// Ejercicio 2
	static void printaNumII(int n) {
		for (int i = 1; i <= n; i++) {
			System.out.print(i);
			if (i % 2 == 0) {
				System.out.println("PAR");
			} else if (i % 3 == 0) {
				System.out.println("TRIO");
			} else {
				System.out.println();
			}
		}
	}

	// Ejercicio 3 Maximo Común Divisor
	/**
	 * Maximo Común Divisor de dos números
	 * @param a primer número
	 * @param b segundo número
	 * @return Maximo Común divisor de a y b
	 */
	public static int mcd(int a, int b) {
		if (a == 0) {
			return b;
		} else if (b == 0) {
			return a;
		} else {
			return mcd(b, a % b);
		}
	}

	// Ejercicio 3 Factorial de un número
	static int factorial(int n) {
		if (n == 1) {
			return 1;
		} else {
			return n * factorial(n - 1);
		}
	}

	// Ejercicio 3 EsPrimo?
	static boolean esPrimo(int num, int div) {
		if (num / 2 < div) {
			return true;
		} else {
			if (num % div == 0) {
				return false;
			} else {
				return esPrimo(num, div + 1);
			}
		}
	}

	// Ejercicio 3 Fibonacci de una posición
	static int fibo(int pos) {
		if (pos == 1) {
			return 1;
		} else if (pos == 2) {
			return 1;
		} else {
			return fibo(pos - 1) + fibo(pos - 2);
		}
	}

	// Ejercicio 4 imprimir una serie de caracteres
	static void imprimeCaracteres() {
		System.out.println();
		System.out.println("\"\"");
		System.out.println("\"\"\n\n\n\"\"");
	}

	// Ejercicio 5 mostrar una tabla ascii con valores hexadecimal, decimal y caracter
	static void tablaAscii() {
		System.out.println("Decimal\tHexadecimal\tCarácter");

		for (int i = 32; i < 127; i++) {

			char c = (char) i;

			System.out.println(i + "\t" + Integer.toHexString(i) + "\t\t" + c);
		}
	}

	// Ejercicio 6 mostrar un tablero de ejedrez de una dimension dada
	static void tablero(int dimension) {
		for (int i = 0; i < dimension; i++) {
			for (int j = 0; j < dimension; j++) {
				if ((i + j) % 2 == 0) {
					System.out.print("o ");
				} else {
					System.out.print("* ");
				}
			}
			System.out.println(); // Nueva línea después de cada fila
		}
	}

	// Ejercicio 7 mostrar una piramide de una altura dada, en funcion a una posición
	static void piramide(int altura, int posicion) {
		switch (posicion) {
		case 1:
			for (int i = 1; i <= altura * 2 - 1; i++) {
				for (int j = 1; j <= altura; j++) {
					if (i <= altura) {
						if (j <= i) {
							System.out.print("*");
						} else {
							System.out.print("-");
						}
					} else {
						if (j <= (altura * 2 - i)) {
							System.out.print("*");
						} else {
							System.out.print("-");
						}
					}
				}
				System.out.println();
			}
			break;
		case 2:
			for (int i = altura; i >= 1; i--) {
				for (int j = 1; j <= altura * 2 - 1; j++) {
					if (j <= altura - i || j >= altura + i) {
						System.out.print("-");
					} else {
						System.out.print("*");
					}
				}
				System.out.println();
			}
			break;
		case 3:
			for (int i = 1; i <= altura * 2 - 1; i++) {
				for (int j = 1; j <= altura; j++) {
					if (i <= altura) {
						if (j <= (altura - i)) {
							System.out.print("-");
						} else {
							System.out.print("*");
						}
					} else {
						if (j <= (i - altura)) {
							System.out.print("-");
						} else {
							System.out.print("*");
						}
					}
				}
				System.out.println();
			}
			break;
		default:
			for (int i = 1; i <= altura; i++) {
				for (int j = 1; j <= 2 * altura - 1; j++) {
					if (j >= altura - i + 1 && j <= altura + i - 1) {
						System.out.print("* ");
					} else {
						System.out.print("- ");
					}
				}
				System.out.println();
			}
			break;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 18;
		int b = 9;

		// printaNum(a);	//Prueba ej1

		// printaNumII(a);	//Prueba ej2

		double antes = System.nanoTime();
		System.out.println(mcd(a,b));	//Prueba ej3.1
		double despues = System.nanoTime();
		
		System.out.println("La funcion mcd ha tardado: " + (despues-antes) + " milisegundos");
		//factorial(a);		//Prueba ej3.2

		/*
		 * if (esPrimo(73, 2) == true) { System.out.println("Si"); }else {	//Prueba ej3.3
		 * System.out.println("No"); }
		 */

		// System.out.println(fibo(b));	//Prueba ej3.4

		// imprimeCaracteres();	//Prueba ej4

		// tablaAscii();	//Prueba ej5

		// tablero(8);	//Prueba ej6

		//piramide(4, 0);	//Prueba ej7 (piramide normal)
		//piramide(4, 1);	//Prueba ej7 (piramide mirando hacia la derecha)
		//piramide(4, 2);	//Prueba ej7 (piramide al revés)
		//piramide(4, 3);	//Prueba ej7 (piramide mirando hacia la izquierda)
	}

}
