package rs.math.oop.g05.p18.unosBrojevaBreak;

public class UnosBrojevaBreak {

	public static void main(String[] args) {
			java.util.Scanner ulaz = new java.util.Scanner(System.in);
			glavni:
			for(int iter=1; iter<=3; iter++) {
				System.out.println("Итерација број " + iter);
				int x, suma = 0;
				// бесконачни while циклус
				while (true) {
					x = ulaz.nextInt();
					if (x < 0)
						break; // моментални прекид циклуса
					if( x==0 ) // katastrofa!
						break glavni;
					suma += x;
				}
				System.out.println("Сума бројева је " + suma);
			}
	}
}
