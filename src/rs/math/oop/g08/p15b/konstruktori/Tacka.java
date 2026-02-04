package rs.math.oop.g08.p15b.konstruktori;

public class Tacka {
	int x, y;
	static int brojKreiranihTacaka = 0;
	
	public Tacka() {
		this(0,0);
	}
	
	public Tacka(int x, int y) {
		this.x = x;
		this.y = y;
		brojKreiranihTacaka++;
	}
	
	public Tacka(Tacka t){
		this(t.x, t.y);
	}

	@Override
	public String toString() {
		return "("+x+", "+y+")";
	}
}
