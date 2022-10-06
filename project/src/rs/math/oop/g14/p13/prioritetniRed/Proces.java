package rs.math.oop.g14.p13.prioritetniRed;

public class Proces implements Comparable<Proces>{
	private String naziv;
	private int prioritet;
	
	public Proces(String naziv, int prioritet) {
		this.naziv = naziv;
		this.prioritet = prioritet;
	}
	
	@Override
	public int compareTo(Proces o) {
		return this.prioritet-o.prioritet;
	}
	
	@Override
	public String toString() {
		return naziv+":"+prioritet;
	}
}
