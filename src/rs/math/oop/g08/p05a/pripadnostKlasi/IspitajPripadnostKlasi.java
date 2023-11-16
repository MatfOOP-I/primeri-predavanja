package rs.math.oop.g08.p05a.pripadnostKlasi;

public class IspitajPripadnostKlasi {

	public static void main(String[] args) {
		Object o = new Object();
		Kutija k = new Kutija();
		k.dubina=10;
		k.visina=2;
		k.sirina=11;
		
		System.out.println("Објекат класе Object припада класи Object");
		System.out.println(o instanceof Object);
		System.out.println("Објекат класе Object припада класи Kutija");
		System.out.println(o instanceof Kutija);
		System.out.println("Објекат класе Kutija припада класи Object");
		System.out.println(k instanceof Object);
		System.out.println("Објекат класе Kutija припада класи Kutija");
		System.out.println(k instanceof Kutija);

		o = k;
		System.out.println(k instanceof Kutija);
		o = "miki maus";
		System.out.println(o);
		// k = "miki maus";
	}
}
