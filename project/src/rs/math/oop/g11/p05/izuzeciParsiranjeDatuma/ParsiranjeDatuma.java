package rs.math.oop.g11.p05.izuzeciParsiranjeDatuma;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class ParsiranjeDatuma {

	public static void main(String[] args) {
		LocalDate datum = null;
		Scanner skener = null;
		DateTimeFormatter datumFormat = DateTimeFormatter.ofPattern("dd.MM.yyyy");
		Boolean unetValidanFormat = false;
		try {
			skener = new Scanner(System.in);
			while (!unetValidanFormat) {
                try {
                    System.out.println("Датум dd.MM.yyyy:");
                    String datumString = skener.next();
                    datum = LocalDate.parse(datumString, datumFormat);
                    System.out.println("Валидан датум: " + datum);
                    unetValidanFormat = true;
                } catch (DateTimeParseException e) {
                    System.out.println("Погрешан формат датума!");
                }
            }

		} finally {
			skener.close();
		}
	}
}