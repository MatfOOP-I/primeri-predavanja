package rs.math.oop.g06.p06.ponoviNisku;

public class PonoviNisku {

	public static void main(String[] args) {
		String s = "Тест";
		int n = 10_000;
		long pocetak = System.nanoTime();
		String sn = "";
		for(int i=0; i<n; i++)
			sn+=s;
		System.out.println(sn);
		System.out.printf("%nВреме \t%.2f%n", (System.nanoTime() - pocetak) / 1e6);
	}
}
