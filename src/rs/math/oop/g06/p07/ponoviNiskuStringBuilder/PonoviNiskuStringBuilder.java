package rs.math.oop.g06.p07.ponoviNiskuStringBuilder;

public class PonoviNiskuStringBuilder {
	
	public static void main(String[] args) {
		String s = "Тест";
		int n = 10_000;
		StringBuilder sb=new StringBuilder();
		long pocetak = System.nanoTime();
		for(int i=0; i<n; i++)
			sb.append(s);
		// једнократна конверзија у ниску
		String sn = sb.toString();
		System.out.println(sn);
		System.out.printf("%nВреме \t%.2f%n", (System.nanoTime() - pocetak) / 1e6);
	}
}
