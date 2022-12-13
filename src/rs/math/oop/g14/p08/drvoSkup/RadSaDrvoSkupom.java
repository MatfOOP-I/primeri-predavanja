package rs.math.oop.g14.p08.drvoSkup;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

import rs.math.oop.g13.p03.genericiUredjeniPar.UredjeniPar;

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
		sDrvoSkup.add("елемент");
		sDrvoSkup.add("елемент");
		System.out.println("Скуп ниски: " + sDrvoSkup);

		// варијанта са експлицитним уређењем
		// кроз анонимну класу која имплементира Comparator
		SortedSet<UredjeniPar<String, Integer>> uDrvoSkup = new TreeSet<UredjeniPar<String, Integer>>(
				new Comparator<UredjeniPar<String, Integer>>() {
					@Override
					public int compare(UredjeniPar<String, Integer> o1, UredjeniPar<String, Integer> o2) {
						// примарно по другом растуће
						if (o2.drugaKomponenta().compareTo(o1.drugaKomponenta()) != 0)
							return o2.drugaKomponenta().compareTo(o1.drugaKomponenta());
						else // секундарно по првом растуће
							return o1.prvaKomponenta().compareTo(o2.prvaKomponenta());
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
