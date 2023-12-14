package rs.math.oop.g11.p07b.stekPrekoNizaKorisnickiIzuzetak;

public class StekJePrazanIzuzetak extends Exception
{	
	@Override
	public String toString()
	{
		String s = super.toString();
		return "Izuzetak: stek je prazan. " + s;
	}
}
