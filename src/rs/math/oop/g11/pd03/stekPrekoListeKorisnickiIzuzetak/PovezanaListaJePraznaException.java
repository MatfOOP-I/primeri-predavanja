package rs.math.oop.g11.pd03.stekPrekoListeKorisnickiIzuzetak;

public class PovezanaListaJePraznaException extends Exception
{	
	@Override
	public String toString()
	{
		String s = super.toString();
		return "Izuzetak: povezana lista je prazna. " + s;
	}
}
