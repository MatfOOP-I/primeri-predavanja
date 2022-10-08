package rs.math.oop.g14.p18.stekKolekcijaListaNiz;

import java.util.Arrays;

public class SamorastuciNiz<T> {

	private T[] elementi = (T[]) new Object[8];
	private int brojElemenata = 0;

	private void obezbediKapacitet(int noviKapacitet) {
		if (noviKapacitet <= trenutniKapacitet())
			return;
		T[] pomocni = elementi;
		elementi = Arrays.copyOf(pomocni, noviKapacitet);
	}

	public void postaviNa(int indeks, T vrednost) {
		if (indeks >= trenutniKapacitet()) {
			int noviKapacitet = Integer.max(indeks, 2 * elementi.length);
			obezbediKapacitet(noviKapacitet);
		}
		elementi[indeks] = vrednost;
		if (indeks + 1 > brojElemenata)
			brojElemenata = indeks + 1;
	}

	public T uzmiSa(int indeks) {
		if (indeks < 0) {
			System.err.println("Greska: indeks je negativan!");
			return null;
		}
		if (indeks >= elementi.length) {
			System.err.println("Greska: indeks je veci od dimenzije niza!");
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
