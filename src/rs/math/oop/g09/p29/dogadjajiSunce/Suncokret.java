package rs.math.oop.g09.p29.dogadjajiSunce;

public class Suncokret extends Cvet implements SunceKretanjeDogadjajOsluskivac {
   @Override
   public void sunceSePomerilo(SunceKretanjeDogadjaj e) {
      if (e.isIzaslo())
         System.out.println("Suncokret je rasirio svoj cvet");
      if (e.isZaslo())
         System.out.println("Suncokret je sakupio svoj cvet");
   }
   
   @Override
   public String toString() {
      return String.format("Suncokret");
   }
}
