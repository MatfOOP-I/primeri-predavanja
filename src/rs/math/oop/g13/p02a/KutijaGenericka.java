package rs.math.oop.g13.p02a;

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

	@Override
	public String toString(){
		return "[" + uzmiVrednost().toString() + "]";
	}

}
