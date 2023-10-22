package rs.math.oop.g09.p11.stekKaoInterfejs;

public class Cvor {
	private String sadrzaj;
	private Cvor sledeci;

	public Cvor(String elem) {
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
		return "Елеменат листе: " + sadrzaj;
	}

}
