package rs.math.oop.g09.p29.dogadjajiSunce;

import java.util.EventListener;

/**
 * ugovor izmedju izvora dogadjaja i objekata koji osluskuju
 */
public interface SunceKretanjeDogadjajOsluskivac extends EventListener {

   public void sunceSePomerilo(SunceKretanjeDogadjaj e);
}

