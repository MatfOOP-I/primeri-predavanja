package rs.math.oop.g14.p02a;

import java.util.List;
import java.util.LinkedList;
import java.util.ListIterator;

public class PrimerListIterator {

	public static void main(String[] args) {
		// уграђена повезана листа, већ смо видели како се може реализовати
		List<String> lista = new LinkedList<>();
		lista.add("0");
		lista.add("1");
		lista.add("2");
		lista.add("3");
		lista.add("4");
		System.out.println(lista);
		// било шта што је колекција има могућност да врати итератор
		ListIterator<String> prolazak1 = lista.listIterator(lista.size()/2);
		ListIterator<String> prolazak2 = lista.listIterator( lista.size()/2 );
		while(prolazak1.hasNext() || prolazak2.hasPrevious()) {
			if(prolazak1.hasNext()) {
				String element = prolazak1.next();
				System.out.print("1:" + element + " ");
			}
			if(prolazak2.hasPrevious()) {
				String element = prolazak2.previous();
				System.out.print("2:" + element + " ");
			}
		}
		System.out.println();
		while(prolazak2.hasNext()){
			prolazak2.next();
			if(prolazak2.hasNext()) {
				prolazak2.next();
				prolazak2.remove();
			}
		}
		System.out.println(lista);
		while(prolazak1.hasPrevious()) {
			String s = prolazak1.previous();
			System.out.print( s + " ");
		}


	}

}
