package Huerto;

import java.util.ArrayList;
import java.util.List;

public class Parcela {
	private int tam;
	private Cliente c;
	protected List<Cultivo> cultivos = new ArrayList<>();
	
	public Parcela(int t, Cliente o) {
		tam = t;
		c = o;
	}
	
	public void addCultivo(Cultivo a) {
		cultivos.add(a);
	}
	
	@Override
	public String toString() {
		List<String> result = new ArrayList<String>();
		
		cultivos.forEach((cultivo) -> {
			result.add(cultivo.toString());	
		});
		
		return "PARCELA:" + this.tam + "\n" + this.c.toString() + "\n" + String.join("\n", result);
	}
}
