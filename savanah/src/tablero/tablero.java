package tablero;

import java.util.Random;
import serVivos.animal;
import serVivos.planta;
import serVivos.serVivo;

public class tablero {
	private int tam;
	int numS;
	int numNs;
	char t[][];
	char nM[];

	/**
	 * Constructor de la clase Tablero
	 */
	public tablero() {
		tam = 1;
		numS = 0;
		numNs = 0;
		nM = new char[10];
		t = new char[tam][tam];
		for (int i = 0; i < tam; i++) {
			for (int j = 0; j < tam; j++) {
				t[i][j] = ' ';
			}
		}
	}

	/**
	 * Constructor de la clase Tablero con parametros
	 * @param ta es el tamaño (filas y columnas) del tablero
	 */
	public tablero(int ta) {
		tam = ta;
		numS = 0;
		numNs = 0;
		nM = new char[10];
		t = new char[tam][tam];
		for (int i = 0; i < tam; i++) {
			for (int j = 0; j < tam; j++) {
				t[i][j] = ' ';
			}
		}
	}

	/*
	 * public void inicializarTablero() { for (int i = 0; i < tam; i++) { for (int j
	 * = 0; j < tam; j++) { t[i][j] = ' '; } } }
	 */

	/**
	 * Función que muestra por pantalla el tablero
	 */
	public void mostrarTablero() {
		for (int i = 0; i < tam; i++) {
			System.out.print("|");
			for (int j = 0; j < tam; j++) {
				System.out.print(t[i][j]);
				System.out.print("|");
			}
			System.out.println();
		}
	}

	/**
	 * Función que mete un SerVivo al tablero
	 * @param a es el animal que se va a meter en el tablero
	 * @param posX es la posición X (columnas) en el tablero
	 * @param posY es la posición Y (filas) en el tablero
	 */
	public void meterSv(serVivo a, int posX, int posY) {
		if (posX >= 0 && posX < tam && posY >= 0 && posY < tam) {
			if (numS < 10 && t[posX][posY] == ' ') {
				t[posX][posY] = a.getTipo();
				numS++;
				if (a.getMueve() == false) {
					nM[numNs] = a.getTipo();
					numNs++;
				}
			} else {
				System.out.println(
						"Ha ocurrido un error, puede que haya un animal en esa posicion o que la posicion este fuera de rango");
			}
		}
	}

	/**
	 * Función que actualiza el tablero, moviendo solo a los animales si es posible
	 */
	public void actualizarTablero() {
		Random random = new Random();
		for (int i = 0; i < tam; i++) {
			for (int j = 0; j < tam; j++) {
				boolean seMueve = true;
				if (t[i][j] != ' ') {
					for (int k = 0; k < numNs; k++) {
						if(t[i][j] == nM[k]) {
							seMueve = false;
						}
					}
					if (seMueve == true) {
						if (t[i][j] != ' ') {
							int nuevaPos = random.nextInt(8) + 1;
							switch(nuevaPos) {
							case 1:
								if (i-1  >= 0 && j-1 >= 0 && t[i-1][j-1] == ' ') {
									char aux = t[i][j];
									t[i-1][j-1] = aux;
									t[i][j] = ' ';
								}
								break;
							case 2:
								if (i-1  >= 0 && t[i-1][j] == ' ') {
									char aux = t[i][j];
									t[i-1][j] = aux;
									t[i][j] = ' ';
								}
								break;
							case 3:
								if (i-1  >= 0 && j+1 < tam && t[i-1][j+1] == ' ') {
									char aux = t[i][j];
									t[i-1][j+1] = aux;
									t[i][j] = ' ';
								}
								break;
							case 4:
								if (j-1 >= 0 && t[i][j-1] == ' ') {
									char aux = t[i][j];
									t[i][j-1] = aux;
									t[i][j] = ' ';
								}
								break;
							case 5:
								if (j+1 < tam && t[i][j+1] == ' ') {
									char aux = t[i][j];
									t[i][j+1] = aux;
									t[i][j] = ' ';
								}
								break;
							case 6:
								if (i+1  < tam && j-1 >= 0 && t[i+1][j-1] == ' ') {
									char aux = t[i][j];
									t[i+1][j-1] = aux;
									t[i][j] = ' ';
								}
								break;
							case 7:
								if (i+1  < tam && t[i+1][j] == ' ') {
									char aux = t[i][j];
									t[i+1][j] = aux;
									t[i][j] = ' ';
								}
								break;
							case 8:
								if (i+1  < tam && j+1 < tam && t[i+1][j+1] == ' ') {
									char aux = t[i][j];
									t[i+1][j+1] = aux;
									t[i][j] = ' ';
								}
								break;
							}
						}
					}
				}
			}
		}
	}
}
