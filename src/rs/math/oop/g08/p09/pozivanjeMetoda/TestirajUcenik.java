package rs.math.oop.g08.p09.pozivanjeMetoda;

public class TestirajUcenik {
	
	public static void main(String[] args) {
		Ucenik prvi = new Ucenik();
		prvi.imePrezime = "Петар Перић";
		prvi.razred = 3;
		Ucenik drugi = new Ucenik();
		drugi.imePrezime = "Милан Микић";
		drugi.razred = 6;
		// позив преко тачка-нотације из метода main
		// који не припада класи Ucenik
		prvi.prikaziInformacije();
		drugi.prikaziInformacije();
	}
}
