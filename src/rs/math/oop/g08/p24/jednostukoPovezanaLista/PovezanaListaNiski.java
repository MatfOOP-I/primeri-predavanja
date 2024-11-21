package rs.math.oop.g08.p24.jednostukoPovezanaLista;

public class PovezanaListaNiski {

	private Cvor pocetak = null;
	private Cvor kraj = null;
	private Cvor tekuci = null;

	public PovezanaListaNiski() {
	}

	public PovezanaListaNiski(String niska) {
		if (niska != null)
			tekuci = kraj = pocetak = new Cvor(niska);
	}

	public PovezanaListaNiski(String[] niske) {
		if (niske == null)
			return;
		for (int i = 0; i < niske.length; i++)
			dodajNaKraj(niske[i]);
		tekuci = pocetak;
	}

	public void dodajNaKraj(String niska) {
		Cvor noviKraj = new Cvor(niska);
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

	public void dodajNaPocetak(String niska) {
		Cvor noviPocetak = new Cvor(niska);
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
		Cvor tek = pocetak;
		if (tek == null) {
			sb.append("]");
			return sb.toString();
		}
		while (tek != null) {
			sb.append( " " + tek.uzmiSadrzaj());
			tek = tek.uzmiSledeci();
		}
		sb.append("]");
		return sb.toString();
	}
}
