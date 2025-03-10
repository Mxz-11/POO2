package main;

public class Ortoedro extends Mercancia{

	public Ortoedro() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	public Ortoedro(float l1, float l2, float al) {
		super(l1, l2, al);
		super.setTipo("Ortoedro");
	}
	
	@Override
	public float calculaVolumen() {
		return super.calculaVolumen();
	}
}
