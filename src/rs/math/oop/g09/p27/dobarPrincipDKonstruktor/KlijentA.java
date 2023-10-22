package rs.math.oop.g09.p27.dobarPrincipDKonstruktor;

import static java.lang.System.out;

public class KlijentA implements Klijent {
   private Servis servis;

   public KlijentA(Servis servis) {
      this.servis = servis;
   }

   @Override
   public void uradiNesto() {
      String info = servis.uzmiInfo();
      out.println("KlijentA - " + info);
   }
}
