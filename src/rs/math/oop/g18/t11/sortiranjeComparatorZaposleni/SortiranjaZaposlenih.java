package rs.math.oop.g18.t11.sortiranjeComparatorZaposleni;

import java.util.*;

public class SortiranjaZaposlenih {
    public static void main(String[] args) {
        Zaposleni[] osoblje = new Zaposleni[4];

        osoblje[0] = new Zaposleni("Marko Markovic", 30_000);
        osoblje[1] = new Zaposleni("Janko Jankovic", 75_000);
        osoblje[2] = new Zaposleni("Tony Tester", 30_000);
        osoblje[3] = new Zaposleni("Milena Milenkovic", 18_000);

        System.out.println("-Pre sortiranja-");
        for (Zaposleni e : osoblje)
            System.out.println("ime=" + e.getIme() + ",plata=" + e.getPlata());

        final Comparator<Zaposleni> PO_IMENU =  (x, y) -> x.getIme().compareTo(y.getIme()); 
        System.out.println("-Po imenu-");
        Arrays.sort(osoblje, PO_IMENU);
        for (Zaposleni e : osoblje)
            System.out.println("ime=" + e.getIme() + ",plata=" + e.getPlata());
        System.out.println("-Po imenu (obrnuto)-");
        Arrays.sort(osoblje, PO_IMENU.reversed());
        for (Zaposleni e : osoblje)
            System.out.println("ime=" + e.getIme() + ",plata=" + e.getPlata());

        final Comparator<Zaposleni> PO_PLATI = (x, y) -> (int) (x.getPlata() - y.getPlata());
        System.out.println("-Po plati-");
        Arrays.sort(osoblje, PO_PLATI);
        for (Zaposleni e : osoblje)
            System.out.println("ime=" + e.getIme() + ",plata=" + e.getPlata());

        System.out.println("-Po plati, pa po imenu-");
        Arrays.sort(osoblje, PO_PLATI.thenComparing(PO_IMENU));
        for (Zaposleni e : osoblje)
            System.out.println("ime=" + e.getIme() + ",plata=" + e.getPlata());
        System.out.println("-Po plati, pa po imenu (obrnuto)-");
        Arrays.sort(osoblje, PO_PLATI.thenComparing(PO_IMENU.reversed()));
        for (Zaposleni e : osoblje)
            System.out.println("ime=" + e.getIme() + ",plata=" + e.getPlata());

    }
}
