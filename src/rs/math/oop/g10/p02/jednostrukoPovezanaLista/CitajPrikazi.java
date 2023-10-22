
package rs.math.oop.g10.p02.jednostrukoPovezanaLista;

import java.util.Scanner;

public class CitajPrikazi {

	private static void napuni(Scanner sc, PovezanaListaNiski lista) {
		while (sc.hasNext()) {
			String rec = sc.next();
			if (rec.equals("КРАЈ"))
				break;
			lista.dodajNaKraj(rec);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PovezanaListaNiski lista = new PovezanaListaNiski();
		System.out.println("Унеси текст (или реч КРАЈ ћирилицом за крај уноса):");
		napuni(sc, lista);
		sc.close();
		System.out.println("Број речи: " + lista.brojCvorova());
		System.out.println("Листа:\n" + lista);
		// Cvor c = new Cvor("пример");
	}
}
