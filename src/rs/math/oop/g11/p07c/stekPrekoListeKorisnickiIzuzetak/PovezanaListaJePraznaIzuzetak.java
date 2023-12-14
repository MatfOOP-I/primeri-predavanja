package rs.math.oop.g11.p07c.stekPrekoListeKorisnickiIzuzetak;

public class PovezanaListaJePraznaIzuzetak extends Exception
{	
	@Override
	public String toString()
	{
		String s = super.toString();
		return "Izuzetak: povezana lista je prazna. " + s;
	}
}
