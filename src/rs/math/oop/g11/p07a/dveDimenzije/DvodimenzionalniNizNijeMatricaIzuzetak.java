package rs.math.oop.g11.p07a.dveDimenzije;

public class DvodimenzionalniNizNijeMatricaIzuzetak extends Exception {

   double[][] niz;

   public DvodimenzionalniNizNijeMatricaIzuzetak(double[][] niz) {
      super();
      this.niz = niz;
   }

   private String prikaz(double[][] niz) {
      String ret = "{";
      for (double[] v : niz) {
         ret += "{";
         for (double x : v)
            ret += "" + x + " ";
         ret += "}";
      }
      ret += "}";
      return ret;
   }

   @Override
   public String toString() {
      String s = super.toString();
      return "2D niz " + prikaz(niz) + " nije matrica. \n" + s;
   }
}
