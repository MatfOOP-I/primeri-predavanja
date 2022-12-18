package rs.math.oop.g13.p10.kloniranjeGenerickiProblem.z01.kutijaMutabilnost;

public class Kutija<T>
{
	private T uKutiji;
	
	public Kutija(T t)
	{
		uKutiji = t;
	}
	
	public void setUKutiji( T t )
	{
		uKutiji = t;
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