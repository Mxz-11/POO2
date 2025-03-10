package huertos;

public class Cliente {
	public int id;
	public static int count;
	public String name;
	public String tlf;
	
	public Cliente(String name, String tlf) {
		Cliente.count++;
		this.id = Cliente.count;
		this.name = name;
		this.tlf = tlf;
	}
	
	@Override
	public String toString() {
		
		return "CLIENTE: (" + this.id + "), " + this.name + ", " + this.tlf;
	}

}
