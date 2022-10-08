package rs.math.oop.g09.p21.dobarPrincipO;

import static java.lang.Math.PI;

public class Krug implements Mera {
   private double poluprecnik;

   public Krug(double poluprecnik) {
      this.poluprecnik = poluprecnik;
   }

   public double uzmiPoluprecnik() {
      return poluprecnik;
   }

   @Override
   public double povrsina() {
      return PI * poluprecnik * poluprecnik;
   }
}
