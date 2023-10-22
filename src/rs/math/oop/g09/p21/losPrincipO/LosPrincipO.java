package rs.math.oop.g09.p21.losPrincipO;

import java.util.Scanner;

import static java.lang.Math.PI;
import static java.lang.System.*;

public class LosPrincipO {

   public static double povrsinaPravougaonika(Pravougaonik p){
      return p.uzmiSirinu() * p.uzmiVisinu();
   }

   public static double povrsinaKruga(Krug k) {
      return PI * k.uzmiPoluprecnik() * k.uzmiPoluprecnik();
   }

   public static void main(String[] argumenti){
      Scanner sc = new Scanner(in);
      out.printf("Унесите полупречник круга: ");
      double r = sc.nextDouble();
      Krug k = new Krug(r);
      out.printf("Површина круга је: %f\n", povrsinaKruga(k));
      out.printf("Унесите ширину и висину правоугаоника: ");
      double a = sc.nextDouble();
      double b = sc.nextDouble();
      Pravougaonik p = new Pravougaonik(a,b);
      out.printf("Површина правоугаоника је: %f\n", povrsinaPravougaonika(p));
      sc.close();
   }
}
