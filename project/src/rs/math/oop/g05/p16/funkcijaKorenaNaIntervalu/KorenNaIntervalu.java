package rs.math.oop.g05.p16.funkcijaKorenaNaIntervalu;

public class KorenNaIntervalu {

	public static void main(String[] args) {
		double x, y;
		for (x = 0; x <= 1.0; x += 0.1) {
			y = Math.sqrt(x);
			System.out.println("sqrt(" + x + ") = " + y);
		}
	}
}
