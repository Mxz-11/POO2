package main;

import tablero.tablero;
import animales.Buitre;
import animales.Leon;
import animales.Cocodrilo;
import animales.Zebra;
import plantas.Pino;
import plantas.Acacia;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Leon l = new Leon();
		Buitre b = new Buitre();
		Pino p = new Pino();
		Cocodrilo c = new Cocodrilo();
		Zebra z = new Zebra();
		Acacia a = new Acacia();
		
		tablero t = new tablero(10);
		t.meterSv(l, 0, 0);
		t.meterSv(b, 8, 5);
		t.meterSv(p, 1, 0);
		t.meterSv(c, 5, 3);
		t.meterSv(z, 9, 9);
		t.meterSv(a, 0, 6);
		t.mostrarTablero();
		
		System.out.println();
		t.actualizarTablero();
		t.mostrarTablero();
		
		System.out.println();
		t.actualizarTablero();
		t.mostrarTablero();
		
		System.out.println();
		t.actualizarTablero();
		t.mostrarTablero();
		
		System.out.println();
		t.actualizarTablero();
		t.mostrarTablero();
		
		System.out.println();
		t.actualizarTablero();
		t.mostrarTablero();

	}

}
