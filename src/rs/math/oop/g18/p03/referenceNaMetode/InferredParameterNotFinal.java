package rs.math.oop.g18.p03.referenceNaMetode;

public class InferredParameterNotFinal
{
	public static void main( final String[] args )
	{
		Folks.friends.forEach(ime -> {
			ime = ime.toUpperCase();
			System.out.println( ime );
		} );
	}
}
