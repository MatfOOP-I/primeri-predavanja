package rs.math.oop.g09.p09.interfejsGeometrija;

import java.util.Objects;

import static java.lang.Math.sqrt;

public class Trougao extends GeometrijskiObjekat implements MeraOblikSadrzavanje {
   private Tacka a;
   private Tacka b;
   private Tacka c;

   public Trougao(String oznaka, Tacka a, Tacka b, Tacka c) {
      super(oznaka);
      Tacka o = new Tacka(0,0);
      Tacka[] temena = {a, b, c};
      int ind = 0;
      for(int i=1; i< temena.length; i++)
         if( temena[ind].rastojanje(o) > temena[i].rastojanje(o)
           || (temena[ind].rastojanje(o) == temena[i].rastojanje(o)
              && temena[ind].uzmiX()>temena[i].uzmiX()))
                  ind = i;
      this.a = new Tacka(temena[ind]);
      this.b = new Tacka(temena[(ind+1) % temena.length]);
      this.c = new Tacka(temena[(ind+2) % temena.length]);
   }

   public Trougao(Tacka a, Tacka b, Tacka c) {
      this("", a, b, c);
   }

   public Trougao(Trougao tr) {
      this(tr.uzmiOznaku(), tr.a, tr.b, tr.c);
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      Trougao trougao = (Trougao) o;
      return (a.equals(trougao.a) &&
            b.equals(trougao.b) &&
            c.equals(trougao.c))
            || (a.equals(trougao.b) &&
            b.equals(trougao.c) &&
            c.equals(trougao.a))
            || (a.equals(trougao.c) &&
            b.equals(trougao.a) &&
            c.equals(trougao.b));
   }

   @Override
   public int hashCode() {
      Tacka o = new Tacka(0, 0);
      return Objects.hash(a, b, c);
   }

   @Override
   public String toString() {
      return uzmiOznaku() + ":[" + a + ";" + b + ";" + c + "]";
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
      return a.rastojanje(b) + b.rastojanje(c) + c.rastojanje(a);
   }

   @Override
   public double povrsina() {
      double ab = a.rastojanje(b);
      double bc = b.rastojanje(c);
      double ca = c.rastojanje(a);
      double s = (ab + bc + ca) / 2;
      return sqrt(s * (s - ab) * (s - bc) * (s - ca));
   }

   @Override
   public boolean sadrzi(Tacka t) {
      Duz ivica = new Duz(a, b);
      if (ivica.sadrzi(t))
         return true;
      ivica = new Duz(b, c);
      if (ivica.sadrzi(t))
         return true;
      ivica = new Duz(c, a);
      if (ivica.sadrzi(t))
         return true;
      Prava p = new Prava(a, b);
      if (p.suSaRaznihStranaPrave(c, t))
         return false;
      p = new Prava(b, c);
      if (p.suSaRaznihStranaPrave(a, t))
         return false;
      p = new Prava(c, a);
      if (p.suSaRaznihStranaPrave(b, t))
         return false;
      return true;
   }
}
