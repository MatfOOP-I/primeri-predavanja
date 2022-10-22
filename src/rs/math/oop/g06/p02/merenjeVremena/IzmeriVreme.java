package rs.math.oop.g06.p02.merenjeVremena;

public class IzmeriVreme {

	public static long sumiraj(int n) {
		long suma = 0;
		for (int i = 0; i < n; i++)
			suma += i;
		return suma;
	}

	public static void main(String args[]) {
		for (int n = 10_000_000; n <= 1_000_000_000; n *= 10) {
			long pocetak1 = System.nanoTime();
			long suma = sumiraj(n);
			System.out.printf("Сума природних бројева до %d је %d%n", n, suma);
			long kraj1 = System.nanoTime();
			System.out.println("Време у ns употребом nanoTime(): " 
					+ (kraj1 - pocetak1));
			System.out.printf("Време у ms употребом nanoTime(): %.5g%s",
					(kraj1 - pocetak1) / 1_000_000.0, System.lineSeparator());

			long pocetak2 = System.currentTimeMillis();
			suma = sumiraj(n);
			System.out.printf("Сума природних бројева до %d је %d%n", n, suma);
			long kraj2 = System.currentTimeMillis();
			System.out.println("Време у ms употребом currentTimeMillis(): " 
					+ (kraj2 - pocetak2));
			System.out.println("-----------------------------------------------");
		}
	}
}
