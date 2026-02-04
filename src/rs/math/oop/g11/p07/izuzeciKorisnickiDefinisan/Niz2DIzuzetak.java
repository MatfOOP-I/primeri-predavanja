package rs.math.oop.g11.p07.izuzeciKorisnickiDefinisan;

public class Niz2DIzuzetak extends Exception {

	private int unutrasnjaDimenzija = -1;

	public Niz2DIzuzetak(String poruka) {
		super(poruka);
	}

	public Niz2DIzuzetak(String poruka, int unutrasnjaDimenzija) {
		super(poruka);
		this.unutrasnjaDimenzija = unutrasnjaDimenzija;
	}

	public int vratiUnutrasnjuDimenziju() {
		return unutrasnjaDimenzija;
	}

	@Override
	public String toString() {
		if (unutrasnjaDimenzija == -1)
			return super.toString();
		else
			return super.toString() + " (унутрашња димензија: " + unutrasnjaDimenzija + ")";
	}	
}