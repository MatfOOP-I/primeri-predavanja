package rs.math.oop.g10.p04.anonimneKlasePoredjenjePriSortiranju;

import java.util.Arrays;
import java.util.Comparator;

public class SortirajNiske {

	private static int sumaAscii(String s) {
		int suma = 0;
		for(int i=0; i<s.length(); i++)
			suma+=s.charAt(i);
		return suma;
	}
	
	public static void main(String[] args) {
		String[] niske = new String[] {"Анонимне класе", "су попут", 
				"локалних унутрашњих класа", "с тим што", "нису именоване.",
				"Ово за последицу", "   ", "има да се", "анонимна класа",
				"истовремено", "и", "дефинише и", "инстанцира.", 
				"Јасно је да се", "инстанцирање", "не може извршити", 
				"више пута,","јер не постоји назив", 
				"класе па самим тим ни конструктора."};

		for(String niska : niske)
			System.out.print(niska + "|");
		// овде би требало користити генеричке типове, али то тек од поглавља 13
		Comparator c  = new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				if(!(o1 instanceof String) || !(o2 instanceof String)) {
					System.err.println("Сви објекти морају бити ниски.");
					System.exit(1);
				}
				String s1 = (String) o1;
				String s2 = (String) o2;
				int razlikaAscii = sumaAscii(s1)-sumaAscii(s2);
				if(razlikaAscii==0)
					return s1.compareTo(s2); // стандардно лексикографско
				else
					return razlikaAscii;
			}
		};
		Arrays.sort(niske, c);
		System.out.println();
		for(String niska : niske)
			System.out.print(niska + "|");
		Arrays.sort(niske, new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {

				return o2.toString().length()-o1.toString().length();
			}
		});
		System.out.println();
		for(String niska : niske)
			System.out.print(niska + "|");
//		Arrays.sort(niske, (o1, o2) -> o1.toString().length()-o2.toString().length());
//		System.out.println();
//		for(String niska : niske)
//			System.out.print(niska + "|");
	}
}
