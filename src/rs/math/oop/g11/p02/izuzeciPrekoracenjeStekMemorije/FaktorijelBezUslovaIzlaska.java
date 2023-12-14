package rs.math.oop.g11.p02.izuzeciPrekoracenjeStekMemorije;

public class FaktorijelBezUslovaIzlaska {

	static int faktorijelBezUslovaIzlaska(int n){

		return n * faktorijelBezUslovaIzlaska(n - 1);
	}

	public static void main(String[] args) {

		System.out.println(faktorijelBezUslovaIzlaska(10));
	}
}
