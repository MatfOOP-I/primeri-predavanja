package rs.math.oop.g05.p12.faktorijelBroja;

public class FaktorijelBroja {

	public static void main(String[] args) {
		long f = 1;
		int n;
		java.util.Scanner sc = new java.util.Scanner(System.in);		
		System.out.println("Унеcите ненегативан цео број");
		n = sc.nextInt();
		if (n < 0)
			System.out.println("Унети број је негативан.");
		else {
			for (int k = 1; k <= n; k++)
				f *= k;
			System.out.println("Факторијел је " + f);
		}
		
	}
}
