package rs.math.oop.g14.p04.nizovnaLista;

import java.util.ArrayList;
import java.util.ListIterator;

public class RadSaNizovnomListom {

	public static void main(String[] args) {
		ArrayList<Integer> nizovnaLista = new ArrayList<Integer>();
		nizovnaLista.add(33); // [33]
		nizovnaLista.add(43); // [33, 43]
		nizovnaLista.add(12); // [33, 43, 12]
		nizovnaLista.add(2, 871); // [33, 43, 871, 12]
		nizovnaLista.set(2, 874); // [33, 43, 874, 12]
		nizovnaLista.add(333); // [33, 43, 874, 12, 333]
		nizovnaLista.remove(1); // [33, 874, 12, 333]

		System.out.println("Елементи од почетка ка крају:");
		for (Integer e : nizovnaLista)
			System.out.println(e);

		System.out.println("Елементи од краја ка почетку:");
		// позиција итератора после последње позиције nizovnaLista.size()-1
		ListIterator<Integer> iterator;
		iterator = nizovnaLista.listIterator(nizovnaLista.size());
		while (iterator.hasPrevious()) // читање уназад
			System.out.println(iterator.previous());

		System.out.println("Елементи од почетка ка крају помоћу индекса:");
		for (int i = 0; i < nizovnaLista.size(); i++)
			System.out.println(nizovnaLista.get(i)); // ефикасно O(1)
	}
}
