package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.*;

class testing {

	@Test
	void test() {
		Mercancia m[] = new Mercancia[5];
		float f = (float) 4.3678;
		m[0] = new Ortoedro(1, 4, 5);
		m[1] = new Irregular(f);
		m[2] = new Piramide(4,5,2);
		m[3] = new Cilindrica(4, 2);
		m[4] = new Esfera(4);
		
		assertEquals(m[0].getVolumen() + m[1].getVolumen() +m[2].getVolumen() +m[3].getVolumen() +m[4].getVolumen(), MercanciaHelper.calculaVolumenTotal(m));
		assertEquals(false, m[0].getVolumen() + m[1].getVolumen() +m[2].getVolumen() != MercanciaHelper.calculaVolumenTotal(m));
		assertEquals(m[1], MercanciaHelper.buscaMinimoMaximo(m, false));
		assertEquals(true, m[1] != MercanciaHelper.buscaMinimoMaximo(m, true));
	}

}
