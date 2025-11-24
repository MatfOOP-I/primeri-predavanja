package rs.math.oop.g02.p02.nasledjivanje;

class Poslediplomac extends Student {

	boolean zaposlen;
	
	private int brojIspita;

	public void postaviBrojIspita(int b) {
		brojIspita = b;
	}

	public int uzmiBrojIspita() {
		return brojIspita;
	}
}
