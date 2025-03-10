package Universidad;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Universidad {
	private Set<Asignatura> asignaturas = new HashSet<>();
	private Set<Matricula> matriculas = new HashSet<>();
	
	public void addAsignatura(Asignatura a) {
		asignaturas.add(a);
	}
	
	public void addMatricula(Alumno a, HashSet<Asignatura> asigs) {
		Matricula aux = new Matricula(a);
		for (Asignatura asignatura : asigs) {
			aux.addAsignatura(asignatura);
		}
	}
	
	public void addMatricula(Matricula m) {
		matriculas.add(m);
	}
	
	public void printUniversidad() {
		System.out.println("La universidad tiene las asignaturas:");
		for (Asignatura a : asignaturas) {
			System.out.print(a.toString());	
		}
		for (Matricula m : matriculas) {
			System.out.print(m.toString());	
		}
	}
	
	public List<Alumno> getAlumnos(){
		List<Alumno> res = new ArrayList<>();
		for(Matricula m: matriculas) {
			res.add(m.getAlumno());
		}
		return res;
	}
	
	public List<Matricula> getMatriculas(){
		List<Matricula> res = new ArrayList<>();
		for(Matricula m: matriculas) {
			res.add(m);
		}
		return res;
	}
	
	public List<Asignatura> getAsignaturas(){
		List<Asignatura> res = new ArrayList<>();
		for(Asignatura m: asignaturas) {
			res.add(m);
		}
		return res;
	}
	
	@Override
	public String toString() {
		String asig = "";
		for (Asignatura a: asignaturas) {
			asig = asig + a.toString();
		}
		
		String mat = "";
		for (Matricula m: matriculas) {
			mat = mat + m.toString() + "\n";
		}
		
		return "UNIVERSIDAD" + "\n" + "ASIGNATURAS:" + "\n" + asig + "\n" + mat;
	}
}
