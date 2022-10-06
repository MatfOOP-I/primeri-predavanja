package rs.math.oop.g06.p10.parsiranjeStandardniUlaz;

public class ProsekUnetihBrojeva {

	public static void main(String[] args) {
		java.util.Scanner skener = new java.util.Scanner(System.in);
		System.out.println("Колико бројева уносите: ");
		int n = skener.nextInt();
		double prosek = 0;
		for (int i = 0; i < n; i++) {
			System.out.println("Број " + (i + 1) + ": ");
			double b = skener.nextDouble();
			prosek += b;
		}
		prosek /= n;
		System.out.println(String.format("Просек унетих бројева је: %.2f", prosek));
		skener.close();
	}
}
