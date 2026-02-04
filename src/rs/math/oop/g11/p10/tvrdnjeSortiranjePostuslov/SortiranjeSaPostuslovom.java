package rs.math.oop.g11.p10.tvrdnjeSortiranjePostuslov;

// покренути програм са аргументом виртуелне машине (VM):
// -еа
public class SortiranjeSaPostuslovom {

	public static void main(String[] args) {
		int[] niz = { 20, 91, -6, 16, 0, 7, 51, 42, 3, 1 };
		for (int e : niz)
			System.out.printf("%d ", e);
		System.out.println();
		//sortiraj(niz);
		//for (int e : niz)
		//	System.out.printf("%d ", e);
		//System.out.println();
		assert jeSortiran(niz) : "низ није сортиран";
		for (int e : niz)
			System.out.printf("%d ", e);
		System.out.println();
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
	}
}