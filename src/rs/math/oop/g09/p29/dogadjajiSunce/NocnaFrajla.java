package rs.math.oop.g09.p29.dogadjajiSunce;

public class NocnaFrajla extends Cvet implements SunceKretanjeDogadjajOsluskivac {
   @Override
   public void sunceSePomerilo(SunceKretanjeDogadjaj e) {
      if (e.jeIzaslo())
         System.out.println("Nocna frajla je sakupila svoj cvet");
      if (e.jeZaslo())
         System.out.println("Nocna frajla je rasirila svoj cvet");
   }
   
   @Override
   public String toString() {
      return String.format("Nocna frajla");
   }
}
