package rs.math.oop.g13.p09.listaGenericki;

public class PokretanjePovezanaLista
{
	
	public static void main( String[] args )
	{
		PovezanaLista<String> ll1 = new PovezanaLista<>( "baba" );
		ll1.addItem("zaba");
		ll1.addItem("drvo");
		
		PovezanaLista<Integer> ll2 = new PovezanaLista<>();
		ll2.addItem(1);
		int i = 2;
		ll2.addItem( i );
		ll2.addItem(Integer.valueOf(3));

		PovezanaLista<Integer> ll3 = new PovezanaLista<>();
		ll3.addItem(-5);
		ll3.addItem(-42);
		ll3.addItem(-78);
		ll3.addItem(-42);
		ll3.addItem(-78);
		ll3.addItem(-42);
		ll3.addItem(-78);

		System.out.println( ll2 );
		System.out.println("---");
		System.out.println( ll1 );
		System.out.println("---");
		System.out.println( ll3 );
		System.out.println("---");

		PovezanaLista<PovezanaLista<Integer>> ll4 = new PovezanaLista<>();
		ll4.addItem(ll2);
		ll4.addItem(ll3);
		System.out.println(ll4);
	}


}
