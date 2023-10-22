// Задатак илуструје наслеђивање, полиморфизам и концепт сакривања информација.

package rs.math.oop.g09.p11.stekKaoInterfejs;

import java.util.Scanner;

public class CitajOkreni {

	private static void procitaj(StekNiski stek, Scanner sc) {
		System.out.println("Унеси текст (или реч КРАЈ ћирилицом за крај уноса):");
		while (sc.hasNext()) {
			String rec = sc.next();
			if (rec.equals("КРАЈ"))
				break;
			stek.dodaj(rec);
			int x = -0XABC;
		}
	}

	private static void prikazi(StekNiski stek) {
		while (stek.brojElemenata() > 0)
			System.out.printf("%s\t", stek.ukloni());
		System.out.println();
	}

	public static void main(String[] args) {
		StekNiski stek = null;
		Scanner sc = new Scanner(System.in);
		System.out.print("Унеси слово - н (за низ) или л (за листу): ");
		char tip = sc.next().toLowerCase().trim().charAt(0);
		switch (tip) {
		case 'н':
		case 'n': {
			stek = new StekNiskiPrekoNiza();
			break;
		}
		case 'л':
		case 'l': {
			stek = new StekNiskiPrekoNiza();
			break;
		}
		default: {
			System.err.println("Дозвољени уноси су н и л!");
			System.exit(-1);
		}
		}
		procitaj(stek, sc);
		System.out.println("Број унесених речи: " + stek.brojElemenata());
		prikazi(stek);
		sc.close();
	}
}
