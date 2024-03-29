package rs.math.oop.g14.p14.hesRecnik;

public class Osoba{

	private String JMBG;
	private String ime;
	private String prezime;
	private int godinaRodjenja;
	
	public Osoba(String JMBG, String ime, String prezime, int godRodjenja) {
		this.JMBG = JMBG;
		this.ime = ime;
		this.prezime = prezime;
		this.godinaRodjenja = godRodjenja;
	}
	
	public String uzmiJMBG() {
		return JMBG;
	}
	
	@Override
	public String toString() {
		return String.format("%s\t%s\t%s\t%d", JMBG, ime, prezime, godinaRodjenja);
	}
}
