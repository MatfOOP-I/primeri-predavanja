package rs.math.oop.g07.p04.frekvencijeBrojeva;

public class FrekvencijeBrojevaRazdvojenoGlobalniPodaci {
	static int[] rezultati = {7, 3, 4, 9, 7, 6, 3, 10, 5, 6, 4, 3, 3, 3, 2, 5, 7, 9, 1};
	static int[] brojPojava;
	static int min;
	static int max;

	static void izracunajFrekfencije() {
		min = rezultati[0];
		max = rezultati[0];
		for (int x : rezultati)
			if (x > max)
				max = x;
			else if (x < min)
				min = x;
		brojPojava = new int[max - min + 1];
		for (int i = 0; i < brojPojava.length; i++)
			brojPojava[i] = 0;
		for (int x : rezultati)
			brojPojava[x - min]++;
	}

	static void prikaziFrekfencijeNumericki() {
		for (int i = 0; i < brojPojava.length; i++)
			System.out.printf("%d:%d\t", (i + min), brojPojava[i]);
	}

	static void prikaziFrekfencijeGraficki() {
		for (int i = 0; i < brojPojava.length; i++) {
			System.out.printf("%3d:", i + min);
			for (int j = 0; j < brojPojava[i]; j++)
				System.out.print("*");
			System.out.println();
		}
	}

	public static void main(String[] args) {
		izracunajFrekfencije();
		System.out.println();
		prikaziFrekfencijeNumericki();
		System.out.printf("\n\n");
		prikaziFrekfencijeGraficki();
	}
}
