package rs.math.oop.g16.p06.poljePristup;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class CitanjaIPostavljanjaVrednostiZaPolja
{
	public static void main( String[] argumenti )
	{
		Zaposleni prvi = new Zaposleni( "Miki Maus", 1500 );
		Zaposleni drugi = new Zaposleni( "Paja Patak", 1600 );
		System.out.println( prvi + ",\r\n" + drugi );

		Class<?> klasa = prvi.getClass();
		Field prvoDeklarisanoPolje = klasa.getDeclaredFields()[0];
		System.out.println( prvoDeklarisanoPolje.getName() );
		if( prvoDeklarisanoPolje.getType().isPrimitive() )
			System.out.println( "Primitivan tip podataka" );
		else
			System.out.println( "Referentni tip podataka" );
		if( Modifier.isAbstract( prvoDeklarisanoPolje.getModifiers()) )
			System.out.println( "Apstraktan tip podataka" );
		else
			System.out.println( "Nije apstraktan tip podataka" );
		if( Modifier.isPrivate( prvoDeklarisanoPolje.getModifiers()) )
			System.out.println( "Privatan tip podataka" );
		else
			System.out.println( "Nije privatan tip podataka" );
		System.out.println( prvoDeklarisanoPolje.getType() );
		prvoDeklarisanoPolje.setAccessible( true );
		try
		{
			System.out.println( prvoDeklarisanoPolje.get( prvi ) );
			System.out.println( prvoDeklarisanoPolje.get( drugi ) );
			prvoDeklarisanoPolje.set( prvi, "Mini Maus" );
			prvoDeklarisanoPolje.set(drugi, "Pata Patak");
			System.out.println(prvi + ",\r\n" + drugi);
		}
		catch (IllegalArgumentException | IllegalAccessException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
