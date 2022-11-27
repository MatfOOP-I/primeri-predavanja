package rs.math.oop.g09.p02.apstraktnaTackaDuzPrava;

import java.util.Objects;

public class Tacka extends GeometrijskiObjekat {

   public static final Tacka KOORDINATNI_POCETAK = new Tacka("O", 0,0);

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
      this(Tacka.KOORDINATNI_POCETAK);
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
      return Math.sqrt(Math.pow(t.uzmiX() - uzmiX(), 2)
              + Math.pow(t.uzmiY() - uzmiY(), 2));
   }

   @Override
   public boolean equals(Object o) {
      if (this == o)
         return true;
      if (o == null || !(o instanceof Tacka))
         return false;
      Tacka tacka = (Tacka) o;
      return Double.compare(tacka.x, x) == 0
         && Double.compare(tacka.y, y) == 0;
   }

   @Override
   public int hashCode() {
      return Objects.hash(x, y);
   }

   @Override
   public String toString() {
      return uzmiOznaku() + "(" + uzmiX() + "," + uzmiY() + ")";
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
      return 0;
   }

   @Override
   public double povrsina() {
      return 0;
   }

   @Override
   public boolean sadrzi(Tacka t) {
      return (x==t.x && y==t.y);
   }

}
