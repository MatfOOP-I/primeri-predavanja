package rs.math.oop.g09.p14.viseKriterijumaTacke;

import java.util.Comparator;

public class TackaOznakaComparator implements Comparator
{
	@Override
	public int compare( Object o1, Object o2 )
	{
		if( !(o1 instanceof Tacka ) )
			return 1;
		if( !(o2 instanceof Tacka ) )
			return -1;
		Tacka t1 = (Tacka) o1;
		Tacka t2 = (Tacka) o2;
		return t1.uzmiOznaku().compareTo( t2.uzmiOznaku() );
	}
	
}
