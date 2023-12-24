package rs.math.oop.g16.p01.ispitivanjeTipa;

enum Miki
{
	A, B
};

public class DobijanjeInformacijaOKlasi
{
	
	public static void main( String[] args )
	{
		Class<?> c = "foo".getClass();
		System.out.println(c);
		System.out.println("---");
		
		Class<?> c2 = System.in.getClass();
		System.out.println( c2 );
		System.out.println("---");
	
		Class<?> c3 = Miki.A.getClass();
		System.out.println( c3 );
		System.out.println("---");
		
		byte[] bytes = new byte[1024];
		Class<?> c4 = bytes.getClass();
		System.out.println( c4 );
		System.out.println("---");
		
		boolean[] odgovori = new boolean[3];
		Class<?> c5 = odgovori.getClass();
		System.out.println( c5 );
		System.out.println("---");		

	}
	
}
