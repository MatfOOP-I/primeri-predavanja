package rs.math.oop.g09.p23.losPrincipI;

import static java.lang.System.err;
import static java.lang.System.out;

public class LicnoDosaoKlijentOpsluzivanje implements Restoran {

   @Override
   public void prihvatiOnLajnPorudzbinu() {
      err.println("Немогуће прихватити он-лајн поруџбину за клијента који је лично дошао!");
   }

   @Override
   public void prihvatiTelefonskuPorudzbinu() {
      err.println("Немогуће прихватити телефонску поруџбину за клијента који је лично дошао!");
   }

   @Override
   public void platiOnLajn() {
      err.println("Nemoguce platiti on lajn za za klijenta koji je licno dosao!");
   }

   @Override
   public void staniURedZaLicnuPorudzbinu() {
      out.println("Realizuje se stajanje u red klijenta koji je licno dosao!");
   }

   @Override
   public void platiLicno() {
      out.println("Realizuje se placanje za klijenta koji je licno dosao!");
   }
}
