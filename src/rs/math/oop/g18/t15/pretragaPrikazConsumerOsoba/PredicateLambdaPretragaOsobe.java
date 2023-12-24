package rs.math.oop.g18.t15.pretragaPrikazConsumerOsoba;

import java.util.function.Consumer;
import java.util.function.Predicate;

import static java.lang.System.*;

public class PredicateLambdaPretragaOsobe {

    public static <T> void obradi(Iterable<T> prolazna, Predicate<T> predikat, Consumer<T> potrosac) {
        for (T elem : prolazna) {
            if (predikat.test(elem)) {
                potrosac.accept(elem);
            }
        }
    }

    public static void main(String[] args) {
        for (Osoba o : Osoba.LIKOVI_CRTANI)
            o.prikazi();
        System.out.println("---");
        obradi(Osoba.LIKOVI_CRTANI, o -> o.getBrojGodina() >= 50, o -> o.prikazi());
        System.out.println("---");
        obradi(Osoba.LIKOVI_CRTANI, x -> x.getBrojGodina() >= 80, y -> out.println(y));
        System.out.println("---");
        obradi(Osoba.LIKOVI_CRTANI, o -> o.getBrojGodina() >= 80 && o.getBrojGodina() <= 85,
                x -> out.println(x.getEmailAdresa()));
        System.out.println("---");
        obradi(Osoba.LIKOVI_CRTANI, o -> o.getEmailAdresa().indexOf("disney") >= 0, o -> o.prikazi());
        System.out.println("---");
        obradi(Osoba.LIKOVI_CRTANI, o -> o.getPol() == Osoba.Pol.ZENA && o.getEmailAdresa().indexOf("disney") >= 0,
                o -> o.prikazi());
        System.out.println("---");
    }

}
