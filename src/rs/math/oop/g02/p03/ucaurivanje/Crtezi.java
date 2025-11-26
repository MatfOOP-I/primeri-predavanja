package rs.math.oop.g02.p03.ucaurivanje;

class Crtezi {

	public static void main(String[] args) {
		// конструкција објекта цртеж
		Crtez crtez = new Crtez();
		System.out.println("Пре транслације:");
		crtez.prikazi();
		crtez.translirajSve(2, -3);
		System.out.println("После транслације:");
		crtez.prikazi();
	}
}
