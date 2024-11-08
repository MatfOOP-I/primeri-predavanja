package rs.math.oop.g06.p02.merenjeVremena;

public class IzmeriVreme {
    public static long sumiraj(int n) {
   	 long suma = 0;
   	 for (int i = 1; i <= n; i++)
   		 suma += i;
   	 return suma;
    }

    public static void main(String args[]) {
   	 for (int n = 1_000_000; n <= 1_000_000_000; n *= 10) {
   		 long pocetakNs = System.nanoTime();
   		 long suma = sumiraj(n);
		 long krajNs = System.nanoTime();
   		 System.out.printf("Сума бројева до %d је %d%n", n, suma);
   		 System.out.println("Време у ns са nanoTime(): "
   				 + (krajNs - pocetakNs));
   		 System.out.printf("Време у ms са nanoTime(): %.5g%s",
   		(krajNs-pocetakNs)/1_000_000.0, System.lineSeparator());

   		 long pocetakMs = System.currentTimeMillis();
   		 suma = sumiraj(n);
		 long krajMs = System.currentTimeMillis();
   		 System.out.printf("Сума бројева до %d је %d%n", n, suma);
   		 System.out.println("Време у ms са currentTimeMillis(): "
   				 + (krajMs - pocetakMs));
   		System.out.println("-----------------------------------");
   	 }
    }
}

