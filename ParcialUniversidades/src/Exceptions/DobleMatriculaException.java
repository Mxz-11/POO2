package Exceptions;

import Universidad.Asignatura;
import Universidad.Matricula;

public class DobleMatriculaException extends Exception{
	public DobleMatriculaException(Matricula m) {
		super ("Hay dos Asignaturas iguales en la matricula de: " + m.getAlumno().getId());
	}
}
