package rs.math.oop.g13.p04.generickiInterfejsStek;

public class StekPrekoNiza<T> implements Stek<T> {

	private SamorastuciNiz<T> elementi;
	private int vrhSteka;

	// иницијализациони блок
	{
		elementi = new SamorastuciNiz();
		vrhSteka = -1;
	}

	@Override
	public void dodaj(T elem) {
		elementi.postaviNa(++vrhSteka, elem);
	}

	@Override
	public T ukloni() {
		if (vrhSteka == -1) {
			System.err.println("Грешка при уклањању: стек је празан!");
			return null;
		}
		return elementi.uzmiSa(vrhSteka--);
	}

	@Override
	public int brojElemenata() {
		return (vrhSteka + 1);
	}
}
