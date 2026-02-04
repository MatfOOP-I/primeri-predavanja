package rs.math.oop.g12.p06.enumiDaniUNedeljiKlasa;

public final class DanUNedelji {
	// статичка поља типа ове класе које симулирају вредности набројивог типа
	public static final DanUNedelji PONEDELJAK = new DanUNedelji("PONEDELJAK");
	public static final DanUNedelji UTORAK = new DanUNedelji("UTORAK");
	public static final DanUNedelji SREDA = new DanUNedelji("SREDA");
	public static final DanUNedelji CETVRTAK = new DanUNedelji("CETVRTAK");
	public static final DanUNedelji PETAK = new DanUNedelji("PETAK");
	public static final DanUNedelji SUBOTA = new DanUNedelji("SUBOTA");
	public static final DanUNedelji NEDELJA = new DanUNedelji("NEDELJA");

	private final String naziv;
	private final int redniBroj;
	private static int brojInstanci = 0;

	private DanUNedelji(String naziv) {
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

	public static DanUNedelji[] values() {
		return new DanUNedelji[] { PONEDELJAK, UTORAK, SREDA, CETVRTAK, PETAK, SUBOTA, NEDELJA };
	}

	@Override
	public String toString() {
		return naziv;
	}

	public static void main(String[] args) {
		// сличан приступ вредностима као код набројивог типа
		DanUNedelji d1 = DanUNedelji.CETVRTAK;
		DanUNedelji d2 = DanUNedelji.UTORAK;
		DanUNedelji d3 = DanUNedelji.CETVRTAK;
		System.out.println(d1.name());
		// аутоматска додела целобројних вредности
		System.out.println(d1.ordinal());
		// различите вредности
		System.out.println(d1 == d2);
		// исте вредности - показују чак и на исту меморију
		System.out.println(d1 == d3);
		// списак вредности
		for (DanUNedelji d : DanUNedelji.values())
			System.out.println(d);
	}
}