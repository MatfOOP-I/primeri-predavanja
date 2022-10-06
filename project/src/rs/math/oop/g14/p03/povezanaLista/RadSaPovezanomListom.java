package rs.math.oop.g14.p03.povezanaLista;

import java.util.LinkedList;
import java.util.ListIterator;

public class RadSaPovezanomListom {

	public static void main(String[] args) {
		LinkedList<Integer> povezanaLista = new LinkedList<Integer>();
		povezanaLista.addFirst(33); // [33]
		povezanaLista.addLast(12); // [33, 12]
		povezanaLista.add(333); // [33, 12, 333] - подразумевано додаје на крај
		povezanaLista.add(1, 43); // [33, 43, 12, 33] - убацује на позицију 1
		ListIterator<Integer> iterator = povezanaLista.listIterator();
		iterator.next(); // итератор између 33 и 43
		iterator.next(); // итератор између 43 и 12
		iterator.add(874); // [33, 43, 874, 12, 333] - итератор између 874 и 12
		iterator.previous(); // итератор између 43 и 874
		iterator.previous(); // итератор између 33 и 43
		iterator.remove(); // уклања се следећи тј. 43
		
		System.out.println("Елементи од почетка ка крају:");
		for(Integer e : povezanaLista)
			System.out.println(e);
		
		System.out.println("Елементи од краја ка почетку:");
		// позиција итератора после последње позиције povezanaLista.size()-1
		iterator = povezanaLista.listIterator(povezanaLista.size());
		while(iterator.hasPrevious()) // читање уназад
			System.out.println(iterator.previous());
		
		System.out.println("Елементи од почетка ка крају помоћу индекса:");
		for(int i=0; i<povezanaLista.size(); i++)
			System.out.println(povezanaLista.get(i)); // неефикасно O(n)
	}
}
