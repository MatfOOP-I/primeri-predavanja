package rs.math.oop.g02.p02.nasledjivanje;

/** Klasa која представља последипломца. */
class Poslediplomac extends Student {

	boolean zaposlen;
	
	private int brojIspita;

	/** Штампа податке. */
	public void postaviBrojIspita(int b) {
		brojIspita = b;
	}

	/** Uzmi broj ispita. */
	public int uzmiBrojIspita() {
		return brojIspita;
	}
}
