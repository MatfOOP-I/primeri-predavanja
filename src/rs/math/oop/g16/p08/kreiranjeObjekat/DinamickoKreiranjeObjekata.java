package rs.math.oop.g16.p08.kreiranjeObjekat;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class DinamickoKreiranjeObjekata
{
	public static void main( String[] argumenti )
	{
		Class<?> klasa = Zaposleni.class;
		try
		{
			Constructor<?> c = klasa.getDeclaredConstructors()[0];
			Object dule = c.newInstance( "Dusko Dugousko", 1000 );
			System.out.println( dule );
			Field ime = klasa.getDeclaredField( "ime" );
			ime.setAccessible( true );
			System.out.println( ime.get( dule ) );
			ime.set( dule, "Patak Daca" );
			System.out.println( dule );	
		}
		catch (InstantiationException | IllegalAccessException
				| InvocationTargetException | NoSuchFieldException
				| SecurityException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
