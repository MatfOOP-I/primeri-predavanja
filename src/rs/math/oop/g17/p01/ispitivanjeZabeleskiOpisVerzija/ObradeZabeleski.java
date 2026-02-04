package rs.math.oop.g17.p01.ispitivanjeZabeleskiOpisVerzija;

import java.lang.reflect.Method;

//Applying annotation to the class
@Opis( autor = "Mitar", datum = "1.4.2016" )
@Verzija( minor = 6 )
public class ObradeZabeleski
{
	// Applying annotation to the method
	@Opis( datum = "15.4.2023" )
	@Verzija( major = 12, minor = 7 )
	public static void testMethod()
	{
		System.out.println( "Welcome to Java" );
		System.out.println( "This is an example of Annotations" );
		System.out.println( "--------------------------" );
	}
	
	public static void main( String args[] )
	{
		testMethod();
		showAnnotations();
	}
	
	public static void showAnnotations()
	{
		ObradeZabeleski test = new ObradeZabeleski();
		try
		{
			Class<?> c = test.getClass();
			System.out.println( "Name of the class: " + c.getName() );
			Opis annotOpis = c.getAnnotation( Opis.class );
			System.out.println( "Author of the class: " + annotOpis.autor() );
			System.out.println( "Date of Writing the class: " + annotOpis.datum() );
			Verzija anotVerzija = c.getAnnotation( Verzija.class );
			System.out.println( "Version of the class: " + anotVerzija.major()
					+ "." + anotVerzija.minor() );
			
			Method m = c.getMethod( "testMethod" );
			System.out.println( "Name of the method: " + m.getName() );
			Opis anotDescMet = m.getAnnotation( Opis.class );
			System.out.println( "Author of the method: " + anotDescMet.autor() );
			System.out.println( "Date of Writing the method: " + anotDescMet.datum() );
			Verzija anotVerMet = m.getAnnotation( Verzija.class );
			System.out.println( "Version of the method: " + anotVerMet.major()
					+ "." + anotVerMet.minor() );
		}
		catch (NoSuchMethodException ex)
		{
			System.out.println( "Invalid Method..." + ex.getMessage() );
		}
	}
}
