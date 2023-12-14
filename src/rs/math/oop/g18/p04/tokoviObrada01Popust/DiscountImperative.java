package rs.math.oop.g18.p04.tokoviObrada01Popust;

import java.math.BigDecimal;

public class DiscountImperative
{
	public static void main( final String[] args )
	{
		BigDecimal totalOfDiscountedPrices = BigDecimal.ZERO;
		
		for( BigDecimal price : Prices.prices )
		{
			if( price.compareTo( BigDecimal.valueOf( 20 ) ) > 0 )
				totalOfDiscountedPrices = totalOfDiscountedPrices
						.add( price.multiply( BigDecimal.valueOf( 0.9 ) ) );
		}
		System.out
				.println( "Total of discounted prices: " + totalOfDiscountedPrices );
	}
}
