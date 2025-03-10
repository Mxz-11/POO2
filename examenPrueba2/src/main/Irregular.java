package main;

public class Irregular extends Mercancia{

	public Irregular() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	public Irregular(float v) {
		super();
		super.setVolumen(v);
		super.setTipo("Irregular");
	}
	
	@Override
	public float calculaVolumen() {
		return super.getVolumen();
	}
}
