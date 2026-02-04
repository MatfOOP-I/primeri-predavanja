package rs.math.oop.g06.p10.parsiranjeStandardniUlaz;

public class ProsekUnetihBrojeva2 {

	public static void main(String[] args) {
		java.util.Scanner ulaz = new java.util.Scanner(System.in);
		int brojBrojeva = 0;
		double prosek = 0;
		do{
			System.out.print("Број: ");
			double b = ulaz.nextDouble();
			System.out.printf("%2f%n",b);
			prosek += b;
			brojBrojeva++;
		}while( ulaz.hasNext());
		prosek /= brojBrojeva;
		System.out.println(String.format("Просек бројева је: %.2f", prosek));
		ulaz.close();
	}
}
