package rs.math.oop.g02.p03.ucaurivanje;

class Krug {
	// природни опис стања круга
	int cx, cy;
	int r;

	Krug(int cx, int cy, int r) {
		this.cx = cx;
		this.cy = cy;
		this.r = r;
	}

	// круг има одговорност да манипулише својим стањем
	// други могу да му мењају стање, али само позивањем његових метода
	void transliraj(int dx, int dy) {
		cx += dx;
		cy += dy;
	}

	void prikazi() {
		System.out.println("Круг C = (" + cx + ", " + cy + ") и r = " + r);
	}
}
