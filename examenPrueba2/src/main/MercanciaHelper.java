package main;
import java.util.Random;

public class MercanciaHelper {

	public MercanciaHelper() {
		// TODO Auto-generated constructor stub
	}
	
	public Mercancia createMercanciaRandom() {
		Random rand = new Random();
        int n = rand.nextInt(5) + 1;
        Mercancia aux;
        if(n == 1) {
        	float vol = (float) (rand.nextFloat() * (10.0 - 5.0) + 5.0);
        	aux = new Irregular(vol);
        }else if(n == 2) {
        	float l1 = (float) (rand.nextFloat() * (10.0 - 5.0) + 5.0);
        	float l2 = (float) (rand.nextFloat() * (10.0 - 5.0) + 5.0);
        	float al = (float) (rand.nextFloat() * (10.0 - 5.0) + 5.0);
        	aux = new Ortoedro(l1, l2, al);
        }else if(n == 3){
        	float l1 = (float) (rand.nextFloat() * (10.0 - 5.0) + 5.0);
        	float l2 = (float) (rand.nextFloat() * (10.0 - 5.0) + 5.0);
        	float al = (float) (rand.nextFloat() * (10.0 - 5.0) + 5.0);
        	aux = new Piramide(l1, l2, al);
        }else if(n == 4) {
        	float r = (float) (rand.nextFloat() * (10.0 - 5.0) + 5.0);
        	float al = (float) (rand.nextFloat() * (10.0 - 5.0) + 5.0);
        	aux = new Cilindrica(r, al);
        }else {
        	float r = (float) (rand.nextFloat() * (10.0 - 5.0) + 5.0);
        	aux = new Esfera(r);
        }
        return aux;
	}
	
	public Mercancia[] createMercanciaRandom(int cant, Mercancia m[]) {
		if (m.length < cant) {
			for (int i = 0; i < m.length; i++) {
				m[i] = createMercanciaRandom();
			}
		}else {
			for (int i = 0; i < cant; i++) {
				m[i] = createMercanciaRandom();
			}
		}
		return m;
	}
	
	public static float calculaVolumenTotal(Mercancia[] mercancias) {
		float res = 0;
		for (int i = 0; i < mercancias.length; i++) {
			res = res + mercancias[i].getVolumen();
		}
		return res;
	}
	
	public static Mercancia buscaMinimoMaximo(Mercancia[] mercancias, boolean minimo) {
		Mercancia devolver = null;
		if (minimo == true) {
			float vol = mercancias[0].getVolumen();
			for (int i = 1; i < mercancias.length; i++) {
				if (vol > mercancias[i].getVolumen()) {
					devolver = mercancias[i];
					vol = devolver.getVolumen();
				}
			}
		}else {
			float vol = mercancias[0].getVolumen();
			for (int i = 1; i < mercancias.length; i++) {
				if (vol < mercancias[i].getVolumen()) {
					devolver = mercancias[i];
					vol = mercancias[i].getVolumen();
				}
			}
		}
		return devolver;
	}
	
	public static void ordenaAscendenteDescendente(Mercancia[] mercancias, boolean ascendente) {
		/*if (ascendente == true) {
			for (int i = 0; i < mercancias.length; i++) {
	            for (int j = 0; j < mercancias.length - i; j++) {
	                if (mercancias[j].getVolumen() > mercancias[j + 1].getVolumen()) {
	                    Mercancia temp = mercancias[j];
	                    mercancias[j] = mercancias[j + 1];
	                    mercancias[j + 1] = temp;
	                }
	            }
	        }
		}else {
			for (int i = 0; i < mercancias.length - 1; i++) {
	            for (int j = 0; j < mercancias.length - i - 1; j++) {
	                if (mercancias[j].getVolumen() < mercancias[j + 1].getVolumen()) {
	                    // Intercambiar vector[j] y vector[j+1]
	                	Mercancia temp = mercancias[j];
	                    mercancias[j] = mercancias[j + 1];
	                    mercancias[j + 1] = temp;
	                }
	            }
	        }
		}		
	}*/
		if (ascendente) {
	        for (int i = 0; i < mercancias.length - 1; i++) {
	            for (int j = 0; j < mercancias.length - i - 1; j++) {
	                if (mercancias[j].getVolumen() > mercancias[j + 1].getVolumen()) {
	                    Mercancia temp = mercancias[j];
	                    mercancias[j] = mercancias[j + 1];
	                    mercancias[j + 1] = temp;
	                }
	            }
	        }
	    } else {
	        for (int i = 0; i < mercancias.length - 1; i++) {
	            for (int j = 0; j < mercancias.length - i - 1; j++) {
	                if (mercancias[j].getVolumen() < mercancias[j + 1].getVolumen()) {
	                    Mercancia temp = mercancias[j];
	                    mercancias[j] = mercancias[j + 1];
	                    mercancias[j + 1] = temp;
	                }
	            }
	        }
	    }        
	}
	
	public void deleteMercancia(Mercancia[] m, Mercancia mercancia) {
		int iter = 0;
		for (int i = 0; i < m.length; i++) {
			if (m[i].getTipo() == mercancia.getTipo() && m[i].getId() == mercancia.getId()) {
				iter = i;
			}
		}
		for (int i = iter; i < m.length; i++) {
			if (i != m.length-1) {
				m[i] = m[i+1];
			}
			else {
				m[i] = null;
				System.gc();
			}
		}
	}
	
	public void deleteAboveBelow(Mercancia[] m, float level, boolean above) {
		if (above == true) {
			for (int i = 0; i < m.length; i++) {
				if (m[i].getVolumen() < level) {
					for (int j = i; j < m.length; j++) {
						if (j != m.length-1) {
							m[i] = m[i+1];
						}
						else {
							m[i] = null;
							System.gc();
						}
					}
				}
			}
		}else {
			for (int i = 0; i < m.length; i++) {
				if (m[i].getVolumen() > level) {
					for (int j = i; j < m.length; j++) {
						if (j != m.length-1) {
							m[i] = m[i+1];
						}
						else {
							m[i] = null;
							System.gc();
						}
					}
				}
			}
		}
	}
	
	
}
