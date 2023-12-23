package rs.math.oop.g16.p07.poljePristup;

public class Zaposleni
{
	private String ime;
	private double plata;
	
	public Zaposleni(String n, double s )
	{
		ime = n;
		plata = s;
	}


	public String uzmiIme()
	{
		return ime;
	}
	
	public double uzmiPlata()
	{
		return plata;
	}
	
	public void povecajPlatu( double zaProcenat )
	{
		double iznosPovisice = plata * zaProcenat / 100;
		plata += iznosPovisice;
	}
	
	@Override
	public String toString()
	{
		return ime + " " + plata;
	}
}
