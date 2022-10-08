/*

Написати Јава програм који омогућује рад са геометријским објектима у равни.

Подаци о разним врстама геометријских објеката су организовани по класама, 
које се налазе у одвојеним датотекама. 

*/

// Задатак илуструје коришћење наслеђивања.
// Задатак илуструје коришћење кључне речи super.

package rs.math.oop.g09.p10.interfejsGeometrija;

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

      Scanner sc = new Scanner(System.in);
      System.out.print("Unesite koordinate tacke X: ");
      Tacka x = new Tacka("X", sc.nextDouble(), sc.nextDouble());
      sc.close();

      Sadrzavanje[] sviSd = {ab, p, bcd, bcde, k1};
      System.out.println("\nOбјекти који не садрже дату тачку " + x + " су: " );
      for (Sadrzavanje sd : sviSd)
         if( !x.sadrziSeU(sd))
            System.out.println(sd);
    }

}
