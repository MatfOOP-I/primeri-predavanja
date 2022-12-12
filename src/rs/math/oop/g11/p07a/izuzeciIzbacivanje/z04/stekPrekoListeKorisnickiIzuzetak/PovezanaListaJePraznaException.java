package rs.math.oop.g11.p07a.izuzeciIzbacivanje.z04.stekPrekoListeKorisnickiIzuzetak;

public class PovezanaListaJePraznaException extends Exception
{	
	@Override
	public String toString()
	{
		String s = super.toString();
		return "Izuzetak: povezana lista je prazna. " + s;
	}
}
