package rs.math.oop.g07.p01.nzdNizaBrojeva;

import rs.math.oop.g03.p02.strukturnaParadigma.StrukturnoNzd;

public class PokreniNzdNiza {
	public static void main(String[] argumenti) {
		// низ чији се НЗД тражи
		int[] niz = { 24, 48, 96, 192, 36, 72, 144, 1212 };
		// приказ низа
		System.out.print("Низ: ");
		for (int elemenat : niz)
			System.out.print(elemenat + " ");
		System.out.println();
		// одређивање НЗД-а
		int nzd = niz[0];
		for (int i=1; i<niz.length; i++) {
			int elemenat = niz[i];
			nzd = StrukturnoNzd.nzd2(nzd, elemenat);
		}
		// приказ резултата
		System.out.print("НЗД низа: " + nzd);
	}
}