package rs.math.oop.g05.p13.sumaAritmetickaUnazad;

public class SumirajAritmetickiNizUnazad {

	public static void main(String[] args) {
		int s = 0;
		int n;
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Унесите ненегативан цео број");
		n = sc.nextInt();
		if (n < 0)
			System.out.println("Унети број је негативан.");
		else {
			for (int k = n; k > 0; k--)
				s += k;
			System.out.println("Сума аритметичког низа је " + s);
		}
	}
}
