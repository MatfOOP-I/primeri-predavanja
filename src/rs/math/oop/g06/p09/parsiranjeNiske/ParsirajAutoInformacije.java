package rs.math.oop.g06.p09.parsiranjeNiske;

public class ParsirajAutoInformacije {

	static void greska(String poruka) {
		System.err.println(poruka);
		System.exit(1);
	}

	public static void main(String[] args) {
		String automobili = "Peugeot 3008 2017 120 KS 1560 cm3. " 
				+ "Suzuki Vitara 2018 120 KS 1600 cm3. "
				+ "Toyota RAV4 2021 175 KS 1998 cm3.";
		double prosecnaSnaga = 0, prosecnaZapremina = 0, prosecnaGodina = 0;
		int brojAutomobila = 0;

		java.util.Scanner skener = new java.util.Scanner(automobili);
		while (skener.hasNext()) {
			// учитавамо један аутомобил
			int snaga, zapremina, godina;

			if (!skener.hasNext())
				greska("Марка недостаје.");
			skener.next();
			if (!skener.hasNext())
				greska("Модел недостаје.");
			skener.next();
			if (!skener.hasNextInt())
				greska("Година производње недостаје.");
			godina = skener.nextInt();
			if (!skener.hasNextInt())
				greska("Снага мотора недостаје.");
			snaga = skener.nextInt();
			// наводимо експлицитни текст који очекујемо
			if (!skener.hasNext("KS"))
				greska("Ознака KS недостаје.");
			// ако није очекивани текст hasNext враћа false
			skener.next("KS");
			if (!skener.hasNextInt())
				greska("Запремина мотора недостаје.");
			zapremina = skener.nextInt();
			if (!skener.hasNext("cm3."))
				greska("Ознака cm3. недостаје.");
			skener.next("cm3.");

			prosecnaGodina += godina;
			prosecnaSnaga += snaga;
			prosecnaZapremina += zapremina;
			brojAutomobila++;
		}
		prosecnaGodina/=brojAutomobila;
		prosecnaSnaga/=brojAutomobila;
		prosecnaZapremina/=brojAutomobila;
		// затварање скенера
		skener.close();

		if (brojAutomobila > 0) {
			System.out.println(String.format("Просек година:\t%.2f%n"
					+ "Просек Снаге:\t%.2f%nПросек запремине:\t%.2f%n",
					prosecnaGodina, prosecnaSnaga, prosecnaZapremina));
		}
	}
}
