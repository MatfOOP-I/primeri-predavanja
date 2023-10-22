package rs.math.oop.g02.p02a.kasnoVezivanje;

class Poslediplomac extends Student {
	boolean zaposlen;
	private int brojIspita;

	public void postavibrojIspita(int b) {
		brojIspita = b;
	}

	public int uzmibrojIspita() {
		return brojIspita;
	}

	@Override
	void stampajPodatke() {
		System.out.println("Име последипломца је: " + ime
				+ ", број индекса је: " + brojIndeksa
				+ "/ На буџету: " + naBudzetu
				+ "/ Запослен: " + zaposlen + ".");
	}


}
