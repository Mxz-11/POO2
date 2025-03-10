package persona;

import java.util.Random;

enum Posicion {
    BASE,
    ESCOLTA,
    ALERO,
    ALAPIVOT,
    PIVOT
}

public class Jugador extends Persona implements Estrella, SuperHeroe{
	private
	String nacion;
	int edad;
	int pp; //puntos historicos
	Posicion pos;
	static int p1P = 30; //porcentaje de 1
	static int p2P = 30; //porcentaje de 2
	static int p3P = 20; //porcentaje de 3
	static int pSO = 50; //porcentaje de segunda oportunidad
	
	public Jugador() {
		// TODO Auto-generated constructor stub
		super.setNombre("default");
		super.setApellido("default");
		super.setValorMercado(100);
		nacion = "spain";
		edad = 18;
		pp = 0;
		pos = Posicion.PIVOT;
	}
	
	public Jugador(int vM) {
		this();
		super.setValorMercado(vM);
		pp = 0;
	}
	
	public Jugador(int vM, String nacion) {
		this();
		this.nacion = nacion;
		super.setValorMercado(vM);
		pp = 0;
	}
	
	public Jugador(String n, String a, int vm, int edad) {
		super(n, a, vm);
		this.edad = edad;
		pp = 0;
	}
	
	public String getNacion() {
		return nacion;
	}

	public void setNacion(String nacion) {
		this.nacion = nacion;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getPp() {
		return pp;
	}

	public void setPp(int pp) {
		this.pp = pp;
	}

	public Posicion getPos() {
		return pos;
	}

	public void setPos(Posicion pos) {
		this.pos = pos;
	}
	
	/**
	 * 
	 * @return
	 */
	public int tirarACanasta() {
		Random rand = new Random();
        int n = rand.nextInt(100) + 1;
        int punt = 0;
        if (n <= p1P && n >= 0) {
        	punt = 1;
        }else if(n <= p1P + p2P && n >= p1P) {
        	punt = 2;
        }else if(n <= p1P + p2P + p3P && n >= p1P + p2P) {
        	punt = 3;
        }else {
        	punt = 0;
        }
        pp = pp + punt;
        return punt;
	}
	
	@Override
	public void hablarPrensa() {
		System.out.println("Hola soy " + getNombre() + " y en el partido de hoy he llegado a los " + pp + " en mi carrera");
	}
	
	@Override
	public boolean volverATirar(int tirosRealizados) {
		if (tirosRealizados < 2) {
			Random rand = new Random();
			int n = rand.nextInt(100) + 1;
	        if(n <= pSO) {
	        	return true;
	        }else {
	        	return false;
	        }
		}
		else {
			return false;
		}
	}
}
