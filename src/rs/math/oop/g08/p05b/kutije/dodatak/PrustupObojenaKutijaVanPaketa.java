package rs.math.oop.g08.p05b.kutije.dodatak;

import rs.math.oop.g08.p05b.kutije.Kutija;
import rs.math.oop.g08.p05b.kutije.ObojenaKutija;

public class PrustupObojenaKutijaVanPaketa {

    private static void ispitajInformisi(Object o) {
        if(o instanceof Kutija)
            System.out.println(o + " je kutija");
        else
            System.out.println(o +" nije kutija");
        if(o instanceof ObojenaKutija)
            System.out.println(o + " je obojena kutija");
        else
            System.out.println(o + " nije obojena kutija");
    }

    public static void main(String[] args) {

        Object o = new ObojenaKutija();
        ObojenaKutija ok = (ObojenaKutija) o; // ово је у реду
        ispitajInformisi(o);
        ispitajInformisi(ok);
        //int i = ok.sirina;
        //String s = ok.boja;

        Object o2 = new Kutija();
        ispitajInformisi(o2);
        ObojenaKutija ok2 = (ObojenaKutija) o2; // грешка приликом извршавања

        ispitajInformisi("miki maus");
    }

}
