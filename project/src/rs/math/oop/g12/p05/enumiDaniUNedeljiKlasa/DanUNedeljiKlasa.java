package rs.math.oop.g12.p05.enumiDaniUNedeljiKlasa;

public final class DanUNedeljiKlasa {
	// статичка поља типа ове класе које симулирају вредности набројивог типа
	public static final DanUNedeljiKlasa PONEDELJAK = new DanUNedeljiKlasa("PONEDELJAK");
	public static final DanUNedeljiKlasa UTORAK = new DanUNedeljiKlasa("UTORAK");
	public static final DanUNedeljiKlasa SREDA = new DanUNedeljiKlasa("SREDA");
	public static final DanUNedeljiKlasa CETVRTAK = new DanUNedeljiKlasa("CETVRTAK");
	public static final DanUNedeljiKlasa PETAK = new DanUNedeljiKlasa("PETAK");
	public static final DanUNedeljiKlasa SUBOTA = new DanUNedeljiKlasa("SUBOTA");
	public static final DanUNedeljiKlasa NEDELJA = new DanUNedeljiKlasa("NEDELJA");

	private final String naziv;
	private final int redniBroj;
	private static int brojInstanci = 0;

	private DanUNedeljiKlasa(String naziv) {
		this.naziv = naziv;
		this.redniBroj = brojInstanci;
		brojInstanci++;
	}

	public int ordinal() {
		return redniBroj;
	}

	public String name() {
		return naziv;
	}

	public static DanUNedeljiKlasa[] values() {
		return new DanUNedeljiKlasa[] { PONEDELJAK, UTORAK, SREDA, CETVRTAK, PETAK, SUBOTA, NEDELJA };
	}

	@Override
	public String toString() {
		return naziv;
	}

	public static void main(String[] args) {
		// сличан приступ вредностима као код набројивог типа
		DanUNedeljiKlasa d1 = DanUNedeljiKlasa.CETVRTAK;
		DanUNedeljiKlasa d2 = DanUNedeljiKlasa.UTORAK;
		DanUNedeljiKlasa d3 = DanUNedeljiKlasa.CETVRTAK;
		System.out.println(d1.name());
		// аутоматска додела целобројних вредности
		System.out.println(d1.ordinal());
		// различите вредности
		System.out.println(d1 == d2);
		// исте вредности - показују чак и на исту меморију
		System.out.println(d1 == d3);
		// списак вредности
		for (DanUNedeljiKlasa d : DanUNedeljiKlasa.values())
			System.out.println(d);
	}
}