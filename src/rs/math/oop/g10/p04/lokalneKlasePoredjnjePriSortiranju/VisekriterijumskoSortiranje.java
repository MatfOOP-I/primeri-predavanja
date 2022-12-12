package rs.math.oop.g10.p04.lokalneKlasePoredjnjePriSortiranju;

import java.util.Arrays;
import java.util.Comparator;

public class VisekriterijumskoSortiranje
{
	private static void prikazi(Integer[] niz) {
		for (int x : niz)
			System.out.print(x + " ");
		System.out.println();
	}

	private static void prikazi(String[] niz) {
		for (String x: niz)
			System.out.print(x + " ");
		System.out.println();
	}

	public static void main( String[] args )
	{
		Integer[] celiBrojevi = {-3, 24, -2, 1, 2, 0, 3, 4, -40};
		System.out.println("Пре сортирања:");
		prikazi(celiBrojevi);
		Arrays.sort(celiBrojevi);
		System.out.println("После подразуменваног сортирања (по вредности):");
		prikazi(celiBrojevi);

		class ParNeparComparator implements Comparator {
			@Override
			public int compare(Object o1, Object o2) {
				if (!(o1 instanceof Integer))
					return 1;
				if (!(o2 instanceof Integer))
					return -1;
				int i1 = ((Integer) o1).intValue();
				int i2 = ((Integer) o2);
				if (i1 % 2 == 0) {
					if (i2 % 2 == 0)
						return i1 - i2;
					else
						return -1;
				} else {
					if (i2 % 2 == 0)
						return 1;
					else
						return i1 - i2;
				}
			}

		}
		Arrays.sort(celiBrojevi, new ParNeparComparator());
		System.out.println("После пар-непар сортирања:");
		prikazi(celiBrojevi);

		String[] niske = { "Паја", "Мики", "Шиља", "Аладин", "Снежана",
				"Херкулес",	"Ариел", "Мандрак", "Банана-Мен" };
		System.out.println( "\nПре сортирања:" );
		prikazi(niske);
		Arrays.sort( niske );
		System.out.println( "После подразуменваног сортирања (лексикографски)" );
		prikazi(niske);

		class BrojSamoglasnikaComparator implements Comparator {
			private int brojSamoglasnika(String s) {
				int ret = 0;
				for (char ch : s.toCharArray())
					if ("aeiouAEIOUаеиоуАЕИОУ".indexOf(ch) >= 0)
						ret++;
				return ret;
			}

			@Override
			public int compare(Object o1, Object o2) {
				if (!(o1 instanceof String))
					return 1;
				if (!(o2 instanceof String))
					return -1;
				int razlika = brojSamoglasnika((String) o2) - brojSamoglasnika((String) o1);
				if (razlika != 0)
					return razlika;
				razlika = ((String) o1).length() - ((String) o2).length();
				if (razlika != 0)
					return razlika;
				return ((String) o1).compareTo((String) o2);
			}
		}
		Comparator c = new BrojSamoglasnikaComparator();
		Arrays.sort( niske, c );
		System.out.println( "После сортирања по броју самогласника" );
		prikazi(niske);
	}
}
