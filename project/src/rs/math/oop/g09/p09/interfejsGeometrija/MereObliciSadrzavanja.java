/*

Написати Јава програм који омогућује рад са геометријским објектима у равни.

Подаци о разним врстама геометријских објеката су организовани по класама, 
које се налазе у одвојеним датотекама. 

*/

// Задатак илуструје коришћење наслеђивања.
// Задатак илуструје коришћење кључне речи super.

package rs.math.oop.g09.p09.interfejsGeometrija;

import java.util.Scanner;

public class MereObliciSadrzavanja {

   public static void main(String[] args) {
      Tacka a = new Tacka("A", 14.5, 15);
      Tacka b = new Tacka("B", 10, 11.5);
      Tacka c = new Tacka( "C", 10.45, 22);
      Tacka d = new Tacka( "D", 22.3, 17.5);
      Tacka e = new Tacka("E", 25, 25.5);
      Duz ab = new Duz("дAB", a, b);
      Prava p = new Prava("пAB", a, d);
      Trougao bcd = new Trougao("тBCD", b, c, d);
      Cetvorougao bcde = new Cetvorougao("чBCDE", b, c, d, e);
      Krug k1 = new Krug("кB18", b, 18);

      double ukupanObim = 0;
      double ukupnaPovrsina = 0;
      System.out.println("\nГеометријски објекти:");
      GeometrijskiObjekat[] svi = {a, b, c, d, e, ab, p, bcd, bcde, k1};
      for (GeometrijskiObjekat go : svi) {
         System.out.printf("| %s", go);
         if (go instanceof Oblik) {
            Oblik obl = (Oblik) go;
            if (obl.jeKonveksan())
               System.out.print(" конвексан ");
            else
               System.out.print(" неконвексан ");
            if (obl.jeOgranicen())
               System.out.println(" ограничен ");
            else
               System.out.println(" неограничен");
         }
         else
            System.out.println(" не подржава облике");
         if( go instanceof Mera){
            Mera m = (Mera) go;
            System.out.print(" обим: " + m.obim());
            System.out.println(" површина: " + m.povrsina() + "|");
            ukupanObim += m.obim();
            ukupnaPovrsina += m.povrsina();
         }
         else
            System.out.println(" не подржава мерење |");
      }
      System.out.println("Укупан обим:     " + ukupanObim);
      System.out.println("Укупна површина: " + ukupnaPovrsina);

      Scanner sc = new Scanner(System.in);
      System.out.print("Unesite koordinate tacke X: ");
      Tacka x = new Tacka("X", sc.nextDouble(), sc.nextDouble());
      sc.close();

      Sadrzavanje[] sviSd = {ab, p, bcd, bcde, k1};
      System.out.println("Oбјекти који садрже дату тачку " + x + " су: " );
      for (Sadrzavanje sd : sviSd)
         if( sd.sadrzi(x))
            System.out.printf("%s ", sd);
    }

}
