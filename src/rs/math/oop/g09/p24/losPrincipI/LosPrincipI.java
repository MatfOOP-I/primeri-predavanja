package rs.math.oop.g09.p24.losPrincipI;

public class LosPrincipI {

   public static void main(String[] argumenti){
      Restoran onLineObrada = new OnLajnKlijentOpsluzivanje();
      Restoran telefonskObrada = new TelefonskiKlijentOpsluzivanje();
      Restoran naLicuMestaObrada = new LicnoDosaoKlijentOpsluzivanje();

      OnLajnKlijent klijent = new OnLajnKlijent("Петар Петровић", "Барска 48",
            "petar@math.rs", onLineObrada);
      klijent.uzmiHraniSe().prihvatiOnLajnPorudzbinu();
      klijent.uzmiHraniSe().platiLicno();
      klijent.uzmiHraniSe().platiOnLajn();

      klijent.postaviHraniSe(telefonskObrada);
      klijent.uzmiHraniSe().prihvatiOnLajnPorudzbinu();
      klijent.uzmiHraniSe().prihvatiTelefonskuPorudzbinu();
      klijent.uzmiHraniSe().platiOnLajn();
      klijent.uzmiHraniSe().platiLicno();
   }
}
