package rs.math.oop.g06.p04.izlazIzAplikacije;

public class IzadjiIzAplikacije {

	static void karakteristikeMonitora(int sirina, int visina) {
		if (sirina <= 0 || visina <= 0) {
			System.err.println("Ширина и висина морају бити позитивни.");
			// излазимо из целог програма, а не само методе као код return
			System.exit(1);
		}
		System.out.println("Ширина:\t" + sirina);
		System.out.println("Висина:\t" + visina);
		System.out.println("Број тачака:\t" + sirina * visina);
		System.out.println("Тип монитора:\t" + 
		(sirina >= 2 * visina ? "широки" : "стандардни"));
	}

	public static void main(String[] args) {
		karakteristikeMonitora(1024, 1024);
		karakteristikeMonitora(1920, 768);
		karakteristikeMonitora(0, 230);
		karakteristikeMonitora(2500, 800);
		// није неопходно ставити на крају програма, али не смета
		System.exit(0);
	}
}
