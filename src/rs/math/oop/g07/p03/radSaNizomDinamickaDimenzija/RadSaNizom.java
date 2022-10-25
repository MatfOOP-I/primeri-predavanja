package rs.math.oop.g07.p03.radSaNizomDinamickaDimenzija;

public class RadSaNizom {
	public static void main(String[] args) {
		java.util.Scanner skener = new java.util.Scanner(System.in);
		System.out.println("Унесите димензију низа: ");
		int n = skener.nextInt();
		if (n <= 0) {
			System.err.println("Некоректна димензија.");
			System.exit(1);
		}
		// сви низови у Јави су динамички алоцирани па није битно да ли је
		// димензија низа била позната у фази компилације или тек приликом извршавања
		double[] niz = new double[n];
		System.out.println("Унесите вредност елемента: ");
		double x = skener.nextDouble();
		skener.close();
		for (int i = 0; i < niz.length; i++)
			niz[i] = x;
		for (double d : niz)
			System.out.printf("%8.2f ", d);
		System.out.println();
	}
}