package rs.math.oop.g13.p04.generickiInterfejsStek;

import java.util.Scanner;

public class CitanjeSumiranje {

	private static Stek<Double> kreiraj(Scanner sc) {
		Stek<Double> stek = null;
		System.out.print("Унеси л (за листу) или н (за низ): ");
		char ulaz = sc.nextLine().trim().toLowerCase().charAt(0);
		switch (ulaz) {
		case 'л':
		case 'l':
			stek = new StekPrekoListe<Double>();
			break;
		case 'н':
		case 'n':
			stek = new StekPrekoNiza<Double>();
		}
		return stek;
	}

	private static void napuni(Scanner sc, Stek<Double> stek) {
		while (sc.hasNext()) {
			String rec = sc.next();
			if (rec.equals("КРАЈ"))
				break;
			try {
				double d = Double.parseDouble(rec);
				stek.dodaj(d);
			} catch (NumberFormatException exp) {
				System.err.println("Некоректан формат: " + rec);
			}
		}
	}

	private static double prikaziSaberiIsprazni(Stek<Double> stek) {
		double rezultat = 0;
		while (stek.brojElemenata() > 0) {
			double d = stek.ukloni();
			rezultat += d;
			System.out.printf("%10.6f", d);
		}
		System.out.println();
		return rezultat;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stek<Double> stek = kreiraj(sc);
		if (stek == null)
			return;
		System.out.println("Унеси бројеве (или реч КРАЈ ћирилицом за крај уноса):");
		napuni(sc, stek);
		sc.close();
		System.out.println("Број прочитаних бројева: " + stek.brojElemenata());
		Double suma = prikaziSaberiIsprazni(stek);
		System.out.printf("Сума прочитаних бројева: %10.6f", suma);
	}
}
