package rs.math.oop.g13.p01.genericiKutijaNegenericka;

public class KutijaNegenericka {
	// можемо убацити било који објектни тип овде
	private Object vrednost;

	public KutijaNegenericka(Object vrednost){
		this.vrednost = vrednost;
	}

	// било који објектни тип се прихвата
	// и имплицитно конвертује у Object
	void postaviVrednost(Object vrednost) {

		this.vrednost = vrednost;
	}

	// изгубили смо информацију о правој природи објектног типа
	// тако да једино што можемо да вратимо је тип Object
	Object uzmiVrednost() {

		return this.vrednost;
	}

	public static void main(String[] args) {
		KutijaNegenericka kutija1 = new KutijaNegenericka("Текст");
		// мора експлицитна конверзија
		String tekst1 = (String) kutija1.uzmiVrednost();
		System.out.println(tekst1);
		kutija1.postaviVrednost(23.4);
		Double d = (Double) kutija1.uzmiVrednost();
		System.out.println(d);
		// тако да је одговорност на програмеру да зна шта је у кутији
		Integer broj1 = (Integer) kutija1.uzmiVrednost(); // изузетак
		System.out.println(broj1);
	}
}
