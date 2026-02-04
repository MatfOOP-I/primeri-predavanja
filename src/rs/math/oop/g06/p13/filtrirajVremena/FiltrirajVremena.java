package rs.math.oop.g06.p13.filtrirajVremena;

public class FiltrirajVremena {

	public static void main(String[] args) {
		java.util.Scanner skener = new java.util.Scanner(System.in);
		System.out.println("Унесите број");
		int n = skener.nextInt();
		java.time.LocalDateTime sad = java.time.LocalDateTime.now();
		int tekucaGodina = sad.getYear();
		java.time.LocalDateTime vreme = java.time.LocalDateTime.of(
				tekucaGodina, 12, 31, 23, 59);
		while (vreme.getYear() == tekucaGodina) {
			int suma = vreme.getMonthValue() + vreme.getDayOfMonth() 
					+ vreme.getHour() + vreme.getMinute();
			if (suma == n)
				System.out.println(vreme);
			vreme = vreme.minusMinutes(1);
		}
		skener.close();
	}
}
