package rs.math.oop.g02.p02.nasledjivanje;

class Student {
    String ime;
    int brojIndeksa;
    boolean naBudzetu;
    void stampajPodatke() {
        System.out.println("Име студента је: " + ime
             + ", број индекса је: " + brojIndeksa + "/ На буџету: " + naBudzetu + ".");
    }
}
