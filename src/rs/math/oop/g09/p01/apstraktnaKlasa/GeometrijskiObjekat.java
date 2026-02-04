package rs.math.oop.g09.p01.apstraktnaKlasa;

public abstract class GeometrijskiObjekat {
   private String oznaka;

   public GeometrijskiObjekat(String oznaka) {
      this.oznaka = oznaka;
   }

   public String uzmiOznaku() {
      return oznaka;
   }

   public void postaviOznaku(String oznaka) {
      this.oznaka = oznaka;
   }

   public abstract boolean jeKonveksan();

   public abstract boolean jeOgranicen();

   public abstract double obim();

   public abstract double povrsina();

}
