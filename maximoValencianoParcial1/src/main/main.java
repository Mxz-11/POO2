package main;
import java.util.Random;

import Equipos.*;
import persona.*;

public class main {

	public static void ordenarEquipos(Equipo e[]) {
		for (int i = 0; i < e.length - 1; i++) {
            for (int j = 0; j < e.length - i - 1; j++) {
                if (e[j].compareTo(e[j+1]) == -1) {
                    Equipo temp = e[j];
                    e[j] = e[j + 1];
                    e[j + 1] = temp;
                }
            }
        }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Equipo l = new Equipo();
		Jugador j = new Jugador();
		l.agnadirJugador(j);
		l.printEquipo();*/
		Equipo e[] = new Equipo[18];
		for (int i = 0; i < 18; i++) {
			e[i] = new Equipo();
		}
		
		for (int i = 0; i < 153; i++) {
			for (int j = 0; j < 18; j++) {
				int z = e[j].getPartJugados();
				e[j].setPartJugados(z+1);
			}
			Random rand = new Random();
	        int n = rand.nextInt(18);
	        int pg = e[n].getPartGanados();
	        e[n].setPartGanados(pg + 1);
	        
		}
		
		ordenarEquipos(e);
		
		for (int j = 0; j < 18; j++) {
			e[j].printEquipo();
		}
		
		
	}

}
