package rs.math.oop.g08.p14.konstruktori;

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
	
	@Override
	public String toString() {
		return "("+x+", "+y+")";
	}
}
