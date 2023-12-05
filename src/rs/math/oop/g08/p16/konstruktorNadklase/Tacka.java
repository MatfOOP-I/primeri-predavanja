package rs.math.oop.g08.p16.konstruktorNadklase;

public class Tacka {
	int x;
	int y;
	
	public Tacka() {
		this(0,0);
	}
	
	public Tacka(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "("+x+", "+y+")";
	}
}
