package rs.math.oop.g10.p02.unutrasnjaKlasaPovezanaLista;

public class PovezanaListaTest {

	public static void main(String[] args) {
		PovezanaLista lista = new PovezanaLista();
		lista.dodajElement("Tekst");
		lista.dodajElement(3); // број са аутоматским замотавањем
		PovezanaLista lista2 = new PovezanaLista();
		lista2.dodajElement(23);
		lista2.dodajElement(true);
		lista.dodajElement(lista2);
		lista.dodajElement(7.3f);
		for(int i=0; i<1_000; i++)
			lista.dodajElement(i);
		System.out.println(lista);
		// да конструктор није приватан било би могући позвати га и одавде
		// PovezanaLista.Element element=lista.new Element();
	}
}
