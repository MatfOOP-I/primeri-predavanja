package rs.math.oop.g06.p03.pozivanjeSakupljacaOtpadaka;

public class PozoviSaGCCollect {

	static void stanjeMemorije() {
		long slobodno = Runtime.getRuntime().freeMemory() / 1024 / 1024;
		long maksimalno = Runtime.getRuntime().totalMemory() / 1024 / 1024;
		System.out.printf("%dMB од %dMB | ", slobodno, maksimalno);
	}

	public static void main(String[] args) {
		int n = 10_000_000;
		int nIspis = 1_000_000;
		String s;

		long pocSaGC = System.nanoTime();
		System.out.println(
				"Величине слободне меморије са позивањем gc() пред испис");
		for (int i = 0; i < n; i++) {
			s = new String("Текст под редним бројем " + i);
			if (i % nIspis == 0) {
				// експлицитно позивање скупљања отпадака
				// изазива смањење перформанси
				stanjeMemorije();
				System.gc();
			}
		}
		System.out.printf("%nВреме са GC\t%.2f%n", 
				(System.nanoTime() - pocSaGC) / 1e6);
	}
}
