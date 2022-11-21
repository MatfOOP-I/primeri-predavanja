package rs.math.oop.g09.p04.apstraktnaGeometrija;

import java.util.Objects;

public class Krug extends GeometrijskiObjekat {
   private Tacka o;
   private double r;

   public Krug(String oznaka, Tacka o, double r) {
      super(oznaka);
      this.o = new Tacka(o);
      this.r = r;
   }

   public Krug(Tacka o, double r) {
      this("", o, r);
   }

   public Krug(Krug kr) {
      this(kr.uzmiOznaku(), kr.o, kr.r);
   }

   public boolean sadrzi(Tacka t) {
      return t.rastojanje(o) <= r;
   }

   @Override
   public boolean equals(Object o1) {
      if (this == o1) return true;
      if (o1 == null || getClass() != o1.getClass()) return false;
      Krug krug = (Krug) o1;
      return o.equals(krug.o) && Double.compare(krug.r, r) == 0;
   }

   @Override
   public int hashCode() {
      return Objects.hash(o, r);
   }

   @Override
   public String toString() {
      return uzmiOznaku() + ":[" + o + ";" + r + "]";
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
      return 2 * r * Math.PI;
   }

   @Override
   public double povrsina() {
      return Math.pow(r, 2) * Math.PI;
   }

}
