package rs.math.oop.g09.p03.apstraktnaKrugTrougaoCervorougao;

import java.util.Objects;

import static java.lang.Math.abs;

public class Prava extends GeometrijskiObjekat {

   private double a;
   private double b;
   private double c;

   public Prava(String oznaka, double a, double b,
                double c) {
      super(oznaka);
      this.a = a;
      this.b = b;
      this.c = c;
   }

   public Prava(double a, double b, double c) {
      this("", a, b, c);
   }

   public Prava(String oznaka, Tacka t1, Tacka t2) {
      super(oznaka);
      a = t2.uzmiY() - t1.uzmiY();
      b = t1.uzmiX() - t2.uzmiX();
      c = t1.uzmiY() * (t2.uzmiX() - t1.uzmiX()) - t1.uzmiX() * (t2.uzmiY() - t1.uzmiY());
   }

   public Prava(Tacka t1, Tacka t2) {
      this("", t1, t2);
   }

   public Prava(Prava p) {
      this(p.uzmiOznaku(), p.a, p.b, p.c );
   }

   private double uvrstiKoordinate(Tacka t) {
      return a * t.uzmiX() + b * t.uzmiY() + c;
   }

   public boolean suSaIsteStranePrave(Tacka t1, Tacka t2) {
      return uvrstiKoordinate(t1) * uvrstiKoordinate(t2) > 0;
   }

   public boolean suSaRaznihStranaPrave(Tacka t1, Tacka t2) {
      return !suSaIsteStranePrave(t1, t2);
   }

   @Override
   public boolean equals(Object o) {
      if (this == o)
         return true;
      if (o == null)
         return false;
      if (!(o instanceof Prava))
         return false;
      Prava q = (Prava) o;
      if (a / q.a == b / q.b && a / q.a == c / q.c)
         return true;
      return false;
   }

   @Override
   public int hashCode() {
      double m = a;
      if (abs(b) > abs(m))
         m = b;
      if (abs(c) > abs(m))
         m = c;
      return Objects.hash(a/m, b/m, c/m);
   }

   @Override
   public String toString() {
      return uzmiOznaku() + ":[a=" + a + ";b=" + b + ";c=" + c + "]";
   }

   @Override
   public boolean jeKonveksan() {
      return true;
   }

   @Override
   public boolean jeOgranicen() {
      return false;
   }

   @Override
   public double obim() {
      return Double.POSITIVE_INFINITY;
   }

   @Override
   public double povrsina() {
      return 0;
   }

   @Override
   public boolean sadrzi(Tacka t) {
      return ( Double.compare( uvrstiKoordinate(t), 0) == 0);
   }
}
