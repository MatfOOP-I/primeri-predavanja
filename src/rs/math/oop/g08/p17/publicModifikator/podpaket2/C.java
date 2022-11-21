package rs.math.oop.g08.p17.publicModifikator.podpaket2;

import rs.math.oop.g08.p17.publicModifikator.podpaket1.A;

public class C {
	
	void testirajA() {
		A a = new A();
		a.polje = 20;
		//a.testiraj();
		a.metod();	
	}
	
	public static void main(String[] args) {
		A a = new A();
		a.polje = 20;
		a.metod();	
	}
}
