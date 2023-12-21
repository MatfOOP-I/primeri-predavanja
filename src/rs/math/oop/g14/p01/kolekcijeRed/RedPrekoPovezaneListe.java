package rs.math.oop.g14.p01.kolekcijeRed;

/**
 * Реализујемо генерички ред употребом повезане листе као унутрашње структуре
 * 
 * @param <T> - параметар типа без ограничења
 */
public class RedPrekoPovezaneListe<T> implements Red<T>{

	private PovezanaLista<T> elementi = new PovezanaLista();

	@Override
	public void dodaj(T elem) {
		System.out.println("Додајем " + elem);
		elementi.dodajNaKraj(elem);
	}

	@Override
	public T ukloni() {
		T elem = elementi.ukloniSaPocetka();
		if (elem == null) {
			throw new NullPointerException();
		}
		System.out.println("Уклањам: "+elem);
		return elem;
	}

	@Override
	public int brojElemenata() {
		return elementi.brojCvorova();
	}

	@Override
	public String toString(){
		StringBuilder sb = new StringBuilder("[");
		sb.append( elementi.uzmiPrvi() + " ");
		while(!elementi.stigaoDoKraja())
			sb.append( elementi.uzmiSledeci() + " ");
		sb.append("]");
		return sb.toString();
	}
	
	public static void main(String[] args) {
		Red<Integer> red = new RedPrekoPovezaneListe<>();
		red.dodaj(34);
		red.dodaj(23);
		red.dodaj(11);
		System.out.println(red);
		red.ukloni();
		System.out.println(red);
		red.dodaj(112);
		red.dodaj(-134);
		red.dodaj(111);
		red.dodaj(345);
		System.out.println(red);
		red.ukloni();
		red.ukloni();
		red.ukloni();
		red.ukloni();
		System.out.println(red);
	}
}