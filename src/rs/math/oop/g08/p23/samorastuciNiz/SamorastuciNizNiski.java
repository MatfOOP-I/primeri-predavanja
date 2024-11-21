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
		elementi = new String[noviKapacitet];
		for(int i=0; i<pomocni.length; i++)
			elementi[i] = pomocni[i];
		//elementi = Arrays.copyOf(pomocni, noviKapacitet);
	}

	public void postaviNa(int indeks, String vrednost) {
		if (indeks >= trenutniKapacitet()) {
			int noviKapacitet = Integer.max(indeks+1, 2 * trenutniKapacitet());
			obezbediKapacitet(noviKapacitet);
		}
		elementi[indeks] = vrednost;
		brojElemenata = Math.max(brojElemenata, indeks + 1);
	}

	public String uzmiSa(int indeks) {
		if (indeks < 0) {
			System.err.println("Грешка: индекс је негативан!");
			return null;
		}
		if (indeks >= brojElemenata()) {
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
