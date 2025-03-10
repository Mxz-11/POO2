package Empresa;

import java.util.Random;

public class Manager extends Trabajadores implements ManagerConSuerte{
	private int suerte;
	public Manager(int n) {
		super(n);
		suerte = 0;
	}

	@Override
	public void modificarSuerte() {
		// TODO Auto-generated method stub
		Random random = new Random();
		suerte = random.nextInt(1000) + 1; 
	}
	
}
