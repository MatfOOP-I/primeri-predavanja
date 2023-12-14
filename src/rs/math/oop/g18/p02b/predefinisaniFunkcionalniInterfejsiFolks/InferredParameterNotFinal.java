package rs.math.oop.g18.p02b.predefinisaniFunkcionalniInterfejsiFolks;

public class InferredParameterNotFinal
{
	public static void main( final String[] args )
	{
		Folks.friends.forEach(ime -> {
			ime = ime.toUpperCase().concat( " " + ime );
			System.out.println( ime );
		} );
	}
}
