package exceptions;

public class AguaInsudicienteException extends Exception {
	public AguaInsudicienteException() {
		super("No hay suficiente agua para regar el huerto completo");
	}
}
