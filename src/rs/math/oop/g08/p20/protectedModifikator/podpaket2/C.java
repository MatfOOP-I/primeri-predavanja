package rs.math.oop.g08.p20.protectedModifikator.podpaket2;

import rs.math.oop.g08.p20.protectedModifikator.podpaket1.A;

public class C extends A {
	
	void testirajA() {
		// A a = new A();
		// a.polje = 20;
		// a.metod();	
		polje = 20;
		metod();
	}
	
	public static void main(String[] args) {
		// A a = new A();
		// a.polje = 20;
		// a.metod();
		 C c = new C();
		 c.polje = 20;
		 c.metod();	
	}
}
