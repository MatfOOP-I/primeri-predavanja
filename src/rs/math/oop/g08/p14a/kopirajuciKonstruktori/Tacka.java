package rs.math.oop.g08.p14a.kopirajuciKonstruktori;

public class Tacka {
	int x, y;
	static int brojKreiranihTacaka = 0;
	
	public Tacka() {
		this.x = 0;
		this.y = 0;
		brojKreiranihTacaka++;
	}
	
	public Tacka(int x, int y) {
		this.x = x;
		this.y = y;
		brojKreiranihTacaka++;
	}

	public Tacka(Tacka t){
		this(t.x,t.y);
	}
	
	@Override
	public String toString() {
		return "("+x+", "+y+")";
	}
}
