package rs.math.oop.g07.p03.radSaNizomDinamickaDimenzija;

public class RadSaNizom {
	public static void main(String[] args) {
		java.util.Scanner skener = new java.util.Scanner(System.in);
		System.out.println("Унесите број елемената низа: ");
		int n = skener.nextInt();
		skener.close();
		if (n <= 0) {
			System.err.println("Некоректан број елемената.");
			System.exit(1);
		}
		// сви низови у Јави су динамички алоцирани па није битно да ли је
		// број елемената познат у фази компилације или тек приликом извршавања
		double[] niz = new double[n];
		double x = -23.34e1;
		for (int i = 0; i < niz.length; i++)
			niz[i] = x;
		for (double d : niz)
			System.out.printf("%8.2f ", d);
		System.out.println();
	}
}