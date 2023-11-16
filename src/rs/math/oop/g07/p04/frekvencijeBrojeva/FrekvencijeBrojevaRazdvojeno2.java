package rs.math.oop.g07.p04.frekvencijeBrojeva;

public class FrekvencijeBrojevaRazdvojeno2 {
	static int[] izracunajFrekfencije(int[] rezultati, int dimenzija) {
		int[] frekfencije = new int[dimenzija];
		for (int i = 0; i < frekfencije.length; i++)
			frekfencije[i] = 0;
		for (int x : rezultati)
			frekfencije[(x - 1)]++;
		return frekfencije;
	}

	static void prikaziFrekfencijeNumericki(int[] frekfencije) {
		for (int i = 0; i < frekfencije.length; i++)
			System.out.printf("%d:%d  ", (i + 1), frekfencije[i]);
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
		int[] rezultati = { 7, 3, 4, 9, 7, 6, 12, 10, 5, 6, 4, 11, 3, 3, 2, 5, 7, 9, 1 };
		int granica = 13;
		int[] brojPojava = izracunajFrekfencije(rezultati, granica);
		System.out.println();
		prikaziFrekfencijeNumericki(brojPojava);
		System.out.printf("\n\n");
		prikaziFrekfencijeGraficki(brojPojava);
	}
}