package rs.math.oop.g05.p09.duzinaBroja;

public class DuzinaBroja {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		long n;
		int duzina = 0;
		System.out.println("Унесите цео број");
		n = sc.nextInt();
		do {
			n /= 10;
			duzina++;
		} while (n != 0);
		System.out.println("Дужина учитаног броја је: " + duzina);
	}
}
