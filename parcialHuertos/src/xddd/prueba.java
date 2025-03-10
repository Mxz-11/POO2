package xddd;

import java.util.ArrayList;
import java.util.List;

import Huerto.Cultivo;
import Huerto.HuertoUrbano;

public class prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> cultivos = new ArrayList<>();
		cultivos.add("Tomate");
		cultivos.add("Cebolla");
		cultivos.add("Lechuga");
		cultivos.add("Zanahoria");
		cultivos.add("Albahaca");
		HuertoUrbano u = xddd.HelperHuertos.createHuerto(5000,22, cultivos);
		xddd.HelperHuertos.printHuerto(u);
	}

}
