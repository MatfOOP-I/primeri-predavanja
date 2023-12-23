package rs.math.oop.g14.p18.stekKolekcijaListaNiz;

import java.util.*;

public class StekPrekoListe<T> extends AbstractCollection<T> implements Stek<T> {

	private class Cvor {
		private Cvor sledeci;
		private T vrednost;

		public Cvor(T item) {
			this.vrednost = item;
			sledeci = null;
		}

		public String toString() {
			return "елемент листе: " + vrednost;
		}
	}

	private Cvor glava = null;
	
	private void dodajNaPocetak(T elem) {
		if (glava == null) {
			glava = new Cvor(elem);
			return;
		}
		Cvor e = new Cvor(elem);
		e.sledeci = glava;
		glava = e;
	}

	@Override
	public boolean add(T elem) {
		dodajNaPocetak(elem);
		return true;
	}

	private T ukloniSaPocetka() throws Exception {
		if (glava == null) {
			throw new Exception("Колекција је празна");
		}
		Cvor e = glava;
		glava = e.sledeci;
		return e.vrednost;
	}

	public StekPrekoListe() {
	}

	public StekPrekoListe(Collection<T> c) {
		Iterator<T> it = c.iterator();
		while (it.hasNext()) {
			dodajNaPocetak(it.next());
		}
	}

	@Override
	public Iterator<T> iterator() {
		return new IteratorSteka<T>();
	}

	@Override
	public int size() {
		Iterator<T> it = this.iterator();
		int ret = 0;
		while (it.hasNext()) {
			ret++;
			it.next();
		}
		return ret;
	}

	@Override
	public void dodaj(T elem) {
		dodajNaPocetak(elem);
	}

	@Override
	public T ukloni() {
		T ret = null;
		try {
			ret = ukloniSaPocetka();
		} catch (Exception e) {
			System.out.println(e);
		}
		return ret;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("<<");
		for (T elem : this)
			sb.append(elem + " ");
		sb.append(">>");
		return sb.toString();
	}
	


	private class IteratorSteka<E> implements Iterator<E> {
		private Cvor tekuci;

		public IteratorSteka() {
			tekuci = glava;
		}

		@Override
		public boolean hasNext() {
			return tekuci != null;
		}

		@Override
		public E next() {
			E vrednost = (E) tekuci.vrednost;
			tekuci = tekuci.sledeci;
			return vrednost;
		}
	}

	public static void main(String... argumenti){
		String[] niz = {"Miki", "Paja", "Silja", "Petar Pan"};
		List<String> l = Arrays.asList(niz);
		Stek<String> st = new StekPrekoListe<>(l);
		System.out.println(st);
		st.dodaj("Pluton");
		System.out.println(st);
		String s = st.ukloni();
		System.out.println(s);
		System.out.println(st);

	}

}
