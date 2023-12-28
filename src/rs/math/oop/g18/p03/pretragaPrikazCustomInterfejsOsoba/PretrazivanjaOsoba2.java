package rs.math.oop.g18.p03.pretragaPrikazCustomInterfejsOsoba;

public class PretrazivanjaOsoba2 {

    public static <T>  void filtirajPrikazi(Iterable<T> prolazna, KriterijumPretrage<T> kriterijum) {
        for (T elem : prolazna) {
            if (kriterijum.proveri(elem)) {
                System.out.println(elem);
            }
        }
    }

    public static void main(String[] args) {
        for (Osoba o : Osoba.LIKOVI_CRTANI)
            o.prikazi();
        System.out.println("---");
        filtirajPrikazi(Osoba.LIKOVI_CRTANI, o -> o.getBrojGodina() >= 50);
        System.out.println("---");
        filtirajPrikazi(Osoba.LIKOVI_CRTANI, lik -> lik.getBrojGodina() >= 80);
        System.out.println("---");
        filtirajPrikazi(Osoba.LIKOVI_CRTANI, o ->o.getBrojGodina() >= 80 && o.getBrojGodina() <= 85);
        System.out.println("---");
        filtirajPrikazi(Osoba.LIKOVI_CRTANI, new KriterijumPretrage<Osoba>() {

            public boolean proveri(Osoba o) {
                return o.getEmailAdresa().indexOf("disney") >= 0;
            }
        });
        System.out.println("---");
        filtirajPrikazi(Osoba.LIKOVI_CRTANI, new KriterijumPretrage<Osoba>() {
            public boolean proveri(Osoba o) {
                return o.getPol() == Osoba.Pol.ZENA && o.getEmailAdresa().indexOf("disney") >= 0;
            }
        });
        System.out.println("---");
    }

}
