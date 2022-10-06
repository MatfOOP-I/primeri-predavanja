package rs.math.oop.g09.p23.losPrincipI;

public class LosPrincipI {

   public static void main(String[] argumenti){
      Restoran onLineObrada = new OnLajnKlijentOpsluzivanje();
      Restoran telefonskObrada = new TelefonskiKlijentOpsluzivanje();
      Restoran naLicuMestaObrada = new LicnoDosaoKlijentOpsluzivanje();

      OnLajnKlijent klijent = new OnLajnKlijent("Петар Петровић", "Барска 48",
            "petar@math.rs", onLineObrada);
      klijent.getHraniSe().prihvatiOnLajnPorudzbinu();
      klijent.getHraniSe().platiLicno();
      klijent.getHraniSe().platiOnLajn();

      klijent.setHraniSe(telefonskObrada);
      klijent.getHraniSe().prihvatiOnLajnPorudzbinu();
      klijent.getHraniSe().prihvatiTelefonskuPorudzbinu();
      klijent.getHraniSe().platiOnLajn();
      klijent.getHraniSe().platiLicno();
   }
}
