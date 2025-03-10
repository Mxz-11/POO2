package Empresa;

import java.util.Random;

public class Programador extends Trabajadores implements ProgramadorLadron{
	private
	double sueldo;
	int horasAldia;
	
	public Programador() {
		Random random = new Random();
		horasAldia = random.nextInt(24) + 1;
		sueldo = random.nextInt(horasAldia) + 1;
	}
	
	public Programador(int n) {
		super(n);
		Random random = new Random();
		horasAldia = random.nextInt(24) + 1;
		sueldo = random.nextInt(horasAldia) + 1;
	}

	@Override
	public void disminuirTrabajo() {
		// TODO Auto-generated method stub
		
	}
}
