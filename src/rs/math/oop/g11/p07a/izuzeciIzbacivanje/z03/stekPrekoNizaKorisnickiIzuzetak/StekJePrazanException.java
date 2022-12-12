package rs.math.oop.g11.p07a.izuzeciIzbacivanje.z03.stekPrekoNizaKorisnickiIzuzetak;

public class StekJePrazanException extends Exception
{	
	@Override
	public String toString()
	{
		String s = super.toString();
		return "Izuzetak: stek je prazan. " + s;
	}
}
