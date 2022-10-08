package rs.math.oop.g11.p03.izuzeciSprecavanjeIndeksaVanGranica;

import java.util.Scanner;

public class SprecavanjeIndeksaVanGranica {

	public static void main(String[] args) {
		int a[] = new int[] { 1, 2, 3, 4, 5 };
		System.out.println("Унесите индекс елемента којем приступате:");
		Scanner skener = null;
		skener = new Scanner(System.in);
		int i = skener.nextInt();
		if (i < 0 || i >= a.length)
			System.err.println("Индекс ван граница.");
		else
			System.out.println("Број на траженом индексу је " + a[i]);
		skener.close();
	}
}