package rs.math.oop.g11.pd03.stekPrekoListeKorisnickiIzuzetak;

public class StekJePrazanException extends Exception
{
	public StekJePrazanException( Exception e)
	{
		super(e);
	}

	@Override
	public String toString()
	{
		String s = super.toString();
		return "Izuzetak: stek je prazan. " + s;
	}
}
