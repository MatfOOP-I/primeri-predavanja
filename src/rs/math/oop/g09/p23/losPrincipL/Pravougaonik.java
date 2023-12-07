package rs.math.oop.g09.p23.losPrincipL;

public class Pravougaonik {
   private double sirina;
   private double visina;

   public Pravougaonik(double sirina, double visina) {
      this.sirina = sirina;
      this.visina = visina;
   }

   public Pravougaonik() {
      this(4,3);
   }

   public double uzmiSirinu() {
      return sirina;
   }

   public void postaviSirinu(double sirina) {
      this.sirina = sirina;
   }

   public double uzmiVisinu() {
      return visina;
   }

   public void postaviVisinu(double visina) {
      this.visina = visina;
   }

   public double povrsina(){
      return sirina * visina;
   }
}
