package rs.math.oop.g13.p10.genericiKloniranje.z02.kutijaMutabilnost;

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
	
	public void setUKutiji( T t )
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
	
	public T getUKutiji()
	{
		return uKutiji;
	}
	
	public String toString()
	{
		return "[" + uKutiji + "]";
	}
	
}