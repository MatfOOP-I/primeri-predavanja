package rs.math.oop.g08.p16.konstruktorNadklase;

public class OznacenaTacka extends Tacka{
	String oznaka;
	
	public OznacenaTacka() {
		super();
		oznaka = "";
	}
	
	public OznacenaTacka(int x, int y, String oznaka) {
		super(x, y);
		this.oznaka = oznaka;
	} 
	
	@Override
	public String toString() {
		return oznaka + super.toString();
	}
	
	public static void main(String[] args) {
		OznacenaTacka ot = new OznacenaTacka(10, 20, "A");
		System.out.println(ot);
		Tacka t = new OznacenaTacka(30, 40, "B");
		System.out.println(t);
		t = new Tacka(50, 60);
		System.out.println(t);
	}

}
