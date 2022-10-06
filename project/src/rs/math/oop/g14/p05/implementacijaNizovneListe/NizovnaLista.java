package rs.math.oop.g14.p05.implementacijaNizovneListe;

public class NizovnaLista<T>{

	private T[] niz;
	private int kapacitet;
	private int velicina;
	
	public NizovnaLista() {
		kapacitet = 5;
		niz = alocirajNiz();
	}
	
	@SuppressWarnings("unchecked")
	private T[] alocirajNiz() {
		System.out.println("Алоцирам низ капацитета: " + kapacitet);
		// попут раније алокације низа генеричких типова код стека и реда
		return (T[]) new Object[kapacitet];
	}
	
	public void dodaj(T element) {
		System.out.println("Додајем \"" + element +"\" на крај.");
		// проверавамо да ли има довољно капацитета
		if (velicina==kapacitet) {
			// нема више капацитета па повећавамо
			kapacitet *= 2;
			T[] noviNiz = alocirajNiz();
			// преписујемо податке у новокреирани низ
			for (int i = 0; i < velicina; i++)
				noviNiz[i] = niz[i];
			niz = noviNiz;
		}
		niz[velicina++] = element;
	}
	
	private void proveriGranice(int i) {
		if(i>=velicina || i<0)
			throw new IndexOutOfBoundsException();
	}
	
	public void postavi(int i, T element) {
		proveriGranice(i);
		niz[i]=element;
	}
	
	public T uzmi(int i) {
		proveriGranice(i);
		return niz[i];
	}
	
	public int velicina() {
		return velicina;
	}
	
	public int kapacitet() {
		return kapacitet;
	}
	
	public static void main(String[] args) {
		NizovnaLista<String> nizovnaLista = new NizovnaLista<>();
		nizovnaLista.dodaj("Ово");
		nizovnaLista.dodaj("је");
		nizovnaLista.dodaj("поједностављена");
		nizovnaLista.dodaj("верзија");
		nizovnaLista.dodaj("низовне");
		nizovnaLista.dodaj("листе");
		nizovnaLista.dodaj(".");
		System.out.println(String.format("Листа има величину %d, а капацитет %d.", 
				nizovnaLista.velicina(), nizovnaLista.kapacitet()));
		nizovnaLista.postavi(3, "имплементација");
		for(int i=0; i<nizovnaLista.velicina(); i++)
			System.out.println(nizovnaLista.uzmi(i));
	}
}
