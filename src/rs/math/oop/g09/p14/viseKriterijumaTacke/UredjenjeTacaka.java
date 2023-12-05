package rs.math.oop.g09.p14.viseKriterijumaTacke;

import java.util.Arrays;

public class UredjenjeTacaka {

   private static void prikaziTacke(Tacka[] sve) {
      for (Tacka t: sve)
         System.out.printf("%s ", t);
      System.out.println();
   }

   public static void main(String[] args) {
      Tacka a = new Tacka("A", 14.5, 15);
      Tacka b = new Tacka("B", 10, 11.5);
      Tacka c = new Tacka("C", 10.45, 22);
      Tacka d = new Tacka("D", 11.5, 10);
      Tacka e = new Tacka("E", 25, 25.5);

      Tacka[] sve = {a, b, c, d, e};
      System.out.println("Пре сортирања");
      prikaziTacke(sve);

      Arrays.sort(sve);
      System.out.println("Пoсле подразумеваног сортирања");
      prikaziTacke(sve);

      Arrays.sort(sve, new TackaOznakaComparator());
      System.out.println("Пoсле сортирања по ознаци тачке");
      prikaziTacke(sve);

      Arrays.sort(sve, new TackaPozicijaComparator());
      System.out.println("Пoсле сортирања по позицији тачке");
      prikaziTacke(sve);
   }
}
