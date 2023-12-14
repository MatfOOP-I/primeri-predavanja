package rs.math.oop.g16.p10.enumiDaniUNedelji;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;

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

	@Override
	public String toString() {
		return naziv;
	}
	public static DanUNedelji[] values() {
		List<DanUNedelji> result = new ArrayList<DanUNedelji>();
		try{
			Class<?> cl = DanUNedelji.class;
			Field[] polja = cl.getDeclaredFields();
			for(Field polje: polja) {
				Class<?> poljeTip = polje.getType();
				String poljeIme = polje.getName();
				int poljeModifikatori = polje.getModifiers();
				if (Modifier.isStatic(poljeModifikatori)  && poljeTip == DanUNedelji.class)
					result.add( (DanUNedelji)polje.get(null) );
			}
		}
		catch(IllegalAccessException exp) {
			throw new IllegalArgumentException();
		}
		return result.toArray(new DanUNedelji[0]);
	}

	public static DanUNedelji valueOf(String ime) throws IllegalArgumentException{
		try{
			Class<?> cl = DanUNedelji.class;
			Field[] polja = cl.getDeclaredFields();
			for(Field polje: polja) {
				Class<?> poljeTip = polje.getType();
				String poljeIme = polje.getName();
				int poljeModifikatori = polje.getModifiers();
				if (Modifier.isStatic(poljeModifikatori) && poljeIme.equals(ime)
						&& poljeTip == DanUNedelji.class)
					return (DanUNedelji)polje.get(null);
			}
			throw new IllegalArgumentException();
		}
		catch(IllegalAccessException exp) {
			throw new IllegalArgumentException();
		}
	}

	public static void main(String[] args) {
		// сличан приступ вредностима као код набројивог типа
		DanUNedelji d1 = DanUNedelji.valueOf("CETVRTAK");
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