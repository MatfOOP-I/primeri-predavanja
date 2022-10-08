package rs.math.oop.g09.p23.losPrincipI;

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

   public Restoran getHraniSe() {
      return hraniSe;
   }

   public void setHraniSe(Restoran hraniSe) {
      this.hraniSe = hraniSe;
   }

}
