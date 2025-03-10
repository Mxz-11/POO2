package main;

public class Cilindrica extends Mercancia{
private
float r;
	public Cilindrica() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	public Cilindrica(float r, float al) {
		super();
		super.setAltura(al);
		this.r = r;
		super.setTipo("Cilindrica");
	}
	
	@Override
	public float calculaVolumen() {
		super.setVolumen((float) r * r * super.getAltura() * (float) Math.PI);
		return ((float) r * r * super.getAltura() * (float) Math.PI);
	}

}
