package rs.math.oop.g13.p04.generickiInterfejsStek;

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
			throw new ArrayIndexOutOfBoundsException(indeks);
		}
		if (indeks >= elementi.length) {
			throw new ArrayIndexOutOfBoundsException(indeks);
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
