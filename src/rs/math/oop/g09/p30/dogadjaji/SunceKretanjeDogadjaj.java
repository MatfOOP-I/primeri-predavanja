package rs.math.oop.g09.p30.dogadjaji;

import java.time.LocalDateTime;
import java.util.EventObject;

/**
 * Dogadjaj koji predstavlja izlazak ili zalazak sunca
 */
public class SunceKretanjeDogadjaj extends EventObject {
  private final boolean izaslo;
  private final LocalDateTime datumVreme;

  public SunceKretanjeDogadjaj(Object source, boolean izasloSunce, LocalDateTime vremeIzlaska) {
    super(source);
    this.izaslo = izasloSunce;
    this.datumVreme = vremeIzlaska;
  }

  /** vrace nisku koja predstavlja datum i vreme */
  public LocalDateTime uzmiDatumVreme() {
    return datumVreme;
  }

  /** vrace da li je sunce izaslo ili zaslo */
  public boolean jesteIzaslo() {
    return izaslo;
  }

  /** vrace da li je sunce zaslo ili izaslo */
  public boolean jesteZaslo() {
    return ! izaslo;
  }

}