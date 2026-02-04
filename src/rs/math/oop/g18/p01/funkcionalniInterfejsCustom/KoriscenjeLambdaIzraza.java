
package rs.math.oop.g18.p01.funkcionalniInterfejsCustom;

public class KoriscenjeLambdaIzraza
{

	public static void main( final String[] args )
	{
		Interfejs1 sample1 = input -> {int x = input*input; return x % 2 == 0;};
		Interfejs2 sample2 = input -> {int y = input*input; return y % 2 == 1;};
		
		System.out.println( sample1.test( 4 ) );
		System.out.println( sample2.test( 4 ) );
		System.out.println( sample1.test( 5 ) );
		System.out.println( sample2.test( 5 ) );
	}
}
