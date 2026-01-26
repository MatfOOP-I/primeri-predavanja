package rs.math.oop.g14.p18.stekKolekcijaListaNiz;

import java.util.*;

public class StekPrekoNizaRobustanIterator<T> extends AbstractCollection<T> implements Stek<T> {

	private SamorastuciNiz<T> elementi;
	private int vrhSteka;
	private int brojModifikacija;

	// иницијализациони блок
	{
		elementi = new SamorastuciNiz();
		vrhSteka = -1;
		brojModifikacija = 0;
	}

	public StekPrekoNizaRobustanIterator(){
	}

	public StekPrekoNizaRobustanIterator(Collection<T> col){
		for(T el: col)
			dodaj(el);
	}

	@Override
	public boolean add(T elem) {
		dodaj(elem);
		return true;
	}

	@Override
	public void dodaj(T elem) {
		brojModifikacija++;
		elementi.postaviNa(++vrhSteka, elem);
	}

	@Override
	public T ukloni() {
		if (vrhSteka == -1) {
			throw new NullPointerException();
		}
		brojModifikacija++;
		return elementi.uzmiSa(vrhSteka--);
	}

	@Override
	public Iterator<T> iterator() {
		return new StekIterator(brojModifikacija);
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
		private int brojModifikacija;

		public StekIterator(int brojModifikacija) {
			this.brojModifikacija = brojModifikacija;
			pozicija = elementi.brojElemenata() - 1;
		}

		public T next() {
			if (this.brojModifikacija != StekPrekoNizaRobustanIterator.this.brojModifikacija)
				throw new ConcurrentModificationException();
			if (!hasNext())
				throw new NoSuchElementException();
			T r = (T) elementi.uzmiSa(pozicija);
			pozicija--;
			return r;
		}

		public boolean hasNext() {
			if (this.brojModifikacija != StekPrekoNizaRobustanIterator.this.brojModifikacija)
				throw new ConcurrentModificationException();
			return pozicija >= 0;
		}

		public void remove() {
			throw new UnsupportedOperationException();
		}

	}

	public static void main(String... argumenti){
		String[] niz = {"Miki", "Paja", "Silja", "Petar Pan"};
		List<String> l = Arrays.asList(niz);
		Stek<String> st = new StekPrekoNiza<>(l);
		System.out.println(st);
		st.dodaj("Pluton");
		System.out.println(st);
		String s = st.ukloni();
		System.out.println(s);
		System.out.println(st);

	}
}
