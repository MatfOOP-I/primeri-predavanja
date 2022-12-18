package rs.math.oop.g13.p10.kloniranjeGenerickiProblem.z01.kutijaMutabilnost;

public class PokretanjeKutija
{
	
	
	public static void main( String[] args )
	{
		Student pera = new Student("Petar", "Petrovic");
		Kutija<Student> kutija = new Kutija<>(pera);
		Kutija<Student> kutija2 = new Kutija<>(pera);
		System.out.println(kutija + ", " + kutija2);

		pera.setIme( "Zarko" );
		System.out.println(kutija + ", " + kutija2);

		kutija2.getUKutiji().setIme( "Mitar" );
		System.out.println(kutija + ", " + kutija2);

		kutija.getUKutiji().setPrezime("Mitrovic");
		System.out.println(kutija + ", " + kutija2);
	}
	
}
