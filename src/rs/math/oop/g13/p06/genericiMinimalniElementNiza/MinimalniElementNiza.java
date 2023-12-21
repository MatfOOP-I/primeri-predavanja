package rs.math.oop.g13.p06.genericiMinimalniElementNiza;

public class MinimalniElementNiza {

	public static <T extends Comparable<T>> T nadjiMinimum(T[] niz) {
		if( niz == null)
			throw new NullPointerException();
		if (niz.length == 0)
			throw new RuntimeException("Низ је празан - минимум нема смисла.");
		T minimum = niz[0];
		for (T element : niz)
			if (element.compareTo(minimum) < 0)
				minimum = element;
		return minimum;
	}

	public static void main(String[] args) {
		String[] stringovi = new String[] { "Паја", "Ана", "Мика", "Марија", "Пера" };
		String minString = nadjiMinimum(stringovi);
		System.out.println(minString);
		UredjeniPar<Integer, Integer>[] parovi =
				(UredjeniPar<Integer, Integer>[]) new UredjeniPar[] {
						new UredjeniPar<>(46, 21),
						new UredjeniPar<>(10, 21),
						new UredjeniPar<>(10, 19),
						new UredjeniPar<>(15, 21),
				};
		UredjeniPar<Integer, Integer> minPar = nadjiMinimum(parovi);
		System.out.println(minPar);
	}

}