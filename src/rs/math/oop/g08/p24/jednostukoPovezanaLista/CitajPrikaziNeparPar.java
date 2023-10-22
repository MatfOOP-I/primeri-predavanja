
package rs.math.oop.g08.p24.jednostukoPovezanaLista;

import java.util.Scanner;

public class CitajPrikaziNeparPar {

	private static void napuni(Scanner sc, PovezanaListaNiski lista) {
		while (sc.hasNext()) {
			String rec = sc.next();
			if(rec.equals("КРАЈ"))
				break;
			lista.dodajNaKraj(rec);
		}
	}

	private static void prikaziNeparniParni(PovezanaListaNiski lista) {
		System.out.printf("%s\t", lista.uzmiPrvi());
		while (!lista.stigaoDoKraja()) {
			lista.uzmiSledeci();
			if (lista.stigaoDoKraja())
				break;
			System.out.printf("%s\t", lista.uzmiSledeci());
		}
		System.out.println();
		lista.uzmiPrvi();
		if (!lista.stigaoDoKraja())
			System.out.printf("%s\t", lista.uzmiSledeci());
		while (!lista.stigaoDoKraja()) {
			lista.uzmiSledeci();
			if (lista.stigaoDoKraja())
				break;
			System.out.printf("%s\t", lista.uzmiSledeci());
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PovezanaListaNiski lista = new PovezanaListaNiski();
		System.out.println("Унеси текст (или реч КРАЈ ћирилицом за крај уноса):");
		napuni(sc, lista);
		sc.close();
		System.out.println("Број речи: " + lista.brojCvorova());
		prikaziNeparniParni(lista);
	}
}
