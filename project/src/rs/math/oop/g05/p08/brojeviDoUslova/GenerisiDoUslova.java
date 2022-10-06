package rs.math.oop.g05.p08.brojeviDoUslova;

public class GenerisiDoUslova {

	public static void main(String[] args) {
		double x;
		do {
			x = Math.random();
			System.out.println(x);
		} while (x < 0.9);
	}
}
