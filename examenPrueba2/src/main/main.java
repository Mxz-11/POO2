package main;

public class main {

	public static void main(String[] args) {
		Mercancia m[] = new Mercancia[30];
		MercanciaHelper mercanciaHelper = new MercanciaHelper();
		m = mercanciaHelper.createMercanciaRandom(30, m);
		
		Funciones.printMercancias(m);
		/*
		Mercancia l = MercanciaHelper.buscaMinimoMaximo(m, true);
		System.out.println(l.getVolumen());
		System.out.println(l.getId());*/
		/*mercanciaHelper.ordenaAscendenteDescendente(m, true);
		Funciones.printMercancias(m);*/
	}

}
