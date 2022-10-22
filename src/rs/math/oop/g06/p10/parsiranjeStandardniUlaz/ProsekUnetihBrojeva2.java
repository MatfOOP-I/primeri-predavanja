package rs.math.oop.g06.p10.parsiranjeStandardniUlaz;

public class ProsekUnetihBrojeva2 {

	public static void main(String[] args) {
		java.util.Scanner skener = new java.util.Scanner(System.in);
		double suma = 0;
		int n = 0;
		while(skener.hasNext()) {
			double b = skener.nextDouble();
			n++;
			suma += b;
		}
		System.out.println(String.format("Просек унетих бројева је: %.2f", suma / n));
		skener.close();
	}
}
