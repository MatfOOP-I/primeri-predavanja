package rs.math.oop.g13.p13.kloniranjeGenerickiResenje;

public class Kutija<T extends KloniraSe<T>>
{
	private T uKutiji;
	
	public Kutija( T t )
	{
		try
		{
			uKutiji = t.clone();
		}
		catch (CloneNotSupportedException e)
		{
			System.out.println( e );
		}
	}
	
	public void postaviUKutiju( T t )
	{
		try
		{
			uKutiji = t.clone();
		}
		catch (CloneNotSupportedException e)
		{
			System.out.println( e );
		}
	}
	
	public T uzmiIzKutije()
	{
		return uKutiji;
	}
	
	public String toString()
	{
		return "[" + uKutiji + "]";
	}
	
}