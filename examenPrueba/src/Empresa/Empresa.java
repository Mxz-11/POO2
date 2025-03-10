package Empresa;

import java.util.Random;

public class Empresa {
	private
	static int MAXTRABAJADORES = 10;
	int dinero, trabajoPendiente;
	Trabajadores t[];
	int numTrabajadores;
	
	public Empresa() {
		t = new Trabajadores[MAXTRABAJADORES];
		dinero = 10000;
		trabajoPendiente = 0;
		Random random = new Random();
		for (int i = 0; i < random.nextInt(5) + 1; i++) {
			t[i] = new Trabajadores();
		}
	}
	
	/**
	 * añade un trabajador a la empresa
	 * @param n
	 */
	public void addTrabajador(Trabajadores n) {
		if (numTrabajadores < MAXTRABAJADORES) {
			t[numTrabajadores] = n;
			numTrabajadores++;
		}
	}
	
	/**
	 * Simula el dinero que hay en 1 dia
	 * @return dinero random entre 1 y 99999999
	 */
	public int simulaDineroDia() {
		Random random = new Random();
		return random.nextInt(99999999) - 30000;	
	}
	
	/**
	 * Simula los trabajos pendientes que hay en 1 dia
	 * @return trabajos random entre 0 y 30
	 */
	public int simulaTrabajosPendientes() {
		Random random = new Random();
		return random.nextInt(31);
	}
	
	public boolean bancarrota() {
		if (dinero < 0) {
			return true;
		}
		return false;
	}
	
	public void simulaUnDia(int dia) {
		System.out.println("Dia " + dia);
		System.out.println("Trabajadores: " + numTrabajadores);
		System.out.println("Dinero: " + simulaDineroDia());
		System.out.println("Trabajo: " + simulaTrabajosPendientes());
		if (bancarrota() == true) {
			System.out.println("La empresa esta en numeros rojos!");
			System.out.println("La empresa esta en numeros rojos!");
		}
		
	}
}
