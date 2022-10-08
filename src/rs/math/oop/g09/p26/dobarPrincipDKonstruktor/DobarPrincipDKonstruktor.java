package rs.math.oop.g09.p26.dobarPrincipDKonstruktor;

public class DobarPrincipDKonstruktor {

   public static void main(String[] args){
      Servis sB = new ServisB();
      Servis sC = new ServisC();
      Servis sD = new ServisD();

      Klijent kA = new KlijentA(sB);
      kA.uradiNesto();

      kA = new KlijentA(sC);
      kA.uradiNesto();

      kA = new KlijentA(sD);
      kA.uradiNesto();
   }

}
