package rs.math.oop.g02.p02a.kasnoVezivanje;

class Student extends Covek {
    int brojIndeksa;
    boolean naBudzetu;

    void stampajPodatke() {
        System.out.println("Име студента је: " + ime
                + ", број индекса је: " + brojIndeksa
                + "/ На буџету: " + naBudzetu + ".");
    }

}
