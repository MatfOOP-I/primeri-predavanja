package rs.math.oop.g05.p18.unosBrojevaBreak;

public class UnosBrojevaBreak {

	public static void main(String[] args) {
			java.util.Scanner ulaz = new java.util.Scanner(System.in);
			glavni:
			for(int iter=1; iter<=3; iter++) {
				System.out.println("Итерација број " + iter);
				int suma = 0;
				// бесконачни while циклус
				while (true) {
					int x = ulaz.nextInt();
					if (x < 0)
						break; // моментални прекид унутрашњег циклуса
					if( x==0 )
						break glavni; // моментални прекид циклуса са ознаком glavni
					suma += x;
				}
				System.out.println("Сума бројева је " + suma);
			}
			for(int i=0; i<5; i++)
				System.out.println("AAA");
	}
}
