package rs.math.oop.g06.p03.pozivanjeSakupljacaOtpadaka;

public class PozoviBezPozivaGC {

	static void stanjeMemorije() {
		long slobodno = Runtime.getRuntime().freeMemory() / 1024 / 1024;
		long raspolozivo = Runtime.getRuntime().totalMemory() / 1024 / 1024;
		long maksimalno = Runtime.getRuntime().maxMemory() / 1024 / 1024;
		System.out.printf("%dMB од %dMB од %dMB | ", slobodno, raspolozivo, maksimalno);
	}

	public static void main(String[] args) {
		int n = 10_000_000;
		int nIspis = 300_000;

		String s;
		long pocBezGC = System.nanoTime();
		System.out.println(
				"Величине слободне меморије без позивања gc() пред испис");
		for (int i = 0; i < n; i++) {
			s = new String("Текст под редним бројем " + i);
			if (i % nIspis == 0)
				stanjeMemorije();
		}
		System.out.printf("%nВреме без GC\t%.2f%n", 
				(System.nanoTime() - pocBezGC) / 1e6);

	}
}
