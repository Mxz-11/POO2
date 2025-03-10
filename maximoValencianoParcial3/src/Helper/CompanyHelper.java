package Helper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Clases.Company;
import Clases.Event;
import Clases.HistoricalTicketing;
import Clases.Person;

public class CompanyHelper {
	public static Company createCompanyTercerParcial() {
		Company c = new Company("Prueba", 2023, 1997);
		List<Event> ev = new ArrayList<>();
		List<Person> pe = new ArrayList<>();
		List<HistoricalTicketing> l = new ArrayList<>();


		for (int i = 0; i < 3; i++) {
			Person p = new Person("Juan", 123456789);
			Event e = new Event("3/7/2020", "Alto", "Coches");
			ev.add(e);
			pe.add(p);
		}

		for(Person i: pe) {
			HistoricalTicketing h = new HistoricalTicketing();
			h.setEv(ev);
			l.add(i.getId(), h);
		}		
		c.setPer(pe);
		c.setHt(l);
		
		return c;
	}
}
