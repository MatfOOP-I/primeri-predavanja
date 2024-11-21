package rs.math.oop.g06.p10.parsiranjeStandardniUlaz;

public class ProsekUnetihBrojeva {

	public static void main(String[] args) {
		java.util.Scanner ulaz = new java.util.Scanner(System.in);
		System.out.println("Колико бројева уносите: ");
		int n = ulaz.nextInt();
		double prosek = 0;
		for (int i = 0; i < n; i++) {
			System.out.print("Број " + (i + 1) + ": ");
			double b = ulaz.nextDouble();
			System.out.printf("%2f%n",b);
			prosek += b;
		}
		prosek /= n;
		System.out.println(String.format("Просек бројева је: %.2f", prosek));
		ulaz.close();
	}
}
