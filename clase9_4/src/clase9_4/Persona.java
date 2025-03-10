package clase9_4;

public class Persona {
	private static int id = 0;
	private int idea;
	private String nombre;
	private Regalo regalo;
	
	public Persona(String n, Regalo r) {
		id++;
		idea= id;
		nombre = n;
		regalo = r;
	}
	
	public Persona() {
		id++;
		idea = id;
	}
	
	public Regalo getRegalo() {
		return regalo;
	}
	public void setRegalo(Regalo r) {
		regalo = r;
	}
}
