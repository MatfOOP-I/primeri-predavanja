package rs.math.oop.g06.p06.ponoviNisku;

public class PonoviNisku {

	public static void main(String[] args) {
		String s = "Тест";
		int n = 1000;
		String sn = "";
		long pocetak = System.nanoTime();
		for(int i=0; i<n; i++)
			sn += s;
		long kraj = System.nanoTime();
		System.out.println(sn);
		System.out.printf("%f", (kraj-pocetak)/1_000_000.00);
	}
}
