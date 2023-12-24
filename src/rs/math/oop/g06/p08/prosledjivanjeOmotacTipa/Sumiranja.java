package rs.math.oop.g06.p08.prosledjivanjeOmotacTipa;

public class Sumiranja {

	public static void main(String[] args) {
		int x = 11;

		Integer x1 = new Integer(x+1);

		Integer x2 = Integer.valueOf(x+2);

		Integer x3 = x+3;

		System.out.printf("%d, %d, %d, %d %n", x, x1, x2, x3);

		int y = x1.intValue() + x2.intValue();

		int y1 = x1+x3;

		System.out.printf("%d, %d", y, y1);

	}
}
