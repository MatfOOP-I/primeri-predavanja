package rs.math.oop.g14.p14.hesRecnik;

import java.util.HashMap;
import java.util.Map;

public class RadSaHesRecnikom {

	public static void main(String[] args) {
		Osoba[] osobe = new Osoba[] {
			// ЈМБГ очигледно ниcу валидни, већ измишљени
			new Osoba("1009987567890", "Марко", "Петровић", 1987),
			new Osoba("2001967567890", "Ана", "Ковачевић", 1967),
			new Osoba("1009997567890", "Марија", "Мирковић", 1997),
			new Osoba("0302000567890", "Јована", "Драшковић", 2000),
			new Osoba("1504981567890", "Петар", "Марковић", 1981),
			// исти ЈМБГ - замениће претходни унос (Петар Марковић)
			new Osoba("1504981567890", "Марко", "Марковић", 1981), 
		};
		Map<String, Osoba> osobeRecnik = new HashMap<String, Osoba>();
		// убацујемо у речник
		for(Osoba o : osobe)
			osobeRecnik.put(o.uzmiJMBG(), o);
		// редослед при испису није исти као при уносу
		for(String jmbg: osobeRecnik.keySet())
			System.out.println(String.format("%s\t->\t%s", 
					jmbg, osobeRecnik.get(jmbg)));
	}
}
