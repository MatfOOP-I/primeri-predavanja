package rs.math.oop.g14.p01.kolekcijeRed;

/**
 * Реализујемо генерички ред употребом повезеане листе као унутрашње структуре
 * 
 * @param <T> - параметар типа без ограничења
 */
public class RedPrekoPovezaneListe<T> implements Red<T>{

	// приватна унутрашња класа која се користи само за
	// потребе изградње повезане листе
	private class Cvor{
		T element;
		Cvor sledeci;
		
		private Cvor(T element) {
			this.element=element;
		}
	}
	
	private Cvor pocetak;
	private Cvor kraj;
	private int velicina;

	@Override
	public void dodaj(T element) {
		System.out.println("Додајем " + element);
		Cvor novi = new Cvor(element);
		if(pocetak==null) {
			// листа је била празна
			pocetak = novi;
			kraj = novi;
		}else {
			// усмеравамо досадашњи крај да показује на нови
			kraj.sledeci=novi;
			// па крај постаје новододати
			kraj = novi;
		}
		velicina++;
	}

	@Override
	public T ukloni() {
		if (velicina == 0) {
			// овде ћемо уместо изузетка вратити null,
			// али има смисла и да се избаци изузетак
			System.out.println("Ред је празан па нема смисла уклањање.");
			return null;
		}
		T element = pocetak.element;
		pocetak = pocetak.sledeci;
		velicina--;
		System.out.println("Уклањам: "+element);
		return element;
	}

	@Override
	public int velicina() {
		return velicina;
	}
	
}