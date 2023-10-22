package rs.math.oop.g15.p07.ucitavanjeIzDatotekeSkener;

public class Osoba{

	private String JMBG;
	private String ime;
	private String prezime;
	private int godinaRodjenja;
	
	public Osoba(String JMBG, String ime, String prezime, int godinaRodjenja) {
		this.JMBG = JMBG;
		this.ime = ime;
		this.prezime = prezime;
		this.godinaRodjenja = godinaRodjenja;
	}
	
	public String getJMBG() {
		return JMBG;
	}
	
	@Override
	public String toString() {
		return String.format("%s\t%s\t%s\t%d", JMBG, ime, prezime, godinaRodjenja);
	}
}
