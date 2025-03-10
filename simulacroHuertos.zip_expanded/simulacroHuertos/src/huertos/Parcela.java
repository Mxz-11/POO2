package huertos;

import java.util.ArrayList;

public class Parcela {
	public int size;
	public Cliente owner;
	public ArrayList<Cultivo> cultivos;
	
	public Parcela(int size, Cliente owner) {
		this.size = size;
		this.owner = owner;
		this.cultivos = new ArrayList<Cultivo>();
	}
	
	public void addCultivo(Cultivo cultivo) {
		this.cultivos.add(cultivo);
	}
	
	@Override
	public String toString() {
		ArrayList<String> result = new ArrayList<String>();
		
		cultivos.forEach((cultivo) -> {
			result.add(cultivo.toString());	
		});
		
		return "PARCELA:" + this.size + "\n" + this.owner.toString() + "\n" + String.join("\n", result);
	}
	
	
}
