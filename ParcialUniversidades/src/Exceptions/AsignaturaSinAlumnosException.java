package Exceptions;

import Universidad.Asignatura;

public class AsignaturaSinAlumnosException extends Exception{
	public AsignaturaSinAlumnosException(Asignatura a) {
		super ("No hay ningun alumno en la asignatura: " + a.getNombre());
	}
}
