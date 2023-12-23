package rs.math.oop.g18.t17.consumerForEachFolks;

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
