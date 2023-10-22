package rs.math.oop.g13.p04.generickiInterfejsStek;

public class PovezanaLista<T> {

	public class Cvor<E> {
		private E sadrzaj;
		private Cvor<E> sledeci;

		private Cvor(E elem) {
			sadrzaj = elem;
			sledeci = null;
		}

		public E uzmiSadrzaj() {
			return sadrzaj;
		}

		public void postaviSadrzaj(E sadrzaj) {
			this.sadrzaj = sadrzaj;
		}

		public Cvor<E> uzmiSledeci() {
			return sledeci;
		}

		public void postaviSledeci(Cvor<E> sledeci) {
			this.sledeci = sledeci;
		}

		@Override
		public String toString() {
			return "Листа: " + sadrzaj;
		}

	}

	private Cvor<T> pocetak = null;
	private Cvor<T> kraj = null;
	private Cvor<T> tekuci = null;

	public PovezanaLista() {
	}

	public PovezanaLista(T elem) {
		if (elem != null)
			tekuci = kraj = pocetak = new Cvor<T>(elem);
	}

	public PovezanaLista(T[] elementi) {
		if (elementi == null)
			return;
		for (int i = 0; i < elementi.length; i++)
			dodajNaKraj(elementi[i]);
		tekuci = pocetak;
	}

	public void dodajNaKraj(T elem) {
		Cvor<T> noviKraj = new Cvor(elem);
		if (pocetak == null)
			pocetak = kraj = noviKraj;
		else {
			kraj.postaviSledeci(noviKraj);
			kraj = noviKraj;
		}
	}

	public T ukloniSaKraja() {
		if (kraj == null)
			return null;
		if (pocetak == kraj) {
			Cvor<T> jedini = kraj;
			pocetak = kraj = null;
			return jedini.uzmiSadrzaj();
		}
		Cvor<T> poslednji = kraj;
		Cvor<T> pretposlednji = pocetak;
		while (pretposlednji.uzmiSledeci() != poslednji)
			pretposlednji = pretposlednji.uzmiSledeci();
		pretposlednji.postaviSledeci(null);
		kraj = pretposlednji;
		return poslednji.uzmiSadrzaj();
	}

	public void dodajNaPocetak(T elem) {
		Cvor<T> noviPocetak = new Cvor(elem);
		if (kraj == null)
			pocetak = kraj = noviPocetak;
		else {
			noviPocetak.postaviSledeci(pocetak);
			pocetak = noviPocetak;
		}
	}

	public T ukloniSaPocetka() {
		if (pocetak == null)
			return null;
		if (pocetak == kraj) {
			Cvor<T> jedini = kraj;
			pocetak = kraj = null;
			return jedini.uzmiSadrzaj();
		}
		Cvor<T> prvi = pocetak;
		pocetak = prvi.uzmiSledeci();
		return prvi.uzmiSadrzaj();
	}

	public boolean stigaoDoKraja() {
		return (tekuci == kraj) || (tekuci == null);
	}

	public T uzmiPrvi() {
		tekuci = pocetak;
		return (tekuci == null) ? null : tekuci.uzmiSadrzaj();
	}

	public T uzmiSledeci() {
		if (!stigaoDoKraja())
			tekuci = tekuci.uzmiSledeci();
		return (tekuci == null) ? null : tekuci.uzmiSadrzaj();
	}

	public int brojCvorova() {
		int n = 1;
		Cvor tek = pocetak;
		if (tek == null)
			return 0;
		while (tek != kraj) {
			tek = tek.uzmiSledeci();
			n++;
		}
		return n;
	}

}
