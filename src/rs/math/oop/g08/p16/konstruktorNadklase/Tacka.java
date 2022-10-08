package rs.math.oop.g08.p16.konstruktorNadklase;

public class Tacka {
	int x, y;
	
	public Tacka() {
		x = 0;
		y = 0;
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
