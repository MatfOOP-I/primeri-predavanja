package rs.math.oop.g09.p12.uredjenjeTacaka;

import java.util.Arrays;

public class UredjenjeTacaka {

   private static void prikazi(Tacka[] niz) {
      for (Tacka x: niz)
         System.out.print(x + " ");
      System.out.println();
   }

   public static void main(String[] args) {
      Tacka a = new Tacka("A", 14.5, 15);
      Tacka b = new Tacka("B", 10, 11.5);
      Tacka c = new Tacka( "C", 10.45, 22);
      Tacka d = new Tacka( "D", 22.3, 17.5);
      Tacka e = new Tacka("E", 25, 25.5);
      Tacka f = new Tacka("F", 25.5, 25);

      Tacka[] sve = {a, b, f, d, e, c};
      System.out.println("Пре сортирања");
      prikazi(sve);
      Arrays.sort(sve);
      System.out.println("Пoсле сортирања");
      prikazi(sve);
    }

}
