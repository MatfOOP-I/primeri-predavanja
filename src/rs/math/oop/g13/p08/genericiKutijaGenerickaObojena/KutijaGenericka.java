package rs.math.oop.g13.p08.genericiKutijaGenerickaObojena;

public class KutijaGenericka<T> {
	// можемо убацити било који објектни тип овде
	private T vrednost; 

	public KutijaGenericka(T vrednost){
		this.vrednost = vrednost;
	}

	// прихвата се онај објектни тип за кога је направљена кутија
	// одлука о типу се доноси приликом инстанцирања кутије
	public void postaviVrednost(T vrednost) {
		this.vrednost=vrednost; 
	}
	
	// нисмо изгубили информацију о правој природи објектног типа
	// тако да враћамо прецизан тип, а не његово уопштење
	public T uzmiVrednost() {
		return this.vrednost;
	}
	
	public static void main(String[] args) {
		KutijaGenericka<String> kutija1 = new KutijaGenericka<>("Текст");
		// не треба експлицитна конверзија
		// тако да је програмер растерећен одговорности да то мора да зна
		String tekst1 = kutija1.uzmiVrednost();
		System.out.println(tekst1);
		// компајлер не допушта да у кутију убацимо нешто што није String
		// па нам тиме помаже у провери семантичке коректности програма
		//kutija1.postaviVrednost(45);
	}

	@Override
	public String toString(){
		return "[" + uzmiVrednost().toString() + "]";
	}
}
