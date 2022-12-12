package rs.math.oop.g11.p06.izuzeciPropagiranje;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class ParsiranjeDatumaPropagiranjeIzuzetka {
	
	final static DateTimeFormatter datumFormat = 
			DateTimeFormatter.ofPattern("dd.MM.yyyy");
	
	static LocalDate parsirajDatum(String datumString) throws DateTimeParseException {
		LocalDate datum = LocalDate.parse(datumString, datumFormat);
		return datum;
	}
	
	public static void main(String[] args)  {
		LocalDate datum = null;
		Scanner skener = null;
	
		Boolean unetValidanFormat = false;
		try {
			skener = new Scanner(System.in);
			while (!unetValidanFormat) {
				try {
					System.out.println("Datum dd.MM.yyyy:");
					String datumString = skener.next();
					datum = parsirajDatum(datumString);
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