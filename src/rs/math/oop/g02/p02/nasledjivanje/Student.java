package rs.math.oop.g02.p02.nasledjivanje;

class Student {

    String imePrezime;
    int brojIndeksa;
    boolean naBudzetu;
    
    /**
    Stampa podatke.

    <p>На конзоли приказује име студента, број индекса и информацију да ли је студент на буџету.
     */
    void stampajPodatke() {
        System.out.println("Име студента је: " + imePrezime
            + ", број индекса је: " + brojIndeksa + "/ На буџету: " + naBudzetu + ".");
    }
}
