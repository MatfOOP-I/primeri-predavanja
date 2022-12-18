package rs.math.oop.g14.p21.novaKolekcijaRedPrekoPovezaneListe;

import java.util.AbstractQueue;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

public class RedPrekoPovezaneListe<T> extends AbstractQueue<T> {
	private class ElemenatListe {
		private ElemenatListe sledeci; // Refers to next item in the list
		private T vrednost;

		// Constructor
		public ElemenatListe(T item) {
			this.vrednost = item; // Store the item
			sledeci = null; // Set next as end point
		}

		// Return class ime & object
		public String toString() {
			return "Elemenat liste: " + vrednost;
		}

	}

	private class PovezanaListaIterator implements Iterator<T> {
		private ElemenatListe tekuci = null;
		private int indikatorModifikacije = 0;

		public PovezanaListaIterator(ElemenatListe el) {
			tekuci = el;
		}

		@Override
		public boolean hasNext() {
			return tekuci != null;
		}

		@Override
		public T next() {
			T elem = tekuci.vrednost;
			tekuci = tekuci.sledeci;
			return elem;
		}

	}

	private ElemenatListe glava = null; // First ListIem in the list
	private ElemenatListe rep = null; // Last ListIem in the list

	public RedPrekoPovezaneListe() {
		// Podrazumevani konstruktor kreira praznu listu 
	}

	@Override
	public boolean offer(T e) {
		ElemenatListe el = new ElemenatListe(e);
		if (rep == null)
			glava = rep = el;
		else {
			rep.sledeci = el;
			rep = el;
		}
		return true;
	}

	@Override
	public T poll() {
		if (glava == null)
			return null;
		ElemenatListe el = glava;
		glava = glava.sledeci;
		if (glava == null)
			rep = null;
		return el.vrednost;
	}

	@Override
	public T peek() {
		if (glava == null)
			return null;
		return glava.vrednost;
	}

	@Override
	public Iterator<T> iterator() {
		return new PovezanaListaIterator(glava);
	}

	@Override
	public int size() {
		Iterator<?> i = iterator();
		int ret = 0;
		while (i.hasNext()) {
			i.next();
			ret++;
		}
		return ret;
	}
}
