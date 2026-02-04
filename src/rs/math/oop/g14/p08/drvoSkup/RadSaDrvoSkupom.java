package rs.math.oop.g14.p08.drvoSkup;

import java.util.Comparator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class RadSaDrvoSkupom {

	public static void main(String[] args) {
		SortedSet<Double> dDrvoSkup = new TreeSet<>();
		dDrvoSkup.add(3.14);
		dDrvoSkup.add(1.41);
		dDrvoSkup.add(1.0);
		dDrvoSkup.add(3.1400); // неће бити додат
		System.out.println("Скуп реалних: " + dDrvoSkup);

		SortedSet<String> sDrvoSkup = new TreeSet<>();
		sDrvoSkup.add("Скуп");
		sDrvoSkup.add("ниски");
		sDrvoSkup.add("Eлемент");
		sDrvoSkup.add("Eлемент");
		System.out.println("Скуп ниски: " + sDrvoSkup);

		SortedSet<String> sDrvoSkup2 = new TreeSet<>(
				new Comparator<String>() {
					@Override
					public int compare(String o1, String o2) {
						return o1.length() - o2.length();
					}
				}
		);
		// SortedSet<String> sDrvoSkup2 = new TreeSet<>((s1,s2) -> s2.length() - s1.length());
		sDrvoSkup2.add("Скуп");
		sDrvoSkup2.add("ниски");
		sDrvoSkup2.add("Eлемент");
		sDrvoSkup2.add("Eлемент");
		System.out.println("Скуп ниски: " + sDrvoSkup2);

		// варијанта са експлицитним уређењем
		// кроз анонимну класу која имплементира Comparator
		SortedSet<UredjeniPar<String, Integer>> uDrvoSkup = new TreeSet<UredjeniPar<String, Integer>>(
				new Comparator<UredjeniPar<String, Integer>>() {
					@Override
					public int compare(UredjeniPar<String, Integer> o1, UredjeniPar<String, Integer> o2) {
						// примарно по другом растуће
						if (o2.uzmiVrednost2().compareTo(o1.uzmiVrednost2()) != 0)
							return o2.uzmiVrednost2().compareTo(o1.uzmiVrednost2());
						else // секундарно по првом растуће
							return o1.uzmiVrednost1().compareTo(o2.uzmiVrednost1());
					}
				});
		uDrvoSkup.add(new UredjeniPar<String, Integer>("Новак", 26));
		uDrvoSkup.add(new UredjeniPar<String, Integer>("Рафаел", 23));
		uDrvoSkup.add(new UredjeniPar<String, Integer>("Роџер", 20));
		// дупликат неће бити додат
		// пошто уређење омогућава имплицитно и поређење на једнакост
		uDrvoSkup.add(new UredjeniPar<String, Integer>("Новак", 26));
		uDrvoSkup.add(new UredjeniPar<String, Integer>("Данил", 4));
		uDrvoSkup.add(new UredjeniPar<String, Integer>("Стефанос", 4));
		System.out.println("Скуп уређених парова: " + uDrvoSkup);
	}
}
