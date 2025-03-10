package huertos;

import java.util.ArrayList;

import exceptions.AguaInsudicienteException;

public class HuertoUrbano {
	public ArrayList<Parcela> parcelas;
	public int size;
	
	public HuertoUrbano() {
		this.parcelas = new ArrayList<Parcela>();
		this.size = 0;
	}
	
	public HuertoUrbano(int size) {
		this();
		this.size = size;
	}
	
	public void addParcela(Parcela parcela) {
		this.parcelas.add(parcela);
	}
	
	public void regar(int agua) throws AguaInsudicienteException {
		for(int i = 0; i<this.parcelas.size(); i++) {
			Parcela parcela = this.parcelas.get(i);
			for(int j = 0; j<parcela.cultivos.size(); j++) {
				Cultivo cultivo = parcela.cultivos.get(j);
				agua = cultivo.regar(agua);
				if(agua <= 0) {
					throw new AguaInsudicienteException();
				}
			}
		}
		
		System.out.println("He regado todos los cultivos y quedan " + agua + " litros de agua");
	}
	
	@Override
	public String toString() {
		ArrayList<String> parcelas = new ArrayList<String>();
		this.parcelas.forEach((parcela) -> {
			parcelas.add(parcela.toString());
		});
		
		return "HUERTO URBANO: " + this.size + "\n" + String.join("\n\n", parcelas);
	}
	
}
