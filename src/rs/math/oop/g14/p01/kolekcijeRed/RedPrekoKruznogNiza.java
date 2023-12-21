package rs.math.oop.g14.p01.kolekcijeRed;

/**
 * Реализујемо генерички ред употребом низа као унутрашње структуре
 * 
 * @param <T> - параметар типа без ограничења
 */
public class RedPrekoKruznogNiza<T> implements Red<T> {
	private T[] redNiz;
	private int kapacitet;
	private int brojElemenata;

	// индекси за почетак реда и наредни елемент реда,
	// иницијално оба на вредности 0
	private int pocetakIndeks;
	private int naredniIndeks;

	public RedPrekoKruznogNiza() {
		kapacitet = 2;
		redNiz = alocirajRedNiz();
	}

	@SuppressWarnings("unchecked")
	private T[] alocirajRedNiz() {
		System.out.println("Алоцирам низ капацитета: " + kapacitet);
		// попут раније алокације низа генеричких типова
		// у примеру са стеком реализованом преко низа
		return (T[]) new Object[kapacitet];
	}

	@Override
	public void dodaj(T element) {
		System.out.println("Додајем " + element);
		// проверавамо да ли има довољно капацитета
		if (brojElemenata==kapacitet) {
			// нема више капацитета па повећавамо
			kapacitet *= 2;
			T[] noviRedNiz = alocirajRedNiz();
			// преписујемо податке у новокреирани ред низ
			// и притом мењамо позиције, односно почетак и наредни
			for (int ip = 0; ip < brojElemenata; ip++) {
				int i = (ip + pocetakIndeks) % brojElemenata;
				noviRedNiz[ip] = redNiz[i];
			}
			redNiz = noviRedNiz;
			pocetakIndeks=0;
			naredniIndeks=brojElemenata;
		}
		redNiz[naredniIndeks] = element;
		naredniIndeks = (naredniIndeks + 1) % kapacitet;
		brojElemenata++;
	}

	@Override
	public T ukloni() {
		if (brojElemenata == 0)
			throw new RuntimeException("Не може се избацити елеменат из празног реда.");
		T element = redNiz[pocetakIndeks];
		redNiz[pocetakIndeks] = null;
		// померамо почетак удесно,
		// имајући у виду да је низ кружни
		pocetakIndeks = (pocetakIndeks + 1) % kapacitet;
		brojElemenata--;
		System.out.println("Уклањам: "+element);
		return element;
	}

	@Override
	public int brojElemenata() {

		return brojElemenata;
	}
	@Override
	public String toString(){
		StringBuilder sb = new StringBuilder("[");
		for(int i=0; i<brojElemenata; i++)
			sb.append( redNiz[(pocetakIndeks+i)%kapacitet] + " " );
		sb.append("]");
		return sb.toString();
	}


	public static void main(String[] args) {
		Red<Integer> red = new RedPrekoKruznogNiza<>();
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
		red.ukloni();
		System.out.println(red);
	}
}
