package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import DNI.dni;
import DNI.main;
import DNI.funciones;

class test {

	@Test
	void test() {
		
		dni d[] = new dni[5];
		d[0] = new dni(123);
		d[1] = new dni(123);
		d[2] = new dni(56);
		d[3] = new dni(72);
		d[4] = new dni(567);
		
		dni r[] = new dni[5];
		r[0] = new dni(123);
		r[1] = new dni(52343);
		r[2] = new dni(56);
		r[3] = new dni(72);
		r[4] = new dni(567);
		
		funciones f = new funciones();
		boolean e = f.sonDistintos(d);
		
		assertEquals(true, e);
	}

}
