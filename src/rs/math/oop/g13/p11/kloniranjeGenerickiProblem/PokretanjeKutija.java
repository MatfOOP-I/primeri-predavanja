package rs.math.oop.g13.p11.kloniranjeGenerickiProblem;

public class PokretanjeKutija
{
	
	
	public static void main( String[] args )
	{
		Student pera = new Student("Петар", "Петровић");
		Kutija<Student> kutija1 = new Kutija<>(pera);
		Kutija<Student> kutija2 = new Kutija<>(pera);
		System.out.println(kutija1 + ", " + kutija2);

		pera.postaviIme( "Жарко" );
		System.out.println(kutija1 + ", " + kutija2);

		kutija2.uzmiIzKutije().postaviIme( "Митар" );
		System.out.println(kutija1 + ", " + kutija2);

		kutija1.uzmiIzKutije().postaviPrezime("Митровић");
		System.out.println(kutija1 + ", " + kutija2);
	}
	
}
