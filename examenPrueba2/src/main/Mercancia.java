package main;

public class Mercancia {
private
	float lado1;
	float lado2;
	float altura;
	int id;
	static int totales;
	float volumen;
	String tipo;

	public Mercancia() {
		// TODO Auto-generated constructor stub
		totales++;
		id = totales;
	}
	
	public Mercancia(float l1, float l2, float a) {
		lado1 = l1;
		lado2 = l2;
		altura = a;
		totales++;
		id = totales;
	}
	
	public float getVolumen() {
		return volumen;
	}

	public void setVolumen(float volumen) {
		this.volumen = volumen;
	}
	
	public float getLado1() {
		return lado1;
	}

	public void setLado1(float lado1) {
		this.lado1 = lado1;
	}

	public float getLado2() {
		return lado2;
	}

	public void setLado2(float lado2) {
		this.lado2 = lado2;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getId() {
		return id;
	}
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public float calculaVolumen() {
		volumen = (float) lado1 * lado2 * altura;
		return (float) lado1 * lado2 * altura;
	}
}
