package rs.math.oop.g13.p11.kloniranjeGenerickiBolje;

public class PokretanjeKutija {

	public static void main(String[] args) {
		Student pera = new Student("Petar", "Petrovic");
		Kutija<Student> kutija = new Kutija<>(pera);
		Kutija<Student> kutija2 = new Kutija<>(pera);
		System.out.println(kutija + ", " + kutija2);

		pera.setIme("Zarko");
		System.out.println(kutija + ", " + kutija2);

		kutija.getUKutiji().setIme("Mitar");
		System.out.println(kutija + ", " + kutija2);

		kutija2.getUKutiji().setPrezime("Mitrovic");
		System.out.println(kutija + ", " + kutija2);
	}

}
