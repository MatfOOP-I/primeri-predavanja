package rs.math.oop.g08.p19.protectedModifikator.podpaket1;

public class A {

	protected int polje;
	
	protected A() {
		
	}
	
	protected void metod() {
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
