package rs.math.oop.g07.p02.nzdNizaBrojevaKolekcijskiFor;

import rs.math.oop.g03.p02.strukturnaParadigma.StrukturnoNzd;

public class PokreniNzdNizaKolekcijskiFor {
	public static void main(String[] argumenti) {
		// низ чији се НЗД тражи
		int[] niz = { 24, 48, 96, 192, 36, 72, 144 };
		// приказ низа
		System.out.print("Низ: ");
		for (int elemenat : niz)
			System.out.print(elemenat + " ");
		System.out.println();
		// одређивање НЗД-а
		int nzd = niz[0];
		for (int elemenat : niz)
			nzd = StrukturnoNzd.nzd2(nzd, elemenat);
		// приказ резултата
		System.out.print("НЗД низа: " + nzd);
	}
}
