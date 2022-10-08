package rs.math.oop.g02.p02.nasledjivanje;

class Poslediplomac extends Student {
	boolean zaposlen;
	private int brojIspita;

	public void postavibrojIspita(int b) {
		brojIspita = b;
	}

	public int uzmibrojIspita() {
		return brojIspita;
	}
}
