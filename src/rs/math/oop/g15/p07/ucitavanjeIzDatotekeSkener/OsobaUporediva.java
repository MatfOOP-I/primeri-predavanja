package rs.math.oop.g15.p07.ucitavanjeIzDatotekeSkener;

public class OsobaUporediva extends Osoba implements Comparable<OsobaUporediva>{
	
	public OsobaUporediva(String JMBG, String ime, String prezime, 
			int godinaRodjenja) {
		super(JMBG, ime, prezime, godinaRodjenja);
	}

	@Override
	public int compareTo(OsobaUporediva o) {
		return this.getJMBG().compareTo(o.getJMBG());
	}
}
