package rs.math.oop.g08.p19.protectedModifikator.podpaket1;

public class B {

	void testirajA() {
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
