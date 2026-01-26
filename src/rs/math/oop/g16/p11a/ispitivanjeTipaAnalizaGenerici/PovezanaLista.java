package rs.math.oop.g16.p11a.ispitivanjeTipaAnalizaGenerici;

public class PovezanaLista<T>
{
	private class ElemenatListe
	{
		private ElemenatListe sledeci;
		private T sadrzaj;

		public ElemenatListe( T item )
		{
			this.sadrzaj = item;
			sledeci = null;
		}
		
		public String toString()
		{
			return "Elemenat liste: " + sadrzaj;
		}
		
	}

	private ElemenatListe pocetak = null;
	private ElemenatListe kraj = null;
	private ElemenatListe tekuci = null;

	public PovezanaLista()
	{
	}
	
	public PovezanaLista(T sadrzaj )
	{
		if (sadrzaj != null)
			tekuci = kraj = pocetak = new ElemenatListe( sadrzaj );
	}

	public PovezanaLista(T[] sadrzaji )
	{
		if (sadrzaji != null)
		{
			for (int i = 0; i < sadrzaji.length; i++)
				dodajElement( sadrzaji[i] );
			tekuci = pocetak;
		}
	}
	
	public void dodajElement(T element )
	{
		ElemenatListe noviKraj = new ElemenatListe( element );
		if (pocetak == null)
			pocetak = kraj = noviKraj;
		else
		{
			kraj.sledeci = noviKraj;
			kraj = noviKraj;
		}
	}
	
	public T uzmiPrvi()
	{
		tekuci = pocetak;
		return tekuci == null ? null : tekuci.sadrzaj;
	}
	
	public T uzmiSledeci()
	{
		if (tekuci != null)
			tekuci = tekuci.sledeci;
		return tekuci == null ? null : tekuci.sadrzaj;
	}
	
	public boolean sadrzi(T vrednost)
	{
		if( vrednost == null )
		  return false;
		if( pocetak == null)
			return false;
		ElemenatListe tekuci = pocetak;
		while (tekuci != null)
		{
			if( vrednost == tekuci.sadrzaj)
				return true;
			tekuci = tekuci.sledeci;
		}
		return false;
	}
}
