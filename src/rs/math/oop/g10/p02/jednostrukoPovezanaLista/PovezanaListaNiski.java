package rs.math.oop.g10.p02.jednostrukoPovezanaLista;

public class PovezanaListaNiski {
	
	private class Cvor {
		private String sadrzaj;
		private Cvor sledeci;

		private Cvor(String elem) {
			sadrzaj = elem;
			sledeci = null;
		}

		public String uzmiSadrzaj() {
			return sadrzaj;
		}

		public void postaviSadrzaj(String sadrzaj) {
			this.sadrzaj = sadrzaj;
		}

		public Cvor uzmiSledeci() {
			return sledeci;
		}

		public void postaviSledeci(Cvor sledeci) {
			this.sledeci = sledeci;
		}

		@Override
		public String toString() {
			return sadrzaj;
		}
	}

	private Cvor pocetak = null;
	private Cvor kraj = null;
	private Cvor tekuci = null;

	public PovezanaListaNiski() { }

	public PovezanaListaNiski(String elem) {
		if (elem != null)
			tekuci = kraj = pocetak = new Cvor(elem);
	}

	public PovezanaListaNiski(String[] elementi) {
		if (elementi == null)
			return;
		for (int i = 0; i < elementi.length; i++)
			dodajNaKraj(elementi[i]);
		tekuci = pocetak;
	}

	public void dodajNaKraj(String elem) {
		Cvor noviKraj = new Cvor(elem);
		if (pocetak == null)
			pocetak = kraj = noviKraj;
		else {
			kraj.postaviSledeci(noviKraj);
			kraj = noviKraj;
		}
	}

	public String ukloniSaKraja() {
		if (kraj == null)
			return null;
		if (pocetak == kraj) {
			Cvor jedini = kraj;
			tekuci = pocetak = kraj = null;
			return jedini.uzmiSadrzaj();
		}
		Cvor poslednji = kraj;
		Cvor pretposlednji = pocetak;
		while (pretposlednji.uzmiSledeci() != poslednji)
			pretposlednji = pretposlednji.uzmiSledeci();
		pretposlednji.postaviSledeci(null);
		kraj = pretposlednji;
		return poslednji.uzmiSadrzaj();
	}

	public void dodajNaPocetak(String elem) {
		Cvor noviPocetak = new Cvor(elem);
		if (kraj == null)
			tekuci = pocetak = kraj = noviPocetak;
		else {
			noviPocetak.postaviSledeci(pocetak);
			pocetak = noviPocetak;
			if (tekuci == null)
				tekuci = pocetak;
		}
	}

	public String ukloniSaPocetka() {
		if (pocetak == null)
			return null;
		if (pocetak == kraj) {
			Cvor jedini = kraj;
			pocetak = kraj = null;
			return jedini.uzmiSadrzaj();
		}
		Cvor prvi = pocetak;
		pocetak = prvi.uzmiSledeci();
		return prvi.uzmiSadrzaj();
	}

	public boolean stigaoDoKraja() {
		if (tekuci == null)
			return true;
		if (tekuci == kraj)
			return true;
		return false;
	}

	public String uzmiPrvi() {
		tekuci = pocetak;
		return (tekuci == null) ? null : tekuci.uzmiSadrzaj();
	}

	public String uzmiSledeci() {
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

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("[");
		Cvor iterator = pocetak;
		while (iterator != null) {
			sb.append(iterator + " ");
			iterator = iterator.sledeci;
		}
		return sb.toString().trim() + "]";
	}
}
