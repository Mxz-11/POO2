package clase9_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AmigoInvisible {
	List<Persona> personas = new ArrayList<Persona>();
	List<Regalo> regalo = new ArrayList<Regalo>();
	
	public void intercambiar() {
		Random rand = new Random();
		int n = rand.nextInt(personas.size());
        int aux = rand.nextInt(personas.size());
        while (n == aux) {
        	aux = rand.nextInt(personas.size());
        }
		Persona paux2 = personas.get(n);
		Persona paux = personas.get(aux);
		Regalo raux = personas.get(aux).getRegalo();
		paux.setRegalo(personas.get(n).getRegalo());
		paux2.setRegalo(raux);
		personas.set(aux, paux);
		personas.set(n, paux2);

	}
	
	public void irseDeLaFiesta(int i) {
		Regalo paux = personas.get(i).getRegalo();
		regalo.remove(paux);
	}
	
	public Persona findPersona(int id) {
		return personas.get(id);
	}
	
	public Persona findRegalo(Regalo r) {
		Persona p = new Persona();
		for (int i = 0; i < personas.size(); i++) {
			if (r == personas.get(i).getRegalo()) {
				p = personas.get(i);
			}
		}
		return p;
	}
}
