package rs.math.oop.g09.p22.dobarPrincipO;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class DobarPrincipO {

   public static void main(String[] argumenti){
      Mera[] oblici = new Mera[2];
      Scanner sc = new Scanner(in);
      out.printf("Унесите полупречник круга: ");
      double r = sc.nextDouble();
      oblici[0] = new Krug(r);
      out.printf("Унесите ширину и висину правоугаоника: ");
      double a = sc.nextDouble();
      double b = sc.nextDouble();
      oblici[1] = new Pravougaonik(a,b);
      sc.close();
      for(Mera o: oblici){
         out.printf("Површина: %f\n", o.povrsina());
      }
   }
}
