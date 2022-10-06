package rs.math.oop.g09.p27.dobarPrincipDMetodPostavi;

public class DobarPrincipDMetodPostavi {

   public static void main(String[] args){
      Servis sB = new ServisB();
      Servis sC = new ServisC();
      Servis sD = new ServisD();

      KlijentA ka = new KlijentA(sB);
      ka.uradiNesto();

      ka.postaviServis(sC);
      ka.uradiNesto();

      ka.postaviServis(sD);
      ka.uradiNesto();
   }

}
