package rs.math.oop.g13.p11.kloniranjeGenerickiProblem;

public class Kutija<T>
{
	private T uKutiji;
	
	public Kutija(T t)
	{
		uKutiji = t;
	}
	
	public void postaviUKutiju(T t )
	{
		uKutiji = t;
	}
	
	public T uzmiIzKutije()
	{
		return uKutiji;
	}
	@Override
	public String toString()
	{
		return "[" + uKutiji + "]";
	}
	
}