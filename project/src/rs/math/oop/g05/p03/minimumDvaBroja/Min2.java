package rs.math.oop.g05.p03.minimumDvaBroja;

public class Min2 {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int a, b, min;
		System.out.println("Унеcи 2 цела броја");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("Унети бројеви cу: " + a + " и " + b);
		if (a < b)
			min = a;
		else
			min = b;
		System.out.println("Мин=" + min);
	}
}
