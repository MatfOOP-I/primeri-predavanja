package rs.math.oop.g18.t15c.filterLamdaIzborFolks;

import static rs.math.oop.g18.t15c.filterLamdaIzborFolks.Folks.friends;

import java.util.List;

public class PickAnElement
{
	public static void pickName( final List<String> names,
			final String startingLetter )
	{
		String foundName = null;
		for( String ime : names )
		{
			if( ime.startsWith( startingLetter ) )
			{
				foundName = ime;
				break;
			}
		}
		System.out
				.print( String.format( "A ime starting with %s: ", startingLetter ) );
				
		if( foundName != null )
		{
			System.out.println( foundName );
		}
		else
		{
			System.out.println( "No ime found" );
		}
	}
	
	public static void main( final String[] args )
	{
		pickName( friends, "N" );
		pickName( friends, "Z" );
	}
}
