package rs.math.oop.g14.p07.hesSkup;

import java.util.HashSet;

import rs.math.oop.g13.p03.genericiUredjeniPar.UredjeniPar;
import rs.math.oop.g14.p06.hesKod.UredjeniParUporediv;

public class RadSaHesSkupom {

	public static void main(String[] args) {
		HashSet<Double> d1HesSkup = new HashSet<>();
		d1HesSkup.add(3.14);	
		d1HesSkup.add(1.41);
		d1HesSkup.add(1.0);
		d1HesSkup.add(3.1400); // неће бити додат
		System.out.println("Први скуп реалних:");
		for (Double d : d1HesSkup)
			System.out.print(d + "\t");
		System.out.println();
		System.out.println(d1HesSkup.contains(1.0)); // true
		// contains прихвата Object као аргумент
		// тако да нема аутоматске конверзије у Double
		System.out.println(d1HesSkup.contains(1)); // false

		HashSet<Double> d2HesSkup = new HashSet<>();
		d2HesSkup.add(4.2);
		d2HesSkup.add(1.00);
		System.out.println("Други скуп реалних:");
		// toString је реализован на очекивани начин
		System.out.println(d2HesSkup);

		d1HesSkup.retainAll(d2HesSkup);
		System.out.println("Пресек два скупа реалних:");
		System.out.println(d1HesSkup);
		// слично се помоћу метода removeAll и addAll
		// могу формирати разлике и уније скупова

		HashSet<String> sHesSkup = new HashSet<>();
		sHesSkup.add("Скуп");
		sHesSkup.add("ниски");
		sHesSkup.add("елемент");
		sHesSkup.add("елемент");
		System.out.println("Скуп ниски са хеш кодовима:");
		for (String s : sHesSkup)
			System.out.println(String.format("%s\t%d", s, s.hashCode()));

		HashSet<UredjeniPar<String, Integer>> u1HesSkup 
			= new HashSet<UredjeniPar<String, Integer>>();
		u1HesSkup.add(new UredjeniPar<String, Integer>("Новак", 26));
		u1HesSkup.add(new UredjeniPar<String, Integer>("Рафаел", 23));
		u1HesSkup.add(new UredjeniPar<String, Integer>("Роџер", 20));
		// дупликат
		u1HesSkup.add(new UredjeniPar<String, Integer>("Новак", 26)); 
		System.out.println("Први скуп уређених парова:");
		System.out.println(u1HesSkup); // дупликат није елиминисан

		HashSet<UredjeniParUporediv<String, Integer>> u2HesSkup 
			= new HashSet<UredjeniParUporediv<String, Integer>>();
		u2HesSkup.add(new UredjeniParUporediv<String, Integer>("Новак", 26));
		u2HesSkup.add(new UredjeniParUporediv<String, Integer>("Рафаел", 23));
		u2HesSkup.add(new UredjeniParUporediv<String, Integer>("Роџер", 20));
		// дупликат
		u2HesSkup.add(new UredjeniParUporediv<String, Integer>("Новак", 26)); 
		System.out.println("Други скуп уређених парова:");
		System.out.println(u2HesSkup); // дупликат је елиминисан
	}
}
