package rs.math.oop.g06.p15.generisiPredlogeSifara;

public class GenerisiPredlogeSifara {

	public static void main(String[] args) {
		java.util.Random gen = new java.util.Random(42121);
		for (int i = 0; i < 10; i++) {
			StringBuilder sbSifra = new StringBuilder();
			int duzina = gen.nextInt(9) + 8; // 8-16
			for (int j = 0; j < duzina; j++) {
				double tipSp = gen.nextDouble();
				if (tipSp <= 0.7) {
					// генериши слово
					int udaljenost = gen.nextInt(26);
					char c = (char) ('a' + udaljenost);
					if (gen.nextBoolean()) // 50% шансе да буде велико слово
						c = Character.toUpperCase(c);
					sbSifra.append(c);
				} else {
					// генериши цифру
					sbSifra.append(gen.nextInt(10)); // 0-9
				}
			}
			System.out.println(sbSifra); // имплицитно се позива toString
		}
	}
}
