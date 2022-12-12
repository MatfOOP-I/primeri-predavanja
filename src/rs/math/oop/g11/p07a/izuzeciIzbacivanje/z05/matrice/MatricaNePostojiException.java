package rs.math.oop.g11.p07a.izuzeciIzbacivanje.z05.matrice;

public class MatricaNePostojiException extends Exception
{	
	@Override
	public String toString()
	{
		String s = super.toString();
		return "Izuzetak nepostojece matrice. \n" + s;
	}
}
