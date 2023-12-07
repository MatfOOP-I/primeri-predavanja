package rs.math.oop.g09.p23.losPrincipL;

public class Kvadrat extends Pravougaonik {

   public Kvadrat(double ivica) {
      super(ivica, ivica);
   }

   public Kvadrat() {
      this(2);
   }

   @Override
   public void postaviSirinu(double ivica) {
      super.postaviSirinu(ivica);
      super.postaviVisinu(ivica);
   }

   @Override
   public void postaviVisinu(double ivica) {
      super.postaviVisinu(ivica);
      super.postaviSirinu(ivica);
   }

}
