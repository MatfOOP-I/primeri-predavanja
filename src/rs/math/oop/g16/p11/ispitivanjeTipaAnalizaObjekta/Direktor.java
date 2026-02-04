package rs.math.oop.g16.p11.ispitivanjeTipaAnalizaObjekta;

public class Direktor extends Zaposleni
{
  double bonus;
	
	public void postaviBonus(double bonus )
	{
		this.bonus = bonus;
	}

	public Direktor(String n, double s, double b )
	{
		super( n, s );
		bonus = b;
	}
	
}
