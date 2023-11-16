package rs.math.oop.g07.p02.nzdNizaBrojevaKolekcijskiFor;


public class PokreniNzdNizaKolekcijskiFor {
	public static void main(String[] argumenti) {
		// низ чији се НЗД тражи
		int[] niz = { 24, 48, 96, 192, 36, 72, 144, 6 };
		// приказ низа
		System.out.print("Низ: ");
		for (int element : niz)
			System.out.print(element + " ");
		System.out.println();
		// одређивање НЗД-а
		int nzd = niz[0];
		for (int element : niz)
			nzd = rs.math.oop.g03.p02.strukturnaParadigma.StrukturnoNzd.nzd2(
					nzd, element);
		// приказ резултата
		System.out.print("НЗД низа: " + nzd);
	}
}
