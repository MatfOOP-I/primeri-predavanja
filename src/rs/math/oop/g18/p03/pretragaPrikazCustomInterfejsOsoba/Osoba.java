package rs.math.oop.g18.p03.pretragaPrikazCustomInterfejsOsoba;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.List;

public class Osoba {

    public enum Pol {
        MUSKARAC, ZENA
    }

    private String ime;
    private LocalDate datumRodjenja;
    private Pol pol;
    private String emailAdresa;

    public static List<Osoba> LIKOVI_CRTANI;

    public Osoba(String ime, LocalDate datumRodjenja, Pol pol, String emailAddress) {
        this.ime = ime;
        this.datumRodjenja = datumRodjenja;
        this.pol = pol;
        this.emailAdresa = emailAddress;
    }

    public long getBrojGodina() {
        return datumRodjenja.until(LocalDate.now(), ChronoUnit.YEARS);
    }

    public String getEmailAdresa() {
        return emailAdresa;
    }

    public Pol getPol() {
        return pol;
    }

    @Override
    public String toString() {
        return ime + " " + pol + " " + datumRodjenja + " " + getBrojGodina() + " " + emailAdresa;
    }

    public void prikazi() {
        System.out.println(this);
    }

    static {
        Osoba[] crtani = { new Osoba("Miki Maus", LocalDate.of(1928, 5, 7), Pol.MUSKARAC, "mickey.mouse@disney.com"),
                new Osoba("Paja Patak", LocalDate.of(1932, 5, 17), Pol.MUSKARAC, "donald.duck@disney.com"),
                new Osoba("Dusko Dugousko", LocalDate.of(1956, 7, 7), Pol.MUSKARAC, "bugs.buney@wb.com"),
                new Osoba("Mini Maus", LocalDate.of(1929, 5, 7), Pol.ZENA, "miney.mouse@disney.com"),
                new Osoba("Silja", LocalDate.of(1940, 5, 7), Pol.MUSKARAC, "guffy@disney.com"),
                new Osoba("Patak Daca", LocalDate.of(1945, 5, 7), Pol.MUSKARAC, "duffy.duck@wb.com"),
                new Osoba("Hromi Daba", LocalDate.of(1940, 5, 7), Pol.MUSKARAC, "hromi.daba@disney.com") };
        LIKOVI_CRTANI = Arrays.asList(crtani);
    }

}
