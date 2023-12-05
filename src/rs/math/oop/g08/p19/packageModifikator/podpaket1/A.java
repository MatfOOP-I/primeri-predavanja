package rs.math.oop.g08.p19.packageModifikator.podpaket1;

class A {

	int polje;
	
	A() {
	}
	
	void metod() {
		this.polje = 10;
	}
	
	void testiraj() {
		polje = 10;
		metod();
		A a = new A();
		a.polje = 20;
		a.metod();
	}
	
	public static void main(String[] args) {
		A a = new A();
		a.polje = 20;
		a.metod();
	}
}
