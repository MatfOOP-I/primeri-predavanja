package rs.math.oop.g05.p16.funkcijaKorenaNaIntervalu;

public class KorenNaIntervalu {

	public static void main(String[] args) {

		for (double x = 0; x <= 1.0; x += 0.1) {
			double y = Math.sqrt(x);
			System.out.println("sqrt(" + x + ") = " + y);
		}
	}
}
