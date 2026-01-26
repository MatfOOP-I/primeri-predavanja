package rs.math.oop.g14.p18.stekKolekcijaListaNiz;

import java.util.*;

public class StekoviKolekcije {

	private static Stek<String> kreiraj(Scanner sc) {
		Stek stek = null;
		System.out.print("Унеси л (за листу) или н (за низ): ");
		char ulaz = sc.nextLine().trim().toLowerCase().charAt(0);
		switch (ulaz) {
		case 'л':
		case 'l':
			stek = new StekPrekoListe();
			break;
		case 'н':
		case 'n':
			stek = new StekPrekoNiza();
		}
		return stek;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stek<String> stek = kreiraj(sc);
		sc.close();

		System.out.println("Хеш скуп");
		Set<String> skup = new HashSet<String>();
		skup.add("Aлександар");
		skup.add("Бранко");
		skup.add("Владимир");
		skup.add("Горан");
		skup.add("Душан");
		skup.add("Ђорђе");
		System.out.println(skup);

		System.out.println("Стек");
		stek.addAll(skup);
		for (String s : stek)
			System.out.print(s + " ");
		System.out.println("У стек се додаје 'Емил'");
		stek.dodaj("Емил");
		System.out.println(stek);
		System.out.println("Величина стека: " + stek.size());

		System.out.println("Низовна листа");
		List<String> lista = new ArrayList<>(stek);
		//lista.addAll(stek);
		System.out.println(lista);

	}
}
