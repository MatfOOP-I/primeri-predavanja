package rs.math.oop.g11.pd02.stekPrekoNizaKorisnickiIzuzetak;

public class StekJePrazanException extends Exception
{	
	@Override
	public String toString()
	{
		String s = super.toString();
		return "Izuzetak: stek je prazan. " + s;
	}
}
