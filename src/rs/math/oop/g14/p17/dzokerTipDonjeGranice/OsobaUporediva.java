package rs.math.oop.g14.p17.dzokerTipDonjeGranice;

public class OsobaUporediva extends Osoba implements Comparable<OsobaUporediva>{
	
	public OsobaUporediva(String JMBG, String ime, String prezime, 
			int godinaRodjenja) {
		super(JMBG, ime, prezime, godinaRodjenja);
	}

	@Override
	public int compareTo(OsobaUporediva o) {
		return this.uzmiJMBG().compareTo(o.uzmiJMBG());
	}
}
