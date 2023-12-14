package rs.math.oop.g18.t13.pretragaPrikazCustomInterfaceLambdaOsoba;

import java.util.function.Predicate;

public class OsobePretraga02LambdaPredicatePokretanje {

    public static <T> void prikazi(Iterable<T> prolazna, Predicate<T> predikat) {
        for (T elem : prolazna) {
            if (predikat.test(elem)) {
                System.out.println(elem);
            }
        }
    }

    public static void main(String[] args) {
        for (Osoba o : Osoba.LIKOVI_CRTANI)
            o.prikazi();
        System.out.println("---");
        prikazi(Osoba.LIKOVI_CRTANI, (Osoba o) -> {
            return o.getBrojGodina() >= 50;
        });
        System.out.println("---");
        prikazi(Osoba.LIKOVI_CRTANI, (Osoba o) -> o.getBrojGodina() >= 80);
        System.out.println("---");
        prikazi(Osoba.LIKOVI_CRTANI, (o) -> o.getBrojGodina() >= 80 && o.getBrojGodina() <= 85);
        System.out.println("---");
        prikazi(Osoba.LIKOVI_CRTANI, o -> o.getEmailAdresa().indexOf("disney") >= 0);
        System.out.println("---");
        prikazi(Osoba.LIKOVI_CRTANI, o -> o.getPol() == Osoba.Pol.ZENA && o.getEmailAdresa().indexOf("disney") >= 0);
        System.out.println("---");
    }

}
