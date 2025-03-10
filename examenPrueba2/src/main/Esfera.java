package main;

public class Esfera extends Mercancia{
private 
float radio;
	public Esfera() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	public Esfera(float r) {
		super();
		this.radio = r;
		super.setTipo("Esfera");
	}
	
	@Override
	public float calculaVolumen() {
		super.setVolumen((float) 4 * (float) Math.PI * radio * radio * radio / 3);
		return (float) 4 * (float) Math.PI * radio * radio * radio / 3;
	}

}
