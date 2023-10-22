package rs.math.oop.g08.p11.nasledjivanje;

public class Ucenik {
	String imePrezime;
	int razred;

	void prikaziInformacije() {
		// позив метода jeStarijaSmena()
		// унутар другог метода који исто припада класи Ucenik
		System.out.println(imePrezime + " " + razred 
				+ " " + jeStarijaSmena()); // могло је и this.jeStarijaSmena()
	}

	boolean jeStarijaSmena() {
		return razred > 4;
	}
}
