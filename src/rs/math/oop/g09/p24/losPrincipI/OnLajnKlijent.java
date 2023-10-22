package rs.math.oop.g09.p24.losPrincipI;

public class OnLajnKlijent {
   private String ime;
   private String adresa;
   private String email;
   private Restoran hraniSe;

   public OnLajnKlijent(String ime, String adresa, String email, Restoran hraniSe) {
      this.ime = ime;
      this.adresa = adresa;
      this.email = email;
      this.hraniSe = hraniSe;
   }

   public Restoran uzmiHraniSe() {
      return hraniSe;
   }

   public void postaviHraniSe(Restoran hraniSe) {
      this.hraniSe = hraniSe;
   }

}
