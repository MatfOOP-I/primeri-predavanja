package rs.math.oop.g08.p23.samorastuciNiz;

import java.util.Arrays;

public class SamorastuciNizNiski {

	private String[] elementi;
	private int brojElemenata;

	// иницијализациони блок
	{
		elementi = new String[8];
		brojElemenata = 0;
	}

	private void obezbediKapacitet(int noviKapacitet) {
		if (noviKapacitet <= trenutniKapacitet())
			return;
		String[] pomocni = elementi;
		elementi = Arrays.copyOf(pomocni, noviKapacitet);
	}

	public void postaviNa(int indeks, String vrednost) {
		if (indeks >= trenutniKapacitet()) {
			int noviKapacitet = Integer.max(indeks, 2 * elementi.length);
			obezbediKapacitet(noviKapacitet);
		}
		elementi[indeks] = vrednost;
		if (indeks + 1 > brojElemenata)
			brojElemenata = indeks + 1;
	}

	public String uzmiSa(int indeks) {
		if (indeks < 0) {
			System.err.println("Грешка: индекс је негативан!");
			return null;
		}
		if (indeks >= elementi.length) {
			System.err.println("Грешка: индекс је већи од величине низа!");
			return null;
		}
		return elementi[indeks];
	}

	public int brojElemenata() {
		return brojElemenata;
	}

	public int trenutniKapacitet() {
		return elementi.length;
	}
}
