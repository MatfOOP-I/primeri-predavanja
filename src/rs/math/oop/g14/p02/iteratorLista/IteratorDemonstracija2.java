package rs.math.oop.g14.p02.iteratorLista;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class IteratorDemonstracija2 {

	public static void main(String[] args) {
		// уграђена повезана листа, већ смо видели како се може реализовати
		//Collection<String> kolekcija = new HashSet<>();
		Collection<String> kolekcija = new LinkedList<>();
		kolekcija.add("Мики");
		kolekcija.add("Марко");
		kolekcija.add("Марија");
		kolekcija.add("Ивана");
		kolekcija.add("Дарко");
		// било шта што је колекција има могућност да врати итератор
		Iterator<String> prolazak1 = kolekcija.iterator();
		Iterator<String> prolazak2 = kolekcija.iterator();
		while(prolazak1.hasNext() && prolazak2.hasNext()) {
			String element = prolazak1.next();
			System.out.print(element.toLowerCase() + " ");
			if(prolazak1.hasNext()) {
				element = prolazak1.next();
				System.out.print(element.toLowerCase() + " ");
			}
			String element2 = prolazak2.next();
			System.out.print(element2.toUpperCase() + " ");
		}
		while(prolazak2.hasNext()) {
			String element2 = prolazak2.next();
			System.out.print(element2.toUpperCase() + " ");
		}
	}

}
