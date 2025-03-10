package Exceptions;

public class SongsNotFound extends Exception{
	public SongsNotFound(String c) {
		super("No se ha encontrado el artista: " + c);
	}
}
