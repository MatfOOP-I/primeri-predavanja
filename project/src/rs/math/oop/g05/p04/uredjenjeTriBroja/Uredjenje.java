package rs.math.oop.g05.p04.uredjenjeTriBroja;

public class Uredjenje {
	public static void main(String[] args) {
		double a, b, c, pom;
		a = Math.random();
		b = Math.random();
		c = Math.random();
		System.out.println("Генерисани cу бројеви: ");
		System.out.println("" + a + "  " + b + "  " + c);
		// Уређивање
		if (b < a) {
			pom = a;
			a = b;
			b = pom;
		}
		if (c < a) {
			pom = a;
			a = c;
			c = pom;
		}
		// Сада се у a налази најмањи од генерисаних бројева
		if (c < b) {
			pom = b;
			b = c;
			c = pom;
		}
		// Сада је у b мања или једнака вредност од оне у c
		System.out.println("Након уређења добијамо:");
		System.out.println("a=" + a + "  b=" + b + "  c=" + c);
	}
}
