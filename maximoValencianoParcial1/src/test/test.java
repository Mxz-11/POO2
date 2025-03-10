package test;
import Equipos.*;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import persona.*;

class test {

	@Test
	void test() {
		Jugador j = new Jugador();
		for (int i = 0; i < 30; i++) {
			j.tirarACanasta();	//Tira 30 veces a canasta, veces de sobra para ver que ha metido canasta y sus puntos historicos pp han subido.
		}
		assertEquals(true, j.getPp() > 0);
	}
	
	@Test
	void test1() {
		fail("Not yet implemented");
	}

}
