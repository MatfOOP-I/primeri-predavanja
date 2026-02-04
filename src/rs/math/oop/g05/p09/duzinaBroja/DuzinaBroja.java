package rs.math.oop.g05.p09.duzinaBroja;

public class DuzinaBroja {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Унесите цео број");
		long n = sc.nextLong();
		int osnova = 21;
		int duzina = 0;
		do {
			System.out.print("" + (n % osnova) + " " );
			n /= osnova;
			duzina++;
		} while (n != 0);
		System.out.println("\nДужина учитаног броја је: " + duzina);
	}
}
