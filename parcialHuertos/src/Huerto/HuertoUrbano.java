package Huerto;

import java.util.ArrayList;
import java.util.List;

import exceptions.AguaInsuficiente;


public class HuertoUrbano {
	private int tamanio;
	private List<Parcela> par = new ArrayList<>();
	
	public HuertoUrbano(int tam) {
		tamanio = tam;
	}
	
	public void addParcela(Parcela p) {
		par.add(p);
	}
	
	public void regar(int num) throws AguaInsuficiente {
		for (int i = 0; i < par.size(); i++){
			Parcela parcela = this.par.get(i);
			for(int j = 0; j < parcela.cultivos.size(); j++) {
				Cultivo cultivo = parcela.cultivos.get(j);
				num = cultivo.regar(num);
				if(num <= 0) {
					throw new AguaInsuficiente();
				}
			}
		}
	}

	@Override
	public String toString() {
		List<String> resul = new ArrayList<>();
		par.forEach((parcela) -> {
			resul.add(parcela.toString());
		});
		
		/*
		String meter = null;
		for(Parcela p: par) {
			meter = meter + p.toString() + "\n";
		}*/
		
		return "HUERTO URBANO: " + tamanio + "\n" + String.join("\n\n", resul);
	}
}
