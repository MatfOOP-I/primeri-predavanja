package rs.math.oop.g09.p03.apstraktnaKrugTrougaoCervorougao;

import java.util.Objects;


public class Trougao extends GeometrijskiObjekat {
   private Tacka a;
   private Tacka b;
   private Tacka c;

   private static int indikatorNajblizePocetku(Tacka[] temena) {
      int ind = 0;
      for(int i = 1; i< temena.length; i++)
         if( temena[ind].rastojanje(Tacka.KOORDINATNI_POCETAK) > temena[i].rastojanje(Tacka.KOORDINATNI_POCETAK)
                 || (temena[ind].rastojanje(Tacka.KOORDINATNI_POCETAK) == temena[i].rastojanje(Tacka.KOORDINATNI_POCETAK)
                 && temena[ind].uzmiX()> temena[i].uzmiX()))
            ind = i;
      return ind;
   }

   public Trougao(String oznaka, Tacka a, Tacka b, Tacka c) {
      super(oznaka);
      Tacka[] temena = {a, b, c};
      int ind = indikatorNajblizePocetku(temena);
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

   private boolean pripadaIvici(Tacka t) {
      Duz ivica = new Duz(a, b);
      if (ivica.sadrzi(t))
         return true;
      ivica = new Duz(b, c);
      if (ivica.sadrzi(t))
         return true;
      ivica = new Duz(c, a);
      if (ivica.sadrzi(t))
         return true;
      return false;
   }

   private boolean pripadaUnutrasnjosti(Tacka t) {
      Prava pAB = new Prava(a, b);
      Prava pBC = new Prava(b, c);
      Prava pCA = new Prava(c, a);
      return pAB.suSaIsteStranePrave(c, t)
              && pBC.suSaIsteStranePrave(a, t)
              && pCA.suSaIsteStranePrave(b, t);
   }

   @Override
   public boolean sadrzi(Tacka t) {
      if (pripadaIvici(t))
         return true;
      return pripadaUnutrasnjosti(t);
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || !(o instanceof Trougao)) return false;
      Trougao trougao = (Trougao) o;
      return a.equals(trougao.a) &&
            b.equals(trougao.b) &&
            c.equals(trougao.c);
   }

   @Override
   public int hashCode() {
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
      return Math.sqrt(s * (s - ab) * (s - bc) * (s - ca));
   }

}
