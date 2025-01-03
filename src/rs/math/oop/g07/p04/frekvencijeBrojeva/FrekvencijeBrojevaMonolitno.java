package rs.math.oop.g07.p04.frekvencijeBrojeva;

public class FrekvencijeBrojevaMonolitno {

	public static void main(String[] args) {
		int[] rezultati = { 3, 7, 3, 4, 9, 7, 6, 3, 1, 5, 6, 4, 3, 3, 3, 3, 2, 5, 7, 9, 1 };
		int granica = 10;
		int[] brojPojava = new int[granica];
		// иницијализација
		for (int i = 0; i < brojPojava.length; i++)
			brojPojava[i] = 0;
		// пребројавање
		for (int x : rezultati)
			brojPojava[(x - 1)]++;
		// нумерички приказ
		for (int i = 0; i < brojPojava.length; i++)
			System.out.printf("%d->%d\t", (i + 1), brojPojava[i]);
		System.out.printf("\n\n");
		// графички приказ
		for (int i = 0; i < brojPojava.length; i++) {
			System.out.printf("%3d:", i + 1);
			for (int j = 0; j < brojPojava[i]; j++)
				System.out.print("*");
			System.out.println();
		}
	}
}
