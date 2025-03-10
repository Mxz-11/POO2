package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Ejercicios.tema1;

class mytest {

	@Test
	void test() {
		assertEquals(true, tema1.mcd(18,9) == 9);
	}
		

}
