package rs.math.oop.g10.p02.unutrasnjaKlasaPovezanaLista;

public class PovezanaLista {

	private Element pocetak;
	
	public void dodajElement(Object podatak) {
		Element novi =  new Element(podatak);
		if(pocetak==null) {
			pocetak = novi;
			return;
		}
		// правимо нову референцу како не бисмо пореметили почетак
		Element iterator = pocetak;
		while(iterator.sledeci!=null)
			iterator = iterator.sledeci;
		iterator.sledeci=novi; // приступ приватном пољу sledeci класе Element
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("[");
		Element iterator = pocetak;
		while(iterator!=null) {
			sb.append(iterator+" "); // имплицитно се позива toString
			iterator =iterator.sledeci; 
		}
		return sb.toString().trim()+"]";
	}
	
	public class Element{
		private Object podatak;
		private Element sledeci;
		
		// приватним конструктором онемогућавамо креирање
		// инстанце Element ван класе PovezanaLista
		private Element(Object podatak) {
			this.podatak=podatak;
		}
		
		@Override
		public String toString() {
			return podatak.toString();
		}
	}
}
