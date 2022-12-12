package rs.math.oop.g09.p03.apstraktnaKrugTrougaoCervorougao;

import java.util.Objects;

public class Cetvorougao extends GeometrijskiObjekat {
   private Tacka a;
   private Tacka b;
   private Tacka c;
   private Tacka d;

   private static int najblizaPocetku(Tacka o, Tacka[] temena) {
      int ind = 0;
      for(int i = 1; i< temena.length; i++)
         if( temena[ind].rastojanje(o) > temena[i].rastojanje(o)
                 || (temena[ind].rastojanje(o) == temena[i].rastojanje(o)
                 && temena[ind].uzmiX()> temena[i].uzmiX()))
            ind = i;
      return ind;
   }

   public Cetvorougao(String oznaka, Tacka a, Tacka b,
                      Tacka c, Tacka d) {
      super(oznaka);
      Tacka o = Tacka.KOORDINATNI_POCETAK;
      Tacka[] temena = {a, b, c, d};
      int ind = najblizaPocetku(o, temena);
      this.a = new Tacka(temena[ind]);
      this.b = new Tacka(temena[(ind+1) % temena.length]);
      this.c = new Tacka(temena[(ind+2) % temena.length]);
      this.d = new Tacka(temena[(ind+3) % temena.length]);
   }

   public Cetvorougao(Tacka a, Tacka b, Tacka c, Tacka d) {
      this("", a, b, c, d);
   }

   public Cetvorougao(final Cetvorougao cetv) {
      this(cetv.uzmiOznaku(), cetv.a, cetv.b, cetv.c,
            cetv.d);
   }

   @Override
   public boolean sadrzi(Tacka t) {
      Prava p = new Prava(a, c);
      if (p.suSaRaznihStranaPrave(b, d)) {
         Trougao t1 = new Trougao(a, c, b);
         Trougao t2 = new Trougao(a, c, d);
         return t1.sadrzi(t) || t2.sadrzi(t);
      } else {
         Trougao t1 = new Trougao(b, d, a);
         Trougao t2 = new Trougao(b, d, c);
         return t1.sadrzi(t) || t2.sadrzi(t);
      }
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      Cetvorougao cet = (Cetvorougao) o;
      return a.equals(cet.a) && b.equals(cet.b) && c.equals(cet.c) && d.equals(cet.d);
   }

   @Override
   public int hashCode() {
      return Objects.hash(a, b, c, d);
   }

   @Override
   public String toString() {
     return uzmiOznaku() + ":[" + a + ";" + b + ";" + c + ";" + d + "]";
   }

   @Override
   public boolean jeKonveksan() {
      Prava p = new Prava(a, b);
      if (p.suSaRaznihStranaPrave(c, d))
         return false;
      p = new Prava(b, c);
      if (p.suSaRaznihStranaPrave(a, d))
         return false;
      p = new Prava(c, d);
      if (p.suSaRaznihStranaPrave(a, b))
         return false;
      p = new Prava(d, a);
      if (p.suSaRaznihStranaPrave(b, c))
         return false;
      return true;
   }

   @Override
   public boolean jeOgranicen() {
      return true;
   }

   @Override
   public double obim() {
      return a.rastojanje(b) + b.rastojanje(c) + c.rastojanje(d) + d.rastojanje(a);
   }

   @Override
   public double povrsina() {
      Prava p = new Prava(a, c);
      if (p.suSaRaznihStranaPrave(b, d)) {
         Trougao t1 = new Trougao(a, c, b);
         Trougao t2 = new Trougao(a, c, d);
         return t1.povrsina() + t2.povrsina();
      } else {
         Trougao t1 = new Trougao(b, d, a);
         Trougao t2 = new Trougao(b, d, c);
         return t1.povrsina() + t2.povrsina();
      }
   }


}
