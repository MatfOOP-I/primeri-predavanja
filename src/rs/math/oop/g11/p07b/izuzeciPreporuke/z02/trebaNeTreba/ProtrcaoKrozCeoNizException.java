package rs.math.oop.g11.p07b.izuzeciPreporuke.z02.trebaNeTreba;

public class ProtrcaoKrozCeoNizException extends Exception
{
	double suma;
	int indeks;
	
	public ProtrcaoKrozCeoNizException(double suma, int indeks)
	{
		super();
		this.suma = suma;
		this.indeks = indeks;
	}
	
}
