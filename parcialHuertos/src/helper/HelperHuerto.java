package helper;

import java.util.HashSet;
import java.util.Random;

import Huerto.Cliente;
import Huerto.Cultivo;
import Huerto.HuertoUrbano;
import Huerto.Parcela;

public class HelperHuerto {
	public static HuertoUrbano createHuerto(int t, int n, HashSet<String> nombreCultivos) {
		HuertoUrbano hu = new HuertoUrbano(t);
		Random rand = new Random();
		
		for (int i = 0; i < n; i++) {
			Cliente cliente = new Cliente("999 999 999", "n" + i, "a" + i);
			Parcela parcela = new Parcela(rand.nextInt(t / n), cliente );
			
			nombreCultivos.forEach((nombre) -> {
				parcela.addCultivo(new Cultivo(nombre, "normal", rand.nextInt(t / n)));
			});
			
			hu.addParcela(parcela);
		}
		
		return hu;
		
	}
}
