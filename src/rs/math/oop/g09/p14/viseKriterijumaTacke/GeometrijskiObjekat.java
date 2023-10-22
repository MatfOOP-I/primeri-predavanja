package rs.math.oop.g09.p14.viseKriterijumaTacke;

public abstract class GeometrijskiObjekat {

   private String oznaka;

   public GeometrijskiObjekat(String oznaka) { this.oznaka = oznaka; }

   public String uzmiOznaku() {
      return oznaka;
   }

   public void postaviOznaku(String oznaka) {
      this.oznaka = oznaka;
   }

}
