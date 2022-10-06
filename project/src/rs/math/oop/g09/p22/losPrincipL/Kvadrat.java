package rs.math.oop.g09.p22.losPrincipL;

public class Kvadrat extends Pravougaonik {

   public Kvadrat(double ivica) {
      super(ivica, ivica);
   }

   public Kvadrat() {
      this(2);
   }

   @Override
   public void postaviSirinu(double sirina) {
      super.postaviSirinu(sirina);
      super.postaviVisinu(sirina);
   }

   @Override
   public void postaviVisinu(double visina) {
      super.postaviVisinu(visina);
      super.postaviSirinu(visina);
   }

}
