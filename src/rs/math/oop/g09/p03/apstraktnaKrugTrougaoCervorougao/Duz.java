package rs.math.oop.g09.p03.apstraktnaKrugTrougaoCervorougao;

import java.util.Objects;

public class Duz extends GeometrijskiObjekat {
   private Tacka a;
   private Tacka b;

   public Duz(String oznaka, Tacka a, Tacka b) {
      super(oznaka);
      this.a = new Tacka(a);
      this.b = new Tacka(b);
   }

   public Duz(Tacka a, Tacka b) {
      this("", a, b);
   }

   public Duz(Duz d) {
      this(d.uzmiOznaku(), d.a, d.b);
   }

   public double duzina() {
      return a.rastojanje(b);
   }

   public boolean sadrzi(Tacka t) {
      boolean kolinearne = ((t.uzmiY() - a.uzmiY())
               * (b.uzmiX() - a.uzmiX()) == (b.uzmiY()
                        - a.uzmiY())
                        * (t.uzmiX() - a.uzmiX()));
      if( !kolinearne )
         return false;
      if(a.uzmiX() < b.uzmiX()) {
         if (t.uzmiX() < a.uzmiX() || t.uzmiX() > b.uzmiX())
            return false;
      }
      else {
         if (t.uzmiX() < b.uzmiX() || t.uzmiX() > a.uzmiX())
            return false;
      }
      if(a.uzmiY() < b.uzmiY()) {
         if (t.uzmiY() < a.uzmiY() || t.uzmiY() > b.uzmiY())
            return false;
      }
      else {
         if (t.uzmiY() < b.uzmiY() || t.uzmiY() > a.uzmiY())
            return false;
      }
      return true;
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || !(o instanceof Duz)) return false;
      Duz duz = (Duz) o;
      return (a.equals(duz.a) &&
            b.equals(duz.b))
            || (a.equals(duz.b) &&
            b.equals(duz.a));
   }

   @Override
   public int hashCode() {
      if( a.hashCode() <= b.hashCode() )
         return Objects.hash(a, b);
      return Objects.hash(b, a);
   }

   @Override
   public String toString() {
     return uzmiOznaku() + ":[" + a + ";" + b + "]";
   }

   @Override
   public boolean jeKonveksan() {
      return true;
   }

   @Override
   public boolean jeOgranicen() {
      return true;
   }

   @Override
   public double obim() {
      return a.rastojanje(b);
   }

   @Override
   public double povrsina() {
      return 0;
   }

}
