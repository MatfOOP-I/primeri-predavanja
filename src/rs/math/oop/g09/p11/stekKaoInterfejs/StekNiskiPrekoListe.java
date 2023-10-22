/*
Класа за реализацију стека који садржи ниске.
Стек се реализује преко једноструко повезане листе. 
Стек може да расте по потреби.
 */

package rs.math.oop.g09.p11.stekKaoInterfejs;

public class StekNiskiPrekoListe implements StekNiski {

	private PovezanaListaNiski elementi = new PovezanaListaNiski();

	@Override
	public void dodaj(String elem) {
		elementi.dodajNaPocetak(elem);
	}

	@Override
	public String ukloni() {
		String elem = elementi.ukloniSaPocetka();
		if (elem == null) {
			System.err.println("Грешка при уклањању: стек је празан!");
			return "<нема>";
		}
		return elem;
	}

	@Override
	public int brojElemenata() {
		String elem = elementi.uzmiPrvi();
		if (elem == null)
			return 0;
		int n = 0;
		while (elem != null) {
			n++;
			elem = elementi.uzmiSledeci();
		}
		return n;
	}
}
