package rs.math.oop.g06.p02.merenjeVremena;

public class IzmeriVreme {
    public static long sumiraj(int n) {
   	 long suma = 0;
   	 for (int i = 0; i < n; i++)
   		 suma += i;
   	 return suma;
    }

    public static void main(String args[]) {
   	 for (int n = 10000000; n <= 1000000000; n *= 10) {
   		 long pocetak1 = System.nanoTime();
   		 long suma = sumiraj(n);
   		 System.out.printf("Сума бројева до %d је %d%n", n, suma);
   		 long kraj1 = System.nanoTime();
   		 System.out.println("Време у ns са nanoTime(): "
   				 + (kraj1 - pocetak1));
   		 System.out.printf("Време у ms са nanoTime(): %.5g%s",
   		(kraj1-pocetak1)/1000000.0,System.lineSeparator());

   		 long pocetak2 = System.currentTimeMillis();
   		 suma = sumiraj(n);
   		 System.out.printf("Сума бројева до %d је %d%n", n, suma);
   		 long kraj2 = System.currentTimeMillis();
   		 System.out.println("Време у ms са currentTimeMillis(): "
   				 + (kraj2 - pocetak2));
   		System.out.println("-----------------------------------");
   	 }
    }
}

