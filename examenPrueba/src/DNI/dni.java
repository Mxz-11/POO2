package DNI;

import java.util.Random;

public class dni {
private
	int num;
	char letra;
	public dni() {
		Random random = new Random();
		num = random.nextInt(99999999) + 1;
		letra = calculaLetra(num);
	}
	
	public dni(int num, char letra) {
		this.num = num;
		this.letra = letra;
	}
	
	public dni(int num) {
		this.num = num;
		this.letra = calculaLetra(num);
	}
	
	public dni(char letra) {
		this.letra = letra;
		Random random = new Random();
		num = random.nextInt(99999999) + 1;
	}
	
	
	
	public int getNum() {
		return num;
	}
	
	public char getLetra() {
		return letra;
	}
	
	/**
	 * Calcula la letra valida para un dni
	 * @param num es el numero del dni
	 * @return la letra válida para un numero de dni
	 */
	char calculaLetra(int num) {
		int a = 65;
		int modulo = num % 26;
		a = a + modulo;
		return (char) a;
	}
	
	public boolean esValido() {
		return this.letra == calculaLetra(this.num);
	}
	
}
