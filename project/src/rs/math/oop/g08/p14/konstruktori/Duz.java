package rs.math.oop.g08.p14.konstruktori;

public class Duz {
	Tacka a, b;

	public Duz() {
		a = new Tacka(0, 0);
		b = new Tacka(0, 0);
	}

	public Duz(Tacka a, Tacka b) {
		this.a = a; // као и код метода, this разрешава именских конфликт
		this.b = b;
	}

	public Duz(int ax, int ay, int bx, int by) {
		this(new Tacka(ax, ay), new Tacka(bx, by)); // позив конструктора изнад
	}
	
	@Override
	public String toString() {
		return "{"+a+", "+b+"}";
	}

	public static void main(String[] args) {
		Duz d1 = new Duz(new Tacka(2, 3), new Tacka(5, 4));
		Duz d2 = new Duz(2, 3, 5, 4);
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(Tacka.brojKreiranihTacaka);
	}
}
