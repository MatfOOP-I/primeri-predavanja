package rs.math.oop.g18.p03a.pretragaPrikazPredicateOsoba;

import java.util.function.Predicate;

public class PretrazivanjaOsoba2 {

    public static <T>  void filtrirajPrikazi(Iterable<T> prolazna, Predicate<T> kriterijum) {
        for (T elem : prolazna) {
            if (kriterijum.test(elem)) {
                System.out.println(elem);
            }
        }
    }

    public static void main(String[] args) {
        for (Osoba o : Osoba.LIKOVI_CRTANI)
            o.prikazi();
        System.out.println("---");
        filtrirajPrikazi(Osoba.LIKOVI_CRTANI, o -> o.getBrojGodina() >= 50);
        System.out.println("---");
        filtrirajPrikazi(Osoba.LIKOVI_CRTANI, new Predicate<Osoba>() {
            public boolean test(Osoba o) {
                return o.getBrojGodina() >= 80;
            }
        });
        System.out.println("---");
        filtrirajPrikazi(Osoba.LIKOVI_CRTANI, new Predicate<Osoba>() {
            public boolean test(Osoba o) {
                return o.getBrojGodina() >= 80 && o.getBrojGodina() <= 85;
            }
        });
        System.out.println("---");
        filtrirajPrikazi(Osoba.LIKOVI_CRTANI, new Predicate<Osoba>() {

            public boolean test(Osoba o) {
                return o.getEmailAdresa().indexOf("disney") >= 0;
            }
        });
        System.out.println("---");
        filtrirajPrikazi(Osoba.LIKOVI_CRTANI, new Predicate<Osoba>() {
            public boolean test(Osoba o) {
                return o.getPol() == Osoba.Pol.ZENA && o.getEmailAdresa().indexOf("disney") >= 0;
            }
        });
        System.out.println("---");
    }

}
