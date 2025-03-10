package xddd;

import java.util.List;
import java.util.Random;

import Huerto.Cliente;
import Huerto.Cultivo;
import Huerto.HuertoUrbano;
import Huerto.Parcela;

public class HelperHuertos {
	public static HuertoUrbano createHuerto(int tam, int numParcelas, List<String> nombreCultivos) {		
		HuertoUrbano u = new HuertoUrbano(tam);
		int tamanioParcela = tam/ numParcelas;
		Random rand = new Random();
		
		for (int i = 0; i<numParcelas; i++) {
			Cliente c = new Cliente("123 321 123", "Default", "default");
			Parcela p = new Parcela(tamanioParcela, c);
			for (int j = 0; j < (rand.nextInt(nombreCultivos.size())); j++) {
				p.addCultivo(new Cultivo(nombreCultivos.get(j), "poca", rand.nextInt(200)));
			}
			u.addParcela(p);
		}
		return u;
	}
	
	public static void printHuerto(HuertoUrbano u) {
		System.out.println(u.toString());
	}
}	
