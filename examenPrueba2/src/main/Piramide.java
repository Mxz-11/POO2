package main;

public class Piramide extends Mercancia{

	public Piramide() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	public Piramide(float l1, float l2, float al) {
		super(l1, l2, al);
		super.setTipo("Piramide");
	}
	
	@Override
	public float calculaVolumen() {
		super.setVolumen((float) super.getLado1() * super.getLado2() * super.getAltura() / 3);
		return (float) super.getLado1() * super.getLado2() * super.getAltura() / 3;
	}

}
