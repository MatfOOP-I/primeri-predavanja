package rs.math.oop.g08.p15a.konstruktori.konstruktori;

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
	
	@Override
	public String toString() {
		return "("+x+", "+y+")";
	}
}
