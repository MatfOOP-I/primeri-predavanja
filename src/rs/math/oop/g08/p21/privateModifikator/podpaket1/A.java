package rs.math.oop.g08.p21.privateModifikator.podpaket1;

class A {

	private int polje;
	
	private A() {
		
	}
	
	private void metod() {
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
