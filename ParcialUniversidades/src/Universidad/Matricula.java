package Universidad;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Matricula {
	private Alumno a;
	private Set<Asignatura> asig = new HashSet<>();
	
	public Matricula(Alumno al) {
		a = al;
	}
	
	public Alumno getAlumno() {
		return a;
	}
	
	public void addAsignatura(Asignatura nueva) {
		if(asig.add(nueva)) {
			
		}else {
			System.out.println("La asignatura ya estaba en la matricula");
		}
	}
	
	public int numAsignaturas() {
		return asig.size();
	}
	
	public List<Asignatura> getAsignaturas() {
		List<Asignatura> res = new ArrayList<>();
		for(Asignatura m: asig) {
			res.add(m);
		}
		return res;
	}
	
	@Override
	public String toString() {
		String asignaturas = "";
		
		for (Asignatura asignatura : asig) {
			asignaturas = asignaturas + asignatura.toString();
 		}
		
		return "Matricula:" + "\n" + a.toString() + "\n" + "Asignaturas:" + "\n" + asignaturas;
	}
}
