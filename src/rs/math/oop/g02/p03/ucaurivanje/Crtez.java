package rs.math.oop.g02.p03.ucaurivanje;

/**
 * Klasa Crtez opisuje jedan crtez.
 *
 * Crtez sadrzi dva kruga i kvadrat.
 */
class Crtez {
	private Krug krug1;
	private Krug krug2;

	private Kvadrat kvadrat1;
	
	Crtez() {
		// конструкција објекта са задавањем аргумената
		krug1 = new Krug(10, 13, 11);
		krug2 = new Krug(17, 20, 4);
		kvadrat1 = new Kvadrat(23,-5, 10);
	}

	/**
	 * Metod translirajSve translira sve komponente crteza za dati vetor
	 * @param dx x-komponenta vektora translacije
	 * @param dy y-komponenta vektora translacije
	 */
	void translirajSve(int dx, int dy) {
		// стање круга (cx, cy, r) није директна надлежност цртежа
		// тако да цртеж позивом метода transliraj 
		// "замоли" круг да ажурира своје стање
		krug1.transliraj(dx, dy);
		// ако би се програмер касније одлучио да измени структуру круга
		// нпр. да уместо са (cx, cy, r) буде описан квадратом у који је уписан круг
		// цртеж не мора и не треба да буде свестан ове промене
		krug2.transliraj(dx, dy);
		// ако би се програмер касније одлучио да измени структуру квадрата
		// нпр. да уместо са (dlx, dyl, a) буде описан координатама крајва дијагонале
		// цртеж не мора и не треба да буде свестан ове промене
		kvadrat1.transliraj(dx,dy);
	}
	
	void prikazi() {
		// текстуална репрезентација (немамо ГУИ)
		krug1.prikazi();
		krug2.prikazi();
		kvadrat1.prikazi();
	}
}
