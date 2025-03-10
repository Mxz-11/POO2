package Helper;

import java.util.HashSet;
import java.util.List;
import java.util.Random;

import Universidad.Alumno;
import Universidad.Asignatura;
import Universidad.Matricula;
import Universidad.Universidad;

public class HelperUniversidad {
	
	public static HashSet<Alumno> createAlumnos(HashSet<Integer> alumnos) {
		Random rand = new Random();
		HashSet<Alumno> al = new HashSet<>();
		
		for(Integer n : alumnos) {
			al.add(new Alumno(rand.toString(), n));
		}
		return al;
	}
	
	public static HashSet<Asignatura> createAsignaturas(int creditosTotales, int cMin, int cMax){
		Random rand = new Random();
		HashSet<Asignatura> as = new HashSet<>();
		
		int i = 1;
		
		while (creditosTotales > 0) {
			int credAsign = rand.nextInt(cMax - cMin + 1) + cMin;
			if (creditosTotales / cMin == 1) {
				credAsign = creditosTotales;
			}
			as.add(new Asignatura("Nombre" + i, credAsign));
			i++;
			creditosTotales = creditosTotales - credAsign;
		}
			
		return as;
	}
	
	public static Universidad createUniversidad(HashSet<Alumno> al, List<Asignatura> as, int num) {
		HashSet<Matricula> mat = new HashSet<>();
		Random rand = new Random();
		for(Alumno a: al) {
			Matricula m = new Matricula(a);
			for (int i = 0; i < num; i++) {
				int asignatura = rand.nextInt(as.size());
				m.addAsignatura(as.get(asignatura));
			}
			mat.add(m);
		}
		
		Universidad u = new Universidad();
		for (int i = 0; i < as.size(); i++) {
			u.addAsignatura(as.get(i));
		}
		for(Matricula m: mat) {
			u.addMatricula(m);
		}
		
		return u;
	}
}
