package rs.math.oop.g16.p04.ispitivanjeTipaMetod;

import java.lang.reflect.Method;

public class PokretanjeRefleksija
{
	static void showMethods( Object o )
	{
		Class<?> c = o.getClass();
		System.out.println( "----------" + c.getName() + "----------" );
		Method[] metodi = c.getDeclaredMethods();
		//Method[] metodi = c.getMethods();
		for( int i = 0; i < metodi.length; i++ )
		{
			String imeMetoda = metodi[i].getName();
			System.out.println( "Naziv: " + imeMetoda );
			System.out.println( " Povratni tip: "
					+ metodi[i].getReturnType().getName() );
			Class<?>[] parametriMetoda = metodi[i].getParameterTypes();
			System.out.print( " Tipovi parametara:" );
			for( int k = 0; k < parametriMetoda.length; k++ )
			{
				System.out.print( " " + parametriMetoda[k].getName() );
			}
			System.out.println();
		}
	}
	
	public static void main( String[] argumenti )
	{
		showMethods(new Student("Miloš", "Mitrović"));
		System.out.println("---");
		showMethods("miki maus");
		System.out.println("---");
		showMethods( 12 );
		System.out.println("---");
		showMethods(12.45);
		System.out.println("---");

	}
	
}
