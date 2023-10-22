package rs.math.oop.g07.p04.frekvencijeBrojeva;

public class FrekvencijeBrojevaRazdvojeno {
	static void izracunajFrekfencije(int[] rezultati, int[] frekfencije) {
		for (int i = 0; i < frekfencije.length; i++)
			frekfencije[i] = 0;
		for (int x : rezultati)
			frekfencije[(x - 1)]++;
	}

	static void prikaziFrekfencijeNumericki(int[] frekfencije) {
		for (int i = 0; i < frekfencije.length; i++)
			System.out.printf("%d:%d\t", (i + 1), frekfencije[i]);
	}

	static void prikaziFrekfencijeGraficki(int[] frekfencije) {
		for (int i = 0; i < frekfencije.length; i++) {
			System.out.printf("%3d:", i + 1);
			for (int j = 0; j < frekfencije[i]; j++)
				System.out.print("*");
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int[] rezultati = { 7, 3, 4, 9, 7, 6, 3, 10, 5, 6, 4, 3, 3, 3, 2, 5, 7, 9, 1 };
		int granica = 10;
		int[] brojPojava = new int[granica];
		izracunajFrekfencije(rezultati, brojPojava);
		System.out.println();
		prikaziFrekfencijeNumericki(brojPojava);
		System.out.printf("\n\n");
		prikaziFrekfencijeGraficki(brojPojava);
	}
}