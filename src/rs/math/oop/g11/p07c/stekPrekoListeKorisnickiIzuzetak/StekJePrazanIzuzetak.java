package rs.math.oop.g11.p07c.stekPrekoListeKorisnickiIzuzetak;

public class StekJePrazanIzuzetak extends Exception
{
	public StekJePrazanIzuzetak(Exception e)
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
