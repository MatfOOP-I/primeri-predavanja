package rs.math.oop.g14.p02a;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class PrimerListIterator {

	public static void main(String[] args) {
		// уграђена повезана листа, већ смо видели како се може реализовати
		//List<String> lista = new LinkedList<>();
		List<String> lista = new ArrayList<>();
		lista.add("Мики");
		lista.add("Паја");
		lista.add("Марија");
		lista.add("Ивана");
		lista.add("Дарко");
		System.out.println(lista);
		// било шта што је колекција има могућност да врати итератор
		ListIterator<String> prolazak1 = lista.listIterator(lista.size()/2);
		ListIterator<String> prolazak2 = lista.listIterator( lista.size()/2 );
		while(prolazak1.hasNext() || prolazak2.hasPrevious()) {
			if(prolazak1.hasNext()) {
				String element = prolazak1.next();
				System.out.print("p1:" + element.toLowerCase() + " ");
			}
			if(prolazak2.hasPrevious()) {
				String element = prolazak2.previous();
				System.out.print("p2:" + element.toUpperCase() + " ");
			}
		}
	}

}
