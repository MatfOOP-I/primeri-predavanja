package rs.math.oop.g11.p07a.izuzeciIzbacivanje.z04.stekPrekoListeKorisnickiIzuzetak;

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
