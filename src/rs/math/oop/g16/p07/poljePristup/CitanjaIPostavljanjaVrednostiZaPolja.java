package rs.math.oop.g16.p07.poljePristup;

import java.lang.reflect.Field;

public class CitanjaIPostavljanjaVrednostiZaPolja
{
	public static void main( String[] argumenti )
	{
		Zaposleni prvi = new Zaposleni( "Miki Maus", 15 );
		Zaposleni drugi = new Zaposleni( "Paja Patak", 16 );
		System.out.println( prvi + ",\r\n" + drugi );

		Class<?> klasa = prvi.getClass();
		Field prvoDeklarisanoPolje = klasa.getDeclaredFields()[0];
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
