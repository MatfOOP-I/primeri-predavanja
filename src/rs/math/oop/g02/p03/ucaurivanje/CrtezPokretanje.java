package rs.math.oop.g02.p03.ucaurivanje;

class CrtezPokretanje {

	public static void main(String[] args) {
		// конструкција објекта цртеж
		Crtez crtez = new Crtez();
		System.out.println("Пре транслације:");
		crtez.prikazi();
		crtez.translirajSve(11, -3);
		System.out.println("После транслације:");
		crtez.prikazi();
	}
}
