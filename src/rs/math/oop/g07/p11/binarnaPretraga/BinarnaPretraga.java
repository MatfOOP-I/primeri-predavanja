package rs.math.oop.g07.p11.binarnaPretraga;

public class BinarnaPretraga {

	private static void prikaziCele(int[] celi) {
		for (int x : celi)
			System.out.printf("%d ", x);
		System.out.println();
	}

	public static void main(String[] args) {
		int[] celi = { 23, -7, 5, 6, 4, 34, -23, 8, 17, 0, -2 };
		System.out.println("Пре сортирања");
		prikaziCele(celi);

		java.util.Arrays.sort(celi);
		System.out.println("Пoсле сортирања");
		prikaziCele(celi);

		System.out.print("Унесите број који се тражи: ");
		java.util.Scanner skener = new java.util.Scanner(System.in);
		int traziSe = skener.nextInt();
		skener.close();
		int pozicija = java.util.Arrays.binarySearch(celi, 0, celi.length, traziSe);
		if (pozicija >= 0)
			System.out.printf("Тражени број се налази у низу, на позицији %d.", 
					 pozicija);
		else {
			System.out.printf("Тражени број %d се не налази у низу.\n", traziSe);
			System.out.printf("Да би се сачувала уређеност низа, " 
			+ "треба га убацити на (нула базирани) индекс %d.",
					-(pozicija + 1));
		}
	}

}