package example2;

import java.util.ArrayList;

import common.Persona;

public class MiListaDePersonasParaLaTabla {

	
	ArrayList<Persona> personas;
	
	
	public MiListaDePersonasParaLaTabla() {
		
		personas = new ArrayList<Persona>();
		
		for(int i=0;i<100;i++) {
			
			personas.add(new Persona("Nombre"+i,"Apellido"+i,i));
		}
		
	}
	
	public String[] getColumnNames() {
		
		return new String[] {"Nombre", "Apellido", "Edad"};
		
	}
	
	
	public String[][] getData() {
		
		String[][] data = new String[personas.size()][];
		
		for(int i=0;i<data.length;i++) {
			data[i] = personas.get(i).getAsString();
		}
		return data;
	}
	
}
