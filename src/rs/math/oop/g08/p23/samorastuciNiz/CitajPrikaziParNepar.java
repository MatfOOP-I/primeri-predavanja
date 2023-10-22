package rs.math.oop.g08.p23.samorastuciNiz;

import java.util.Scanner;

public class CitajPrikaziParNepar {

	private static void napuni(Scanner sc, SamorastuciNizNiski niz) {
		int i = 0;
		while (sc.hasNext()) {
			String rec = sc.next();
			if (rec.equals("КРАЈ"))
				break;
			niz.postaviNa(i++, rec);
		}
	}

	private static void prikaziParniNeparni(SamorastuciNizNiski niz) {
		for (int i = 0; i < niz.brojElemenata(); i += 2)
			System.out.printf("%s\t", niz.uzmiSa(i));
		System.out.println();
		for (int i = 1; i < niz.brojElemenata(); i += 2)
			System.out.printf("%s\t", niz.uzmiSa(i));
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SamorastuciNizNiski niz = new SamorastuciNizNiski();
		System.out.println("Унеси текст (или реч КРАЈ ћирилицом за крај уноса):");
		napuni(sc, niz);
		sc.close();
		System.out.println("Број речи: " + niz.brojElemenata());
		prikaziParniNeparni(niz);
	}
}
