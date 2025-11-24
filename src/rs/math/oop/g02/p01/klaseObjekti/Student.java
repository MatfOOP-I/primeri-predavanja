package rs.math.oop.g02.p01.klaseObjekti;

public class Student {
    
    String ime;
    
    int brojIndeksa;
    
    boolean naBudzetu;
    
    void prikaziSe() {
        System.out.println("Име студента је: " + ime
             + ", број индекса је: " + brojIndeksa + " На буџету: " + naBudzetu + ".");
    }
}
