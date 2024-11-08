package rs.math.oop.g02.p03.ucaurivanje;

/**
 * Klasa Krug opisuje jedan rug.
 *
 */
class Krug {
	// природни опис стања круга
	private int cx, cy;
	private int r;

	Krug(int centarX, int centarY, int poluprecnik) {
		cx = centarX;
		cy = centarY;
		r = poluprecnik;
	}

	// круг има одговорност да манипулише својим стањем
	// други могу да му мењају стање, али само позивањем његових метода
	void transliraj(int dx, int dy) {
		cx += dx;
		cy += dy;
	}

	void prikazi() {
		System.out.println("Круг:[(" + cx + ", " + cy + "), " + r + "]");
	}
}
