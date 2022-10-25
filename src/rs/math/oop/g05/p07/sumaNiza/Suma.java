package rs.math.oop.g05.p07.sumaNiza;

import java.util.Scanner;

public class Suma {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Унесите природан број");
		int n = sc.nextInt();
		if (n < 1) {
			System.out.println("Нисте унели природан број!");
			return;
		}
		double s = 0.0;
		int i = 1;
		while (i <= n) {
			s += 1.0 / (i * i * i);
			i++;
		}
		System.out.println("Тражени збир је: " + s);
	}
}