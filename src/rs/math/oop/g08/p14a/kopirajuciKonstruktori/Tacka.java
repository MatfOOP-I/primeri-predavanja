package rs.math.oop.g08.p14a.kopirajuciKonstruktori;

public class Tacka {
	int x, y;
	static int brojKreiranihTacaka = 0;

	public Tacka(int x, int y) {
		this.x = x;
		this.y = y;
		brojKreiranihTacaka++;
	}

	public Tacka(){
		this(0,0);
	}

	public Tacka(Tacka t){
		this(t.x,t.y);
	}
	
	@Override
	public String toString() {
		return "("+x+", "+y+")";
	}
}
