package rs.math.oop.g09.p13.uredjenjeTacaka;

import java.util.Arrays;

public class UredjenjeTacaka {

   private static void prikazi(Tacka[] sve) {
      for (Tacka t: sve)
         System.out.printf("%s ", t);
      System.out.println();
   }

   public static void main(String[] args) {
      Tacka a = new Tacka("A", 14.5, 15);
      Tacka b = new Tacka("B", 10, 11.5);
      Tacka c = new Tacka( "C", 10.45, 22);
      Tacka d = new Tacka( "D", 22.3, 17.5);
      Tacka e = new Tacka("E", 25, 25.5);
      Tacka f = new Tacka("F", 11.5, 10);
      Tacka g = new Tacka("G", -11.5, -10);

      Tacka[] sve = {a, b, d, e, f, c, g, new Tacka("H",7,8)};
      System.out.println("Пре сортирања");
      prikazi(sve);
      Arrays.sort(sve);
      System.out.println("Пoсле сортирања");
      prikazi(sve);
    }

}
