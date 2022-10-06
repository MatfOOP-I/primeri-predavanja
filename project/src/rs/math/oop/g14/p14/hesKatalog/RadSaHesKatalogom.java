package rs.math.oop.g14.p14.hesKatalog;

import java.util.HashMap;
import java.util.Map;

public class RadSaHesKatalogom {

	public static void main(String[] args) {
		Osoba[] osobe = new Osoba[] {
			// ЈМБГ очигледно нису валидним, већ измишљени
			new Osoba("1009987567890", "Марко", "Петровић", 1987),
			new Osoba("2001967567890", "Ана", "Ковачевић", 1967),
			new Osoba("1009997567890", "Марија", "Мирковић", 1997),
			new Osoba("0302000567890", "Јована", "Драшковић", 2000),
			new Osoba("1504981567890", "Петар", "Марковић", 1981),
			// исти ЈМБГ - замениће претходни унос (Петар Марковић)
			new Osoba("1504981567890", "Марко", "Марковић", 1981), 
		};
		Map<String, Osoba> osobeKatalog = new HashMap<String, Osoba>();
		// убацујемо у каталог
		for(Osoba o : osobe)
			osobeKatalog.put(o.getJMBG(), o);
		// редослед при испису није исти као при уносу
		for(String jmbg: osobeKatalog.keySet())
			System.out.println(String.format("%s\t->\t%s", 
					jmbg, osobeKatalog.get(jmbg)));
	}
}
