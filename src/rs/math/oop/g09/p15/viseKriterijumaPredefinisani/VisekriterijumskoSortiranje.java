package rs.math.oop.g09.p15.viseKriterijumaPredefinisani;

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
			System.out.print( x + " " );
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
		Arrays.sort(celiBrojevi, new ParNeparComparator());
		System.out.println("После пар-непар сортирања:");
		prikazi(celiBrojevi);

		String[] niske = { "Паја", "Мики", "Шиља", "Аладин", "Снежана",
				"Херкулес",	"Ариел", "Мандрак", "Банана-Мен" };
		System.out.printf( "%nПре сортирања:%n" );
		prikazi(niske);
		Arrays.sort( niske );
		System.out.println( "После подразумеваног сортирања (лексикографски)" );
		prikazi(niske);
		Comparator c = new BrojSamoglasnikaComparator();
		Arrays.sort( niske, c );
		System.out.println( "После сортирања по броју самогласника" );
		prikazi(niske);
	}
}
