package rs.math.oop.g18.p03b.pretragaPrikazPredicateKombinacijaOsoba;

import java.util.function.Predicate;

public class PredicateLambdaPretragaLikovaCrtani {

    public static <T> void prikazi(Iterable<T> prolazna, Predicate<T> predikat) {
        for (T elem : prolazna) {
            if (predikat.test(elem)) {
                System.out.println(elem);
            }
        }
    }

    public static void main(String[] args) {
        Predicate<Osoba> uslov = (x -> x.getBrojGodina() >= 81);
        prikazi(Osoba.LIKOVI_CRTANI, uslov);
        System.out.println("---");
        uslov = uslov.and(p -> p.getEmailAdresa().indexOf("disney") >= 0);
        prikazi(Osoba.LIKOVI_CRTANI, uslov);
        System.out.println("---");
        uslov = uslov.or(p -> p.getEmailAdresa().indexOf("wb") >= 0);
        prikazi(Osoba.LIKOVI_CRTANI, uslov);
        System.out.println("---");
        uslov = uslov.negate();
        prikazi(Osoba.LIKOVI_CRTANI, uslov);
        System.out.println("---");
        Predicate<Osoba> uslov2 = (o -> o.getBrojGodina() >= 81);
        uslov2 = uslov2.and(x -> x.getIme().startsWith("M")).or(y -> y.getEmailAdresa().endsWith("wb.com")).negate();
        prikazi(Osoba.LIKOVI_CRTANI, uslov);
        System.out.println("---");
    }

}
