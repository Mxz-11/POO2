package clase9_4;

import java.util.HashSet;
import java.util.Set;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AmigoInvisible amego = new AmigoInvisible();
		Regalo r = new Regalo("Tortilla");
		Persona a = new Persona("Juan", r);
		Regalo ra = new Regalo("Aceitunas");
		Persona aa = new Persona("Pedro", ra);
		amego.personas.add(a);
		amego.personas.add(aa);
		amego.regalo.add(ra);
		amego.regalo.add(r);
		
		amego.intercambiar();
		System.out.println("Regalos " + amego.regalo);
		System.out.println("Personas " + amego.personas);
		
	}

}
