package rs.math.oop.g05.p07.sumaNiza;

public class Suma {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		double s = 0.0;
		int n, i = 1;
		System.out.println("Унесите природан број");
		n = sc.nextInt();
		if (n < 1)
			System.out.println("Нисте унели природан број!");
		else {
			while (i <= n) {
				s += 1.0 / (i * i * i);
				i++;
			}
			System.out.println("Тражени збир је: " + s);
		}
	}
}