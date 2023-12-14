package rs.math.oop.g09.p30b.dogadjajiIzvor;

import java.util.EventListener;

/**
 * ugovor izmedju izvora dogadjaja i objekata koji osluskuju
 */
public interface SunceKretanjeDogadjajOsluskivac extends EventListener {
   /**
    * Poziva se kada bude ispaljen dogadjaj da je sunce izaslo/zaslo
    */
   public void sunceSePomerilo(SunceKretanjeDogadjaj e);
}

