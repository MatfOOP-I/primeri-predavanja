package rs.math.oop.g11.pd01.matrice;

public class MatricaNePostojiException extends Exception
{	
	@Override
	public String toString()
	{
		String s = super.toString();
		return "Izuzetak nepostojece matrice. \n" + s;
	}
}
