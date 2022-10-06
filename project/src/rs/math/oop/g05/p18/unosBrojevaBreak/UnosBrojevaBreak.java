package rs.math.oop.g05.p18.unosBrojevaBreak;

public class UnosBrojevaBreak {

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int x, suma = 0;
		// бесконачни while циклус
		while (true) {
			x = sc.nextInt();
			if (x < 0)
				break; // моментални прекид циклуса
			suma += x;
		}
		System.out.println("Сума бројева је " + suma);
	}
}
