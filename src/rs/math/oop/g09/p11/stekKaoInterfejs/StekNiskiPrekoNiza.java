package rs.math.oop.g09.p11.stekKaoInterfejs;

public class StekNiskiPrekoNiza implements StekNiski {

	private SamorastuciNizNiski elementi;
	private int vrhSteka;

	// иницијализациони блок
	{
		elementi = new SamorastuciNizNiski();
		vrhSteka = -1;
	}

	@Override
	public void dodaj(String elem) {

		elementi.postaviNa(++vrhSteka, elem);
	}

	@Override
	public String ukloni() {
		if (vrhSteka == -1) {
			System.err.println("Грешка при уклањању: стек је празан!");
			return "<нема>";
		}
		return elementi.uzmiSa(vrhSteka--);
	}

	@Override
	public int brojElemenata() {
		return (vrhSteka + 1);
	}
}
