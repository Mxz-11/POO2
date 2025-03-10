package Exceptions;

import Universidad.Asignatura;

public class AsignaturaNotFoundException extends Exception{
	public AsignaturaNotFoundException() {
		super ("No se ha encontrado la asignatura de la matricula");
	}
}
