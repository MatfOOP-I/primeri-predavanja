package rs.math.oop.g02.p01a.klaseObjekti;

public class Student {
    public String ime;
    public int brojIndeksa;
    public boolean naBudzetu;
    public void stampajPodatke() {
        System.out.println("Име студента је: " + ime
             + ", број индекса је: " + brojIndeksa + " На буџету: " + naBudzetu + ".");
    }
}
