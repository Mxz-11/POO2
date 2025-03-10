package main;

public class JavaDoc {
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
}
