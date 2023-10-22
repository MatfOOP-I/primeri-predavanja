package rs.math.oop.g13.p04.generickiInterfejsStek;

public class StekPrekoListe<T> implements Stek<T> {

	private PovezanaLista<T> elementi = new PovezanaLista();

	@Override
	public void dodaj(T elem) {
		elementi.dodajNaPocetak(elem);
	}

	@Override
	public T ukloni() {
		T elem = elementi.ukloniSaPocetka();
		if (elem == null) {
			System.err.println("Грешка при уклањању: стек је празан!");
			return null;
		}
		return elem;
	}

	@Override
	public int brojElemenata() {
		return elementi.brojCvorova();
	}
}
