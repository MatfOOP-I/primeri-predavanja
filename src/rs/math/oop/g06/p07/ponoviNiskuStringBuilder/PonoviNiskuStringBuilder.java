package rs.math.oop.g06.p07.ponoviNiskuStringBuilder;

public class PonoviNiskuStringBuilder {
	
	public static void main(String[] args) {
		String s = "Тест";
		int n = 1000;
		long pocetak = System.nanoTime();
		StringBuilder sb=new StringBuilder();
		for(int i=0; i<n; i++)
			sb.append(s);
		String sn = sb.toString();
		long kraj = System.nanoTime();
		System.out.println(sn);
		System.out.printf("%f", (kraj-pocetak)/1_000_000.00);
	}
}
