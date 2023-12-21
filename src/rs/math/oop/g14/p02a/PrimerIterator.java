package rs.math.oop.g14.p02a;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class PrimerIterator {

	public static void main(String[] args) {
		// уграђена повезана листа, већ смо видели како се може реализовати
		Collection<String> kolekcija = new LinkedList<>();
		kolekcija.add("0");
		kolekcija.add("1");
		kolekcija.add("2");
		kolekcija.add("3");
		kolekcija.add("4");
		// било шта што је колекција има могућност да врати итератор
		Iterator<String> prolazak1 = kolekcija.iterator();
		Iterator<String> prolazak2 = kolekcija.iterator();
		while(prolazak1.hasNext() || prolazak2.hasNext()) {
			if(prolazak1.hasNext()) {
				String element = prolazak1.next();
				System.out.println("1:" + element);
			}
			if(prolazak1.hasNext()) {
				String element = prolazak1.next();
				System.out.println("1:" + element);
			}
			if(prolazak2.hasNext()) {
				String element = prolazak2.next();
				System.out.println("2:" + element);
			}
		}
	}

}
