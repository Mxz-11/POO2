package helpers;

import java.util.HashSet;
import java.util.Random;

import huertos.Cliente;
import huertos.Cultivo;
import huertos.HuertoUrbano;
import huertos.Parcela;

public class HelperHuerto {

	public static HuertoUrbano GenerateHuerto(int size, int numParcelas, HashSet<String> nombrePlantas) {
		HuertoUrbano huerto = new HuertoUrbano(size);
		Random rand = new Random();
		
		for(int i = 0; i<numParcelas; i++) {
			Cliente cliente = new Cliente("Some random name", "999 999 999");
			Parcela parcela = new Parcela(rand.nextInt(size / numParcelas), cliente );
			
			nombrePlantas.forEach((nombre) -> {
				parcela.addCultivo(new Cultivo(nombre, "normal", rand.nextInt(size / numParcelas)));
			});
			
			huerto.addParcela(parcela);
		}
		
		return huerto;
	}
	
}
