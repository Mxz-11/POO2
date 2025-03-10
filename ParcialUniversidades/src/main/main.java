package main;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import Exceptions.AsignaturaNotFoundException;
import Exceptions.AsignaturaSinAlumnosException;
import Exceptions.DobleMatriculaException;
import Helper.HelperUniversidad;
import Helper.sga;
import Universidad.Alumno;
import Universidad.Asignatura;
import Universidad.Universidad;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> miHashSet = new HashSet<>();
		miHashSet.add(1);
		miHashSet.add(2);
		miHashSet.add(3);
		//miHashSet.add(4);
		//miHashSet.add(5);
		//miHashSet.add(7);
		//miHashSet.add(6);
		//miHashSet.add(8);
		//miHashSet.add(9);
		//miHashSet.add(10);
		HashSet<Alumno> alumnos = new HashSet<>();
		alumnos = HelperUniversidad.createAlumnos(miHashSet);

		HashSet<Asignatura> asigs = new HashSet<>();
		asigs = HelperUniversidad.createAsignaturas(50, 3, 8);

		List<Asignatura> auxAsigs = new ArrayList<>(asigs);
		
		Universidad usj = HelperUniversidad.createUniversidad(alumnos, auxAsigs, 4);

		//usj.printUniversidad();
		//System.out.println("");

		//sga.informeMatricula(Paths.get("src/data"), usj);
		//sga.informeProfesores(usj);
		if (sga.toFile(usj)) {
			System.out.println("Se ha enviado correctamente al fichero ./src/data/universidad.txt");
		}
		
		//Universidad usjCopia = sga.fromFile();
		//System.out.println(usjCopia.toString());
		
		/*
		try {
			sga.asignaturasUniversidad(Paths.get("./src/data"), usj);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		/*try {
			sga.validarDatos(usj);
			
		} catch (AsignaturaSinAlumnosException | AsignaturaNotFoundException | DobleMatriculaException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}*/
	}
}
