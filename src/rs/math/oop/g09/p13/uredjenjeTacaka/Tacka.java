package rs.math.oop.g09.p13.uredjenjeTacaka;

import java.util.Objects;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Tacka extends GeometrijskiObjekat implements Comparable{

   private double x;
   private double y;

   public Tacka(String oznaka, double x, double y) {
      super(oznaka);
      this.x = x;
      this.y = y;
   }

   public Tacka(double x, double y) {
      this("", x, y);
   }

   public Tacka(String oznaka) {
      this(oznaka, 0, 0);
   }

   public Tacka() {
      this("O", 0, 0);
   }

   public Tacka(Tacka t) {
      this(t.uzmiOznaku(), t.x, t.y);
   }

   public double uzmiX() {
      return x;
   }

   public void postaviX(double x) {
      this.x = x;
   }

   public double uzmiY() {
      return y;
   }

   public void postaviY(double y) {
      this.y = y;
   }


   public double rastojanje(Tacka t) {
      return sqrt(pow(t.x - x, 2) + pow(t.y - y, 2));
   }

   @Override
   public boolean equals(Object o) {
      if (this == o)
         return true;
      if (o == null || getClass() != o.getClass())
         return false;
      Tacka tacka = (Tacka) o;
      return Double.compare(tacka.uzmiX(), uzmiX()) == 0 &&
            Double.compare(tacka.uzmiY(), uzmiY()) == 0;
   }

   @Override
   public int hashCode() {
      return Objects.hash(uzmiX(), uzmiY());
   }

   @Override
   public String toString() {
      return uzmiOznaku() + "(" + x + "," + y + ")";
   }

   @Override
   public int compareTo(Object obj) {
        if (!(obj instanceof Tacka))
            return -1; // Tacka је увек испред нечег што није тачка
        Tacka t = (Tacka) obj;
        Tacka o = new Tacka(0, 0);
        double razlika = rastojanje(o) - t.rastojanje(o);
        if (razlika < 0) return -1;
        if (razlika > 0) return 1;
        return (int)(y - t.y);
   }
}
