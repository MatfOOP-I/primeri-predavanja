package rs.math.oop.g14.p18.stekKolekcijaListaNiz;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class StekPrekoNiza<T> extends AbstractCollection<T> implements Stek<T> {

	private SamorastuciNiz<T> elementi;
	private int vrhSteka;

	// иницијализациони блок
	{
		elementi = new SamorastuciNiz();
		vrhSteka = -1;
	}

	@Override
	public boolean add(T elem) {
		elementi.postaviNa(++vrhSteka, elem);
		return true;
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
	public Iterator<T> iterator() {
		return new StekIterator();
	}

	@Override
	public int size() {
		return (vrhSteka + 1);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("<<");
		for (T elem : this)
			sb.append(elem + " ");
		sb.append(">>");
		return sb.toString();
	}

	private class StekIterator implements Iterator<T> {
		private int pozicija;

		public StekIterator() {
			pozicija = elementi.brojElemenata() - 1;
		}

		public T next() {
			if (!hasNext())
				throw new NoSuchElementException();
			T r = (T) elementi.uzmiSa(pozicija);
			pozicija--;
			return r;
		}

		public boolean hasNext() {
			return pozicija >= 0;
		}

		public void remove() {
			throw new UnsupportedOperationException();
		}

	}
}
