package rs.math.oop.g09.p28.dobarPrincipDMetodPostavi;

import static java.lang.System.out;

public class KlijentA implements Klijent {
   private Servis servis;

   public KlijentA(Servis servis) {
      this.servis = servis;
   }

   public void postaviServis(Servis servis) {
      this.servis = servis;
   }

   @Override
   public void uradiNesto() {
      String info = servis.uzmiInfo();
      out.println("KlijentA - " + info);
   }
}
