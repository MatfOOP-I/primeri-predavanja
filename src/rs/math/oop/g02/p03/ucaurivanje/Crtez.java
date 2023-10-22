package rs.math.oop.g02.p03.ucaurivanje;

class Crtez {
	private Krug krug1;
	private Krug krug2;
	
	public Crtez() {
		// конструкција објекта са задавањем аргумената
		krug1 = new Krug(10, 12, 11);
		krug2 = new Krug(17, 20, 4);
	}
	
	void translirajSve(int dx, int dy) {
		// стање круга (cx, cy, r) није директна надлежност цртежа
		// тако да цртеж позивом метода transliraj 
		// "замоли" круг да ажурира своје стање
		krug1.transliraj(dx, dy);
		// ако би се програмер касније одлучио да измени структуру круга
		// нпр. да уместо са (cx, cy, r) буде описан квадратом у који је уписан круг
		// цртеж не мора и не треба да буде свестан ове промене
		krug2.transliraj(dx, dy);
	}
	
	void prikazi() {
		// текстуална репрезентација (немамо ГУИ)
		krug1.prikazi();
		krug2.prikazi();
	}
}
