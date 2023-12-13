package rs.math.oop.g11.pd03.stekPrekoListeKorisnickiIzuzetak;

public class ArgumentJeNullException extends Exception
{	
	@Override
	public String toString()
	{
		String s = super.toString();
		return "Izuzetak: argument je null, sto nije dopusteno. " + s;
	}
}
