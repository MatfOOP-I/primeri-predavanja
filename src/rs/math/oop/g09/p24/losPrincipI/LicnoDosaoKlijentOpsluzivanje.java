package rs.math.oop.g09.p24.losPrincipI;

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
      err.println("Немогуће платити он-лајн за клијента који је лично дошао!");
   }

   @Override
   public void staniURedZaLicnuPorudzbinu() {
      out.println("Реализује се стајање у ред клијента који је лично дошао!");
   }

   @Override
   public void platiLicno() {
      out.println("Реализује се плаћање за клијента који је лично дошао!");
   }
}
