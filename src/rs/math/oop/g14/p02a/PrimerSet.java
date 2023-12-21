package rs.math.oop.g14.p02a;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class PrimerSet {

	public static void main(String[] args) {
		// уграђена повезана листа, већ смо видели како се може реализовати
		Set<String> skup = new HashSet<>();
		skup.add("Паја");
		skup.add("Мики");
		skup.add("Шиља");
		skup.add("Мини");
		skup.add("Шиља");
		System.out.println(skup);
		skup.remove("Паја");
		System.out.println(skup);
		skup.remove("Раја");
		System.out.println(skup);
	}

}
