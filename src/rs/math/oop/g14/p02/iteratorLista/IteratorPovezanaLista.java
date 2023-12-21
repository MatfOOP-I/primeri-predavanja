package rs.math.oop.g14.p02.iteratorLista;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class IteratorPovezanaLista {

	public static void main(String[] args) {
		// уграђена повезана листа, већ смо видели како се може реализовати
		Collection<String> kolekcija = new HashSet<>();
		kolekcija.add("---");
		kolekcija.add("Марко");
		kolekcija.add("Марија");
		kolekcija.add("Ивана");
		kolekcija.add("Дарко");
		// било шта што је колекција има могућност да врати итератор
		Iterator<String> prolazak = kolekcija.iterator();
		while(prolazak.hasNext()) {
			String element = prolazak.next();
			System.out.print(element+ " ");
		}
		System.out.println();
		// колекцијска наредба for је заправо синтаксна скраћеница за итератор
		// она се замењује горњим кодом, дакле, враћањем итератор 
		// и даљим позивањем метода hasNext и next
		for(String element: kolekcija)
			System.out.print(element + " ");
	}

}
