package rs.math.oop.g09.p22.dobarPrincipO;

public class Pravougaonik implements Mera{
   private double sirina;
   private double visina;

   public Pravougaonik(double sirina, double visina) {
      this.sirina = sirina;
      this.visina = visina;
   }

   public double uzmiSirinu() {
      return sirina;
   }

   public double uzmiVisinu() {
      return visina;
   }

   @Override
   public double povrsina() {

      return sirina * visina;
   }
}
