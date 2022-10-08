package rs.math.oop.g15.p06.obilazakSistemaDatoteka;

import java.io.File;

public class RekurzivniObilazak {

	private static void ObidjiUDubinu(String putanja) {
		File fAktivni = new File(putanja);
		// ако датотека не постоји, нема смисла ићи даље
		if (!fAktivni.exists())
			return;
		// за датотеке само исписујемо путању и враћамо се
		// пошто нема сигурно даљих потомака
		if (fAktivni.isFile()) {
			System.out.println(fAktivni.getAbsolutePath());
			return;
		}
		// иначе, ако је директоријум
		// онда рекурзивно обилазимо по свим потомцима
		File[] fPotomci = fAktivni.listFiles();
		if (fPotomci != null)
			for (File fp : fPotomci)
				ObidjiUDubinu(fp.getAbsolutePath());
	}

	public static void main(String[] args) {
		if (args.length != 1) {
			System.err.println("Аргумент командне линије " 
		+ "мора садржати путању до датотеке.");
			System.exit(1);
		}
		ObidjiUDubinu(args[0]);
	}
}
