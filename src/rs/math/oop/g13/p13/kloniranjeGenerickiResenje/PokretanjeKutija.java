package rs.math.oop.g13.p13.kloniranjeGenerickiResenje;

public class PokretanjeKutija {

	public static void main(String[] args) {
		Student pera = new Student("Petar", "Petrovic");
		Kutija<Student> kutija1 = new Kutija<>(pera);
		Kutija<Student> kutija2 = new Kutija<>(pera);
		System.out.println(pera + ", " + kutija1 + ", " + kutija2);

		pera.setIme("Zarko");
		System.out.println(pera + ", " + kutija1 + ", " + kutija2);

		kutija1.uzmiIzKutije().setIme("Mitar");
		System.out.println(pera + ", " + kutija1 + ", " + kutija2);

		kutija2.uzmiIzKutije().setPrezime("Mitrovic");
		System.out.println(pera + ", " + kutija1 + ", " + kutija2);
	}

}
