package rs.math.oop.g14.p02a;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class PrimerSet {

	public static void main(String[] args) {
		// уграђена повезана листа, већ смо видели како се може реализовати
		//Set<String> skup = new HashSet<>();
		Set<String> skup = new TreeSet<>();
		skup.add("Паја");
		skup.add("Мики");
		skup.add("Шиља");
		skup.add("Мини");
		skup.add("Шиља");
		System.out.println(skup);
		boolean bioUSkupu = skup.remove("Паја");
		System.out.printf("%b %s%n", bioUSkupu, skup);
		bioUSkupu = skup.remove("Раја");
		System.out.printf("%b %s%n", bioUSkupu, skup);
	}

}
