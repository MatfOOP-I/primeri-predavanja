package rs.math.oop.g02.p01.klaseObjekti;

class Student {
    String ime;
    int brojIndeksa;
    boolean naBudzetu;
    void stampajPodatke() {
        System.out.println("Име студента је: " + ime
            + ", број индекса је: " + brojIndeksa + "/ На буџету: " + naBudzetu + ".");
    }
}
