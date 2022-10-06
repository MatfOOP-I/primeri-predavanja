package rs.math.oop.g05.p19.unosBrojevaContinue;

public class UnosBrojevaContinue {

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int x, suma = 0;
		while (true) {
			x = sc.nextInt();
			if (x == 0)
				break; // прекидамо кад је 0
			if (x < 0)
				continue; // прескачемо негативне
			suma += x;
		}
		System.out.println("Сума позитивних бројева је " + suma);
	}
}
