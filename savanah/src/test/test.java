package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


import serVivos.Carnivoro;
import serVivos.Herbivoro;
import plantas.Acacia;
import plantas.Pino;
import animales.Buitre;
import animales.Cocodrilo;
import animales.Leon;
import animales.Zebra;

class test {

	@Test
	void testing() {
		Leon l = new Leon();
		Buitre b = new Buitre();
		Pino p = new Pino();
		Cocodrilo c = new Cocodrilo();
		Zebra z = new Zebra();
		Acacia a = new Acacia();
		
		
		//Leon se mueve, tiene tipo L
		assertEquals(true, l.getMueve() == true && l.getTipo() == 'L' && Leon.class.isAssignableFrom(l.getClass()));
		
		//Buitre se mueve, tiene tipo B
		assertEquals(true, b.getMueve() == true && b.getTipo() == 'B' && Buitre.class.isAssignableFrom(b.getClass()));
		
		//Pino no se mueve, tiene tipo P
		assertEquals(true, p.getMueve() == false && p.getTipo() == 'P' && Pino.class.isAssignableFrom(p.getClass()));
		
		//Cocodrilo se mueve, tiene tipo C
		assertEquals(true, c.getMueve() == true && c.getTipo() == 'C' && Cocodrilo.class.isAssignableFrom(c.getClass()));
		
		
		//Zebra se mueve y tiene tipo Z
		assertEquals(true, z.getMueve() == true && z.getTipo() == 'Z' && Zebra.class.isAssignableFrom(z.getClass()));

		
		//Zebra se mueve y tiene tipo Z
		assertEquals(true, a.getMueve() == false && a.getTipo() == 'A' && Acacia.class.isAssignableFrom(a.getClass()));
		
		
		assertEquals(true, Cocodrilo.class.getSuperclass() == Carnivoro.class);
		assertEquals(true, Zebra.class.getSuperclass() == Herbivoro.class);
		
	}

}
