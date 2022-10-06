package rs.math.oop.g09.p10.interfejsGeometrija;

import java.util.Objects;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Krug extends GeometrijskiObjekat implements MeraOblikSadrzavanje {
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

   @Override
   public boolean equals(Object o1) {
      if (this == o1) return true;
      if (o1 == null || getClass() != o1.getClass()) return false;
      Krug krug = (Krug) o1;
      return Double.compare(krug.r, r) == 0 &&
            o.equals(krug.o);
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
      return 2 * r * PI;
   }

   @Override
   public double povrsina() {
      return pow(r, 2) * PI;
   }

   @Override
   public boolean sadrzi(Tacka t) {
      return t.rastojanje(o) <= r;
   }
}
