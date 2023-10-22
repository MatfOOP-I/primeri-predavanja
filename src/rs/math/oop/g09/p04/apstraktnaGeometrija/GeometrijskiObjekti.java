package rs.math.oop.g09.p04.apstraktnaGeometrija;

public class GeometrijskiObjekti {

   public static void main(String[] args) {
      Tacka a = new Tacka("A", 14.5, 15);
      Tacka b = new Tacka(11, 11.5);
      Tacka c = new Tacka(10.45, 22);
      Tacka d = new Tacka(22.3, 17.5);
      Tacka e = new Tacka("E", 25, 25.5);
      Duz ab = new Duz("AB", a, b);
      Prava p = new Prava("AB", a, d);
      Trougao cdb = new Trougao("CDB", b, c, d);
      Cetvorougao bcde = new Cetvorougao("BCDE", b, c, d, e);
      Krug k1 = new Krug("B_18", b, 18);

      System.out.println("Геометријски објекти ");
      GeometrijskiObjekat[] svi =
      { a, b, c, d, e, ab, p, cdb, bcde, k1 };
      for (GeometrijskiObjekat go : svi) {
         System.out.print("|" + go);
         if (go.jeKonveksan())
            System.out.print(" конвексан ");
         else
            System.out.print(" неконвексан ");
         if (go.jeOgranicen())
            System.out.println(" ограничен ");
         else
            System.out.println(" неограничен ");
         System.out.print(" обим: " + go.obim());
         System.out.println(" површина: " + go.povrsina() + "|");
      }
   }

}
