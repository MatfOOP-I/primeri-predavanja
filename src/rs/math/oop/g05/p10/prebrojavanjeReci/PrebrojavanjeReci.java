package rs.math.oop.g05.p10.prebrojavanjeReci;

public class PrebrojavanjeReci {
	public static void main(String[] args) {
		java.util.Scanner ulaz = new java.util.Scanner(System.in);
		String s;
		int n = 0, bp = 0, bm = 0, bf = 0;

		System.out.println("Унесите текст (за завршетак: КРАЈ)");
		do {
			s = ulaz.next();
			n++;
			if (s.equals("програмирање"))
				bp++;
			else if (s.equals("математика"))
				bm++;
			else if (s.equals("физика"))
				bf++;
		} while (!s.equals("КРАЈ"));
		System.out.println("Број учитаних речи " + n);
		System.out.println("Број појава речи 'програмирање'  је: " + bp);
		System.out.println("Број појава речи 'математика'  је: " + bm);
		System.out.println("Број појава речи 'физика'  је: " + bf);
	}
}
