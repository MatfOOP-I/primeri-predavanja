package rs.math.oop.g05.p03.minimumDvaBroja;

public class Min2 {
	public static void main(String[] args) {
		System.out.println("Унеcи 2 цела броја");
		java.util.Scanner skener = new java.util.Scanner(System.in);
		int a;
		a = skener.nextInt();
		int b;
		b = skener.nextInt();
		System.out.println("Унети бројеви cу: " + a + " и " + b);
		int min;
		if (a < b)
			min = a;
		else
			min = b;
		System.out.println("Мин=" + min);
	}
}
