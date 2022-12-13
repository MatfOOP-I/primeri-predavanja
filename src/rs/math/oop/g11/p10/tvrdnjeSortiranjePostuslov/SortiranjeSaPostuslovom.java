package rs.math.oop.g11.p10.tvrdnjeSortiranjePostuslov;

public class SortiranjeSaPostuslovom {

	// покренути програм са аргументом -еа виртуелне машине (VM)
	public static void main(String[] args) {
		int[] niz = { 20, 91, -6, 16, 0, 7, 51, 42, 3, 1 };
		System.out.println("По креирању");
		prikazi(niz);
		sortiraj(niz);
		assert jeSortiran(niz) : "низ није сортиран";
		System.out.println("\nПо сортирању");
		prikazi(niz);
		System.out.println();
	}

	private static void prikazi(int[] niz) {
		for (int e : niz)
			System.out.printf("%d ", e);
	}

	private static boolean jeSortiran(int[] x) {
		for (int i = 0; i < x.length - 1; i++)
			if (x[i] > x[i + 1])
				return false;
		return true;
	}

	// сортирање уметањем
	private static void sortiraj(int[] x) {
		int j, a;
		for (int i = 1; i < x.length; i++) {
			a = x[i];
			j = i;
			while (j > 0 && x[j - 1] > a) {
				x[j] = x[j - 1];
				j--;
			}
			x[j] = a;
		}
//		int temp = x[x.length-1];
//		x[x.length-1] = x[0];
//		x[0] = temp;
	}
}